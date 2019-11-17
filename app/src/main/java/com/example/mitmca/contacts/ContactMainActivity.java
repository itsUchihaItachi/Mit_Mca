package com.example.mitmca.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.mitmca.DataItem;
import com.example.mitmca.R;
import com.example.mitmca.paper.PaperMainActivity;

import java.util.ArrayList;

public class ContactMainActivity extends AppCompatActivity {

    public static void start(Context context){
        Intent i=new Intent(context, ContactMainActivity.class);
        context.startActivity(i);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_main);
        setupRecyclerView();
    }

    private void setupRecyclerView(){
        ArrayList<ContactDataItem> dataList = new ArrayList<>();
        dataList.add(new ContactDataItem(R.drawable.contact, "Person 1"));
        dataList.add(new ContactDataItem(R.drawable.contact, "Person 2"));
        dataList.add(new ContactDataItem(R.drawable.contact, "Person 3"));
        dataList.add(new ContactDataItem(R.drawable.contact, "Person 4"));

        RecyclerView rv = findViewById(R.id.contact_recycler_view);
        ContactRecyclerDataAdapter adapter = new ContactRecyclerDataAdapter(dataList);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager());
    }

}
