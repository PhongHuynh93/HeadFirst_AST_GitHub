package com.phong.headfirst.Github13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.RelativeLayout;

import com.phong.headfirst.R;

public class Main13Activity extends AppCompatActivity {
    RelativeLayout r1;
    AutoCompleteTextView auto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        String str[]={"Arun","Mathev","Vishnu","Vishal","Arjun",
                "Arul","Balaji","Babu","Boopathy","Godwin","Nagaraj"};

        r1 =  (RelativeLayout) findViewById(R.id.r1);
        auto = new AutoCompleteTextView(this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams((int) RelativeLayout.LayoutParams.WRAP_CONTENT, (int) RelativeLayout.LayoutParams.WRAP_CONTENT);

        params.leftMargin = 80;
        params.topMargin = 130;

        auto.setLayoutParams(params);
        auto.setEms(10);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,str);
        auto.setThreshold(1);
        auto.setAdapter(adp);

        r1.addView(auto);
    }
}
