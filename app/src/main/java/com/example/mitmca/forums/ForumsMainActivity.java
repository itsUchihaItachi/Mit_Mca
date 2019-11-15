package com.example.mitmca.forums;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.mitmca.R;
import com.example.mitmca.paper.PaperMainActivity;

public class ForumsMainActivity extends AppCompatActivity {

    public static void start(Context context){
        Intent i=new Intent(context, ForumsMainActivity.class);
        context.startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forums_main);
    }
}
