package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LoginDemo extends AppCompatActivity {

    public void login(View view){

        Log.i("Info" , "Button Pressed");
        EditText userEditText = findViewById(R.id.editTextTextPassword);
        EditText username = findViewById(R.id.userName);
        Log.i("USernamse" , username.getText().toString());
        Log.i("Passowrd" , userEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_demo);
    }
}