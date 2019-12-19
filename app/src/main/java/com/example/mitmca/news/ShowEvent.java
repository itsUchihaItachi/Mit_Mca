package com.example.mitmca.news;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mitmca.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ShowEvent extends AppCompatActivity {
    public static void start(Context context){
        Intent i=new Intent(context, ShowEvent.class);
        context.startActivity(i);
    }

    private Spinner spinner;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_show_event);
        spinner = findViewById(R.id.spinner);


        databaseReference = FirebaseDatabase.getInstance().getReference("/");
        // Log.d("bla", String.valueOf(databaseReference));

        Query query = databaseReference.orderByChild("Events");

        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                final List<String> eventlist = new ArrayList<>();

                for (DataSnapshot ds : dataSnapshot.child("Events").getChildren()) {
                    eventlist.add(ds.getKey());
                }

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, eventlist);
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(arrayAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(ShowEvent.this, databaseError.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Log.d("POS", String.valueOf(position));
                String text = spinner.getSelectedItem().toString();
                Log.d("VOS", text);
                Intent i = new Intent(getApplicationContext(), ShowEventsDb.class).putExtra("VOS", text);
                startActivity(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
