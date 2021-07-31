package com.example.chatting_and_fun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.chatting_and_fun.R;

import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        loadMe();
    }

    public void loadMe(){
        RequestQueue queue;
        queue= Volley.newRequestQueue(this);

        String url="https://meme-api.herokuapp.com/gimme";
        JsonObjectRequest JsonRequest = new JsonObjectRequest(Request.Method.GET,url
                ,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            String url =response.getString("url");
                            ImageView imageView=findViewById(R.id.memeImage);
                            Glide.with(MainActivity2.this).load(url).into(imageView);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                },
                error -> {

                });
        queue.add(JsonRequest);

    }

    public void shareme (View view){
        Intent I=new Intent(Intent.ACTION_SENDTO);
        I.setType("text/plain");
        startActivity(I);
    }

    public void nextmeme (View view){
        loadMe();
    }
}