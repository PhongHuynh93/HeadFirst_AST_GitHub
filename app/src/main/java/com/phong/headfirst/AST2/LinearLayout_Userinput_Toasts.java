package com.phong.headfirst.AST2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.phong.headfirst.R;

public class LinearLayout_Userinput_Toasts extends AppCompatActivity {

    private Button answerYesButton;
    private Button answerNoButton;
    private EditText usersNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.as2_linear_layout__userinput__toasts);

        answerYesButton = (Button) findViewById(R.id.answerYesButton);
        answerNoButton = (Button) findViewById(R.id.answerNoButton);
        usersNameEditText = (EditText) findViewById(R.id.name);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_linear_layout__userinput__toasts, menu);
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

    public void onYesButtonClick(View view) {
        String usersName = String.valueOf(usersNameEditText.getText());
        String yourYesResponse = "That is great " + usersName;
        Toast.makeText(LinearLayout_Userinput_Toasts.this, yourYesResponse, Toast.LENGTH_SHORT).show();
    }

    public void onNoButtonClick(View view) {
        String usersName = String.valueOf(usersNameEditText.getText());
        String yourNoResponse = "To bad " + usersName;
        Toast.makeText(LinearLayout_Userinput_Toasts.this, yourNoResponse, Toast.LENGTH_SHORT).show();
    }
}
