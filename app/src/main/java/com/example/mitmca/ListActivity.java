package com.example.mitmca;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private List<learnLanguages> availLang= new ArrayList<learnLanguages>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

       availLang.add(new learnLanguages("HTML",R.mipmap.ic_launcher,40)) ;
        availLang.add(new learnLanguages("CSS",R.mipmap.ic_launcher,45)) ;
        availLang.add(new learnLanguages("JAVASCRIPT",R.mipmap.ic_launcher,42)) ;
        availLang.add(new learnLanguages("PYTHON",R.mipmap.ic_launcher,41)) ;
        availLang.add(new learnLanguages("DUH",R.mipmap.ic_launcher,9)) ;

        ArrayAdapter<learnLanguages> adapter = new customAdapter();
        ListView myFirstListView = (ListView)(findViewById(R.id.myFirstListView));
        myFirstListView.setAdapter(adapter);
    }
    public class customAdapter extends ArrayAdapter<learnLanguages>{
        public customAdapter() {
            super(ListActivity.this,R.layout.my_layout,availLang);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            if(convertView == null){
                convertView=getLayoutInflater().inflate(R.layout.my_layout,parent,false);
            }

            learnLanguages myCurrentLang= availLang.get(position);
             ImageView myImg =(ImageView) convertView.findViewById(R.id.leftIco);
            TextView myHeading = (TextView)convertView.findViewById(R.id.editText);
            TextView myDesc = (TextView)convertView.findViewById(R.id.textView);

            myImg.setImageResource(myCurrentLang.getImageID());
            myHeading.setText(myCurrentLang.getNameofLang());
            myDesc.setText(String.valueOf((myCurrentLang.getTutorialNumber())));


            return convertView;
        }
    }

}
