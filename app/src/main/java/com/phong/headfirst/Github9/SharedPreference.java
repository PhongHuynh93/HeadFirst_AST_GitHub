package com.phong.headfirst.Github9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.phong.headfirst.R;

public class SharedPreference extends AppCompatActivity {

    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private TextView mName;
    private TextView mEmail;
    public static final String MYPREFERENCE = "mypref";
    private SharedPreferences mSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mName = (TextView)findViewById(R.id.textview_name);
        mEmail = (TextView)findViewById(R.id.textview_email);

        mSharedPreferences = getSharedPreferences(MYPREFERENCE, Context.MODE_PRIVATE);

        if (mSharedPreferences.contains(NAME)) {
            mName.setText(mSharedPreferences.getString(NAME, ""));
        }
        if (mSharedPreferences.contains(EMAIL)) {
            mName.setText(mSharedPreferences.getString(EMAIL, ""));
        }
    }


    public void onClickSave(View view) {
        String name = mName.getText().toString();
        String email = mEmail.getText().toString();
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(NAME, name);
        editor.putString(EMAIL, email);
        editor.commit();
    }

    public void onClickGet(View view) {

    }

    public void onClickClear(View view) {
    }
}
