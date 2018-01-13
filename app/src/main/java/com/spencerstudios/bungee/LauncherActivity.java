package com.spencerstudios.bungee;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class LauncherActivity extends AppCompatActivity  implements View.OnClickListener{

    private static final String LOG_TAG = LauncherActivity.class.getSimpleName();
    private Context mContext = this;
    private Intent mIntent; //This will start Activity transaction and Bungee animation will follow

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        mIntent = new Intent (this, DetailActivity.class);
        //Initialize views
        findViewById(R.id.slideLeft).setOnClickListener(this);
        findViewById(R.id.slideRight).setOnClickListener(this);
        findViewById(R.id.slideUp).setOnClickListener(this);
        findViewById(R.id.slideDown).setOnClickListener(this);
        findViewById(R.id.zoom).setOnClickListener(this);
        findViewById(R.id.fade).setOnClickListener(this);
        findViewById(R.id.spin).setOnClickListener(this);
        findViewById(R.id.windmill).setOnClickListener(this);
        findViewById(R.id.diagonal).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Start activity transaction
        Log.i(LOG_TAG, "onClick");
        startActivity(mIntent);

        switch(v.getId()) {
            case R.id.slideLeft:
                Bungee.slideLeft(mContext);
                break;
            case R.id.slideRight:
                Bungee.slideRight(mContext);
                break;
            case R.id.slideUp:
                Bungee.slideUp(mContext);
                break;
            case R.id.slideDown:
                Bungee.slideDown(mContext);
                break;
            case R.id.zoom:
                Bungee.zoom(mContext);
                break;
            case R.id.fade:
                Bungee.fade(mContext);
                break;
            case R.id.spin:
                Bungee.spin(mContext);
                break;
            case R.id.diagonal:
                Bungee.diagonal(mContext);
                break;
            case R.id.windmill:
                Bungee.windmill(mContext);
                break;
        }
    }
}
