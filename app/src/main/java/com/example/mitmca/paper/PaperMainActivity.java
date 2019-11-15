package com.example.mitmca.paper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.mitmca.R;

public class PaperMainActivity extends AppCompatActivity {

    public static void start(Context context){
        Intent i=new Intent(context,PaperMainActivity.class);
        context.startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_main);
    }
}
