package com.example.mitmca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LoginActivity extends AppCompatActivity {
    //myDB=new DatabaseHelper(this);
    // DatabaseHelper myDB;
    EditText username;
    EditText password;
    FloatingActionButton floatingAction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username= findViewById(R.id.erpEditText);
        password= findViewById(R.id.passwordEditText);
        floatingAction = findViewById(R.id.floatingActionButton);

        floatingAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });
    }

    void validate()
    {
       String u= username.getText().toString();
       String p= password.getText().toString();
       if(u=="sanket" && p=="password")
       {
           Toast t=Toast.makeText(this,"Login successful",Toast.LENGTH_LONG);
       }

    }

}
