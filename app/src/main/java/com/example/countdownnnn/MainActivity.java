package com.example.countdownnnn;


import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView txtDay, txtHour, txtMinute, txtSecond;
    private TextView tvEventStart;
    private Handler handler;
    private Runnable runnable;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDay = findViewById(R.id.txtDay);
        txtHour = findViewById(R.id.txtHour);
        txtMinute = findViewById(R.id.txtMinute);
        txtSecond = findViewById(R.id.txtSecond);
        tvEventStart = findViewById(R.id.tveventStart);

        countDownStart();
    }

    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "yyyy-MM-dd");
                    // Please here set your event date//YYYY-MM-DD
                    Date futureDate = dateFormat.parse("2020-01-01");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        txtDay.setText("" + String.format("%02d", days));
                        txtHour.setText("" + String.format("%02d", hours));
                        txtMinute.setText(""
                                + String.format("%02d", minutes));
                        txtSecond.setText(""
                                + String.format("%02d", seconds));
                    } else {
                        tvEventStart.setVisibility(View.VISIBLE);
                        tvEventStart.setText("The event started!");
                        textViewGone();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }

    public void textViewGone() {
        findViewById(R.id.LinearLayout1).setVisibility(View.GONE);
        findViewById(R.id.LinearLayout2).setVisibility(View.GONE);
        findViewById(R.id.LinearLayout3).setVisibility(View.GONE);
        findViewById(R.id.LinearLayout4).setVisibility(View.GONE);
        findViewById(R.id.textViewheader1).setVisibility(View.GONE);
        findViewById(R.id.textViewheader2).setVisibility(View.GONE);
    }
}