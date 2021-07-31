package com.example.chatting_and_fun;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Dialog profiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profiles = new Dialog(this);
        ArrayList<chats> chats = new ArrayList<chats>();
        chats.add(new chats("Madara", "Fuck You", R.drawable.madara));
        chats.add(new chats("Pain", "Fuck You", R.drawable.pain));
        chats.add(new chats("Tobi", "Fuck You", R.drawable.tobi));
        chats.add(new chats("Itachi", "Fuck You", R.drawable.itachi));
        chats.add(new chats("Hidan", "Fuck You", R.drawable.hidan));
        chats.add(new chats("Konan", "Fuck You", R.drawable.konan));
        chats.add(new chats("Kakuzu", "Fuck You", R.drawable.kakuzu));
        chats.add(new chats("Kisame", "Fuck You", R.drawable.kisamee));
        chats.add(new chats("Sasori", "Fuck You", R.drawable.sasuri));
        chats.add(new chats("Diedara", "Fuck You", R.drawable.diedara));
        chatmain Adapter = new chatmain(this, chats);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
        ImageButton cam = (ImageButton) findViewById(R.id.button3);
        cam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(Intent);
            }
        });
    }

    public void memes(View view) {
        Intent memes = new Intent(MainActivity.this, com.example.chatting_and_fun.MainActivity2.class);
        startActivity(memes);
    }

    public void profile(View view) {
        profiles.setContentView(R.layout.profile);
        TextView txtView = (TextView) profiles.findViewById(R.id.name);
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        profiles.show();

    }

    public void chats(View view) {
        Intent chat = new Intent(MainActivity.this, com.example.chatting_and_fun.MainActivity3.class);
        startActivity(chat);
    }

    public void status(View view) {
        Intent stat = new Intent(MainActivity.this, status.class);
        startActivity(stat);
    }

    public void contact(View view) {
        Intent cont = new Intent(MainActivity.this, status.class);
        startActivity(cont);
    }


}