package com.spencerstudios.bungee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import spencerstudios.com.bungeelib.Bungee;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void onBackPressed() {
        Bungee.diagonal(this);
        super.onBackPressed();
    }
}
