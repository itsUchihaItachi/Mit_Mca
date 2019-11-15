package com.example.mitmca.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.mitmca.R;
import com.example.mitmca.paper.PaperMainActivity;

public class CalendarMainActivity extends AppCompatActivity {
    public static void start(Context context){
        Intent i=new Intent(context, CalendarMainActivity.class);
        context.startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_main);
    }
}
