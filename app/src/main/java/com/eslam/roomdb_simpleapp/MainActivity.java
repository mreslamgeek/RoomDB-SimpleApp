package com.eslam.roomdb_simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PostDatabase postDatabase = PostDatabase.getInstance(this);
        postDatabase.dao().insertPost(new Post(5 , "MyPost" , "The First Post For me "));

    }
}