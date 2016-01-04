package com.phong.headfirst;

import android.graphics.Camera;

import com.phong.headfirst.AST0.Bg_imagebutton;
import com.phong.headfirst.AST2.LinearLayout_Userinput_Toasts;
import com.phong.headfirst.GitHub0.LayImageTuGoogle;
import com.phong.headfirst.GitHub1.Camera_intent;
import com.phong.headfirst.HF3.HF_2;
import com.phong.headfirst.HF4.HF_4;
import com.phong.headfirst.HF5.HF_5;
import com.phong.headfirst.HF5.LinearLayout;
import com.phong.headfirst.HF6.TopLevelActivity;
import com.phong.headfirst.HF7.Main2Activity;
import com.phong.headfirst.HF8.Main3Activity;

/**
 * Created by huynhducthanhphong on 12/28/15.
 */
public final class DemoDetailsList {
    private DemoDetailsList() {

    }

    public static final DemoDetails[] DEMOS = {
            new DemoDetails(R.string.hf_3_label, R.string.hf_3_description, HF_2.class),
            new DemoDetails(R.string.hf_4_label, R.string.hf_4_description, HF_4.class),
            new DemoDetails(R.string.hf_5_label, R.string.hf_5_description, HF_5.class),
            new DemoDetails(R.string.hf_6_label, R.string.hf_6_description, TopLevelActivity.class),
            new DemoDetails(R.string.hf_7_label, R.string.hf_7_description, Main2Activity.class),
            new DemoDetails(R.string.hf_8_label, R.string.hf_8_description, Main3Activity.class),
            new DemoDetails(R.string.AST0_label, R.string.AST0_description, Bg_imagebutton.class),
            new DemoDetails(R.string.AST2_label, R.string.AST2_description, LinearLayout_Userinput_Toasts.class),
            new DemoDetails(R.string.Github_label, R.string.Github_description, LayImageTuGoogle.class),
            new DemoDetails(R.string.Github_1_label, R.string.Github_1_description, Camera_intent.class),
    };
}
