package com.example.mitmca.links;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mitmca.R;
import com.example.mitmca.paper.PaperMainActivity;

import java.util.ArrayList;
import java.util.List;

public class LinksHome extends AppCompatActivity {

    public static void start(Context context){
        Intent i=new Intent(context, LinksHome.class);
        context.startActivity(i);
    }


    private List<linkList> availList = new ArrayList<linkList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links_home);

        availList.add(new linkList("Under-Graduate Programmes","https://mitwpu.edu.in/ug-programmes/"));
        availList.add(new linkList("Post-Graduate Programmes","https://mitwpu.edu.in/pg-programmes/"));

        ArrayAdapter<linkList> adapter =new customAdapter();

        ListView myFirstListView = (ListView) (findViewById(R.id.myFirstListView));

        myFirstListView.setAdapter(adapter);


           // ListView myFirstListView = (ListView) (findViewById(R.id.myFirstListView));
            myFirstListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    //Toast.makeText(LinksHome.this,"MY THind",Toast.LENGTH_LONG).show();
                    linkList myCurrentList = availList.get(position);
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(myCurrentList.getUrl()));
                    startActivity(i);
                }
            });


    }
    private class customAdapter extends ArrayAdapter<linkList>{
        public customAdapter() {
            super(LinksHome.this, R.layout.my_layout,availList);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            if(convertView==null) {
                convertView = getLayoutInflater().inflate(R.layout.my_layout, parent,false);
            }
            linkList myCurrentList = availList.get(position);

            TextView myName= (TextView)convertView.findViewById(R.id.name);
//            TextView myHeading= (TextView)convertView.findViewById(R.id.heading);
       //TextView myUrl= (TextView)convertView.findViewById(R.id.url);

            myName.setText(myCurrentList.getNameOfLink());
           // myHeading.setText(myCurrentList.getDescription());
            //myUrl.setText(myCurrentList.getUrl());

            return convertView;
        }
    }
}
