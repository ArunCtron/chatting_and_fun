package com.example.chatting_and_fun;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.chatting_and_fun.R;
import java.util.ArrayList;

public class chatmain extends ArrayAdapter<chats> {

    private static final String LOG_TAG = chatmain.class.getSimpleName();
    public chatmain(Activity context, ArrayList<chats> chats) {
        super(context, 0, chats);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.contents, parent, false);
        }

        chats currentchat= getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text1);
        nameTextView.setText(currentchat.getName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.text2);
        numberTextView.setText(currentchat.getMessage());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.profile);
        iconView.setImageResource(currentchat.getImageResourceId());


        return listItemView;
    }
}