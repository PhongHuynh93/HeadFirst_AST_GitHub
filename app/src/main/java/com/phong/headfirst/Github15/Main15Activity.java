package com.phong.headfirst.Github15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.phong.headfirst.R;

public class Main15Activity extends AppCompatActivity {
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (rb != null && checkedId > -1) {
                    Toast.makeText(Main15Activity.this, rb.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onClear(View view) {
        radioGroup.clearCheck();
    }

    public void onSubmit(View view) {
        RadioButton rb = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        Toast.makeText(Main15Activity.this, rb.getText(), Toast.LENGTH_SHORT).show();
    }
}
