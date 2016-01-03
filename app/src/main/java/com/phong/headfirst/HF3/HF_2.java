package com.phong.headfirst.HF3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.phong.headfirst.R;

public class HF_2 extends AppCompatActivity {

    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hf_2);

        button = (Button)findViewById(R.id.send);
        editText = (EditText)findViewById(R.id.message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hf_2, menu);
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

    public void onSendMessage(View view) {
        String value = editText.getText().toString();

        // explicit intent
//        Intent intent = new Intent(this, Main2Activity.class);
//        intent.putExtra(Main2Activity.EXTRA_MESSAGE, value);

        // implicit intent, có TH nếu chọn 1 làn thi always chọn
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT, value);
//
//        startActivity(intent);

        // chooser, lúc nào cũng bắt chọn, ko có TH always
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, value);

        String chooserTitle = getString(R.string.chooser);
        Intent choosenIntent = Intent.createChooser(intent, chooserTitle);

        startActivity(choosenIntent);
    }
}
