package com.example.chatting_and_fun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.example.chatting_and_fun.R;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    ListView listView;
    ImageButton send2;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView=findViewById(R.id.chatList);
        send2 = (findViewById(R.id.send1));
        text = findViewById(R.id.chat);
        arrayList= new ArrayList<String>();
        arrayAdapter= new ArrayAdapter<String>(MainActivity3.this, R.layout.activity_main3, arrayList);
        listView.setAdapter(arrayAdapter);
        send();

    }
    public void send() {
        send2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = text.getText().toString();
                arrayList.add(name);
                arrayAdapter.notifyDataSetChanged();

            }
        });
    }
}
