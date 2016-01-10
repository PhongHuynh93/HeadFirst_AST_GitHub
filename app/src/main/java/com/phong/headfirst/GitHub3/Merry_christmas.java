package com.phong.headfirst.GitHub3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.phong.headfirst.R;

public class Merry_christmas extends AppCompatActivity {
    RelativeLayout mh;

    // khai bao nhạc nền
    MediaPlayer song;

    ImageView imgvMiuLe;

    public void AnhXa() {
        mh = (RelativeLayout) findViewById(R.id.manHinh);
        imgvMiuLe = (ImageView) findViewById(R.id.imageViewMiule);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.github_merry_christmas);

        AnhXa();

        // Background
        mh.setBackgroundResource(R.drawable.bg1);

        // Nhạc nền
        song = MediaPlayer.create(this, R.raw.wewishyouamerrychristmas);
        song.start();

        // Hiệu ứng hình
        Animation f = AnimationUtils.loadAnimation(this, R.anim.fade);
        f.reset();
        imgvMiuLe.clearAnimation();
        imgvMiuLe.startAnimation(f);

        imgvMiuLe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // mở màn hình music
                Intent mhMusic = new Intent(getApplicationContext(), Music.class);
                startActivity(mhMusic);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_merry_christmas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
