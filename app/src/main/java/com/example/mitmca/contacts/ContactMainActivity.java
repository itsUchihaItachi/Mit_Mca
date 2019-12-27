package com.example.mitmca.contacts;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mitmca.R;
import com.example.mitmca.links.LinksHome;

public class ContactMainActivity extends AppCompatActivity {

    public static void start(Context context){
        Intent i=new Intent(context, ContactMainActivity.class);
        context.startActivity(i);
    }

    ListView contactlistView;
    String mTitle[] = {"Dean","Hos","Hod","Office","Programme head"};
    String mDescription[] = {"1234567890", "1472583690", "3692581470", "7894561230", "1478520369"};
    int images[] = {R.drawable.contact1,R.drawable.contact1,R.drawable.contact1,R.drawable.contact1,R.drawable.contact1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_main);

        contactlistView = findViewById(R.id.contactListView);

        MyAdapter contactAdapter = new MyAdapter(this, mTitle, mDescription, images);
        contactlistView.setAdapter(contactAdapter);

        contactlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Toast.makeText(ContactMainActivity.this ,"Dean Som", Toast.LENGTH_SHORT).show();
                }

                if(position == 1){
                    Toast.makeText(ContactMainActivity.this ,"HoS Som", Toast.LENGTH_SHORT).show();
                }

                if(position == 2){
                    Toast.makeText(ContactMainActivity.this ,"HoD Som", Toast.LENGTH_SHORT).show();
                }

                if(position == 3){
                    Toast.makeText(ContactMainActivity.this ,"Office Som", Toast.LENGTH_SHORT).show();
                }

                if(position == 4){
                    Toast.makeText(ContactMainActivity.this ,"program Som", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String description[];
        int img[];

        MyAdapter(Context c, String title[], String desc[], int imgs[]){
            super(c, R.layout.contactrow, R.id.contactMainText,title);
            this.context=c;
            this.rTitle =title;
            this.description = desc;
            this.img = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater contactlayoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View contactRow = contactlayoutInflater.inflate(R.layout.contactrow, parent, false);
            ImageView imageView = contactRow.findViewById(R.id.contactIcon);
            TextView myTitle = contactRow.findViewById(R.id.contactMainText);
            TextView myDesc = contactRow.findViewById(R.id.contactSubText);

            imageView.setImageResource(img[position]);
            myTitle.setText(rTitle[position]);
            myDesc.setText(description[position]);

            return contactRow;
        }
    }
}
