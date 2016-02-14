package com.phong.headfirst.Github20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.phong.headfirst.R;

public class Main20Activity extends AppCompatActivity {

    private static final String VALUE = "myValue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
    }

    public void startNewActivity(View view) {
        Intent intent = new Intent(this, Main20ActivitySecond.class);
        intent.putExtra(VALUE, "My custom string value");
        startActivity(intent);
    }
}
