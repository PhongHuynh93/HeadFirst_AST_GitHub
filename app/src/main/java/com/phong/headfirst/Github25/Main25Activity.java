package com.phong.headfirst.Github25;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.phong.headfirst.R;

public class Main25Activity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        mMediaPlayer = MediaPlayer.create(this, R.raw.chuabaogio);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMediaPlayer.release();
    }

    public void playMusic(View view) {
        mMediaPlayer.start();
    }
}
