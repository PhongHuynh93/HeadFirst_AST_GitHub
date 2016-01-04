package com.phong.headfirst.GitHub0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.phong.headfirst.R;

/*
Activity lấy image từ GOogle và hiển thị lên máy của ta
 */
public class LayImageTuGoogle extends AppCompatActivity {

    private static final String IMAGE_URL = "https://urpgstatic.com/images/v2/pokemon-login.png";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lay_image_tu_google);

        imageView = (ImageView)findViewById(R.id.imageview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lay_image_tu_google, menu);
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

    public void loadImageBtnClicked(View view) {
        ImageWebService imageWebService = new ImageWebService(this, imageView);
        imageWebService.execute(IMAGE_URL);
    }
}
