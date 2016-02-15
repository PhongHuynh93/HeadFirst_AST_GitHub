package com.phong.headfirst.Github23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.phong.headfirst.R;

public class DetailActivity23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail23);

        TextView textView = (TextView) findViewById(R.id.textview);
        Intent intent = getIntent();
        String text = intent.getExtras().getString(Main23Activity.EXTRA_TEXT);
        textView.setText(text);
    }
}
