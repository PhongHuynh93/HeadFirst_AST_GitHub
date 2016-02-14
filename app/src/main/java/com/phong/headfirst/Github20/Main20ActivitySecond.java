package com.phong.headfirst.Github20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.phong.headfirst.R;

public class Main20ActivitySecond extends AppCompatActivity {
    private static final String VALUE = "myValue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20_activity_second);

        String value = getIntent().getExtras().getString(VALUE);
        Toast.makeText(Main20ActivitySecond.this, value, Toast.LENGTH_SHORT).show();
    }
}
