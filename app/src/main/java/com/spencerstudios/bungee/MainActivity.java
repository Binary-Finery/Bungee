package com.spencerstudios.bungee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivity(View v){
        startActivity(new Intent(this,SecondActivity.class));
        Bungee.swipeRight(this);
    }
}