package com.example.mitmca;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LoginActivity extends AppCompatActivity {
     DatabaseHelper myDB;
    EditText username;
    EditText password;
    FloatingActionButton floatingAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myDB=new DatabaseHelper(this);
        username = findViewById(R.id.erpEditText);
        password = findViewById(R.id.passwordEditText);
        floatingAction = findViewById(R.id.floatingActionButton);

        floatingAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = username.getText().toString();
                String pass = password.getText().toString();
                myDB.insert();
                Boolean checkEmailPass = myDB.checkEmail(email, pass);
                if (checkEmailPass == true) {
                    Toast.makeText(getApplicationContext(), "Successful login", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(v.getContext(),HomeActivity.class);
                    intent.putExtra("ename",email);
                    Log.d("Email",email);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_SHORT).show();
                }

            }
        });
        }
    }

