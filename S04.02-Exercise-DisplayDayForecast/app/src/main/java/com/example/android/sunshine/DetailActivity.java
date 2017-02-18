package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textView = (TextView) findViewById(R.id.tv_weather_for_day);
        Intent intent = getIntent();
        if(intent.hasExtra(Intent.EXTRA_TEXT)){
            String weatherString = intent.getStringExtra(Intent.EXTRA_TEXT);
            textView.setText(weatherString);
        }


    }
}