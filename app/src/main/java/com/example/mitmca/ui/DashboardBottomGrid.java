package com.example.mitmca.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mitmca.R;

import static com.example.mitmca.R.*;

public class DashboardBottomGrid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_dashboard_bottom_grid);
        String[] myItems = {"Html/css","something","something"};
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, R.layout.list_layout,myItems);
        ListView myFirstListView = (ListView) findViewById(id.ListView);
    myFirstListView.setAdapter(adapter);


    }
}
