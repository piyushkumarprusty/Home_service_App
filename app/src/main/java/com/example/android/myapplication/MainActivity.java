package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.android.myapplication.Adapters.MainAdapter;
import com.example.android.myapplication.Models.MainModel;
import com.example.android.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        MainModel m = new MainModel(R.drawable.car2 ,"tt","12" , "do" );
        list.add(m);

        list.add(new MainModel(R.drawable.car , "screw" , "10" , "This is to repair budget"));
        list.add(new MainModel(R.drawable.car2 , "screw" , "10" , "This is to repair budget"));
        list.add(new MainModel(R.drawable.as , "washing" , "40" , "This is to repair washing macihine"));
        list.add(new MainModel(R.drawable.car2 , "screw" , "10" , "This is to repair budget"));
        list.add(new MainModel(R.drawable.as , "fridge" , "50" , "This is to repair fridge"));


        MainAdapter adapter = new MainAdapter(list ,this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);





    }
}



/*

          Log.i("Info" , "Button Pressed");
        EditText userEditText = findViewById(R.id.editTextTextPassword);
        EditText username = findViewById(R.id.userName);
        // when button is tapped //
        Log.i("Username" , username.getText().toString());
        Log.i("Password" , userEditText.getText().toString());
        Toast.makeText(this, "Hello" + username.getText().toString(), Toast.LENGTH_SHORT).show();



        */