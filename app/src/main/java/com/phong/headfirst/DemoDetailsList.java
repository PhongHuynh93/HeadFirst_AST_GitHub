package com.phong.headfirst;

import android.app.Notification;
import android.graphics.Camera;

import com.phong.headfirst.AST0.Bg_imagebutton;
import com.phong.headfirst.AST2.LinearLayout_Userinput_Toasts;
import com.phong.headfirst.AST3.ListView_ListAdapter;
import com.phong.headfirst.AST3.ListView_ListAdapter_test;
import com.phong.headfirst.GitHub0.LayImageTuGoogle;
import com.phong.headfirst.GitHub1.Camera_intent;
import com.phong.headfirst.GitHub2.Video_Intent;
import com.phong.headfirst.GitHub3.Merry_christmas;
import com.phong.headfirst.Github4.Slider_Switch_Button;
import com.phong.headfirst.Github4.Slider_Switch_test;
import com.phong.headfirst.HF3.HF_2;
import com.phong.headfirst.HF4.HF_4;
import com.phong.headfirst.HF5.HF_5;
import com.phong.headfirst.HF5.LinearLayout;
import com.phong.headfirst.HF6.TopLevelActivity;
import com.phong.headfirst.HF7.Main2Activity;
import com.phong.headfirst.HF8.Main3Activity;
import com.phong.headfirst.HF9.Action_Bar;
import com.phong.headfirst.HMK1.Material_Design;
import com.phong.headfirst.HMK1.Test_Material_Design;
import com.phong.headfirst.HMK2.TextInputLayout;
import com.phong.headfirst.HMK3.Location_google;
import com.phong.headfirst.HMK3.Location_google_test;
import com.phong.headfirst.HMK4.WhatsApp;

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
            new DemoDetails(R.string.hf_9_label, R.string.hf_9_description, Action_Bar.class),
            new DemoDetails(R.string.AST0_label, R.string.AST0_description, Bg_imagebutton.class),
            new DemoDetails(R.string.AST2_label, R.string.AST2_description, LinearLayout_Userinput_Toasts.class),
            new DemoDetails(R.string.AST3_label, R.string.AST3_description, ListView_ListAdapter_test.class),
            new DemoDetails(R.string.Github_label, R.string.Github_description, LayImageTuGoogle.class),
            new DemoDetails(R.string.Github_1_label, R.string.Github_1_description, Camera_intent.class),
            new DemoDetails(R.string.Github_2_label, R.string.Github_2_description, Video_Intent.class),
            new DemoDetails(R.string.Github_3_label, R.string.Github_3_description, Merry_christmas.class),
            new DemoDetails(R.string.Github_4_label, R.string.Github_4_description, Slider_Switch_Button.class),
            new DemoDetails(R.string.Github_5_label, R.string.Github_5_description, Slider_Switch_Button.class),
            new DemoDetails(R.string.HMK_1_label, R.string.HMK_1_description, Test_Material_Design.class),
            new DemoDetails(R.string.HMK_2_label, R.string.HMK_2_description, TextInputLayout.class),
            new DemoDetails(R.string.HMK_3_label, R.string.HMK_3_description, Location_google.class),
            new DemoDetails(R.string.HMK_4_label, R.string.HMK_4_description, WhatsApp.class),
    };
}
