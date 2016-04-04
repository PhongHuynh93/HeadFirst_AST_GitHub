package com.phong.headfirst;

import android.app.Notification;
import android.graphics.Camera;
import android.support.v7.widget.RecyclerView;

import com.phong.headfirst.AST0.Bg_imagebutton;
import com.phong.headfirst.AST2.LinearLayout_Userinput_Toasts;
import com.phong.headfirst.AST3.ListView_ListAdapter;
import com.phong.headfirst.AST3.ListView_ListAdapter_test;
import com.phong.headfirst.GitHub0.LayImageTuGoogle;
import com.phong.headfirst.GitHub1.Camera_intent;
import com.phong.headfirst.GitHub2.Video_Intent;
import com.phong.headfirst.GitHub3.Merry_christmas;
import com.phong.headfirst.Github11.Main11Activity;
import com.phong.headfirst.Github12.Main12Activity;
import com.phong.headfirst.Github13.Main13Activity;
import com.phong.headfirst.Github14.Main14Activity;
import com.phong.headfirst.Github15.Main15Activity;
import com.phong.headfirst.Github16.Main16Activity;
import com.phong.headfirst.Github17.Main17Activity;
import com.phong.headfirst.Github18.Main18Activity;
import com.phong.headfirst.Github19.Main19Activity;
import com.phong.headfirst.Github20.Main20Activity;
import com.phong.headfirst.Github22.Main6Activity;
import com.phong.headfirst.Github23.Main23Activity;
import com.phong.headfirst.Github24.Main24Activity;
import com.phong.headfirst.Github25.Main25Activity;
import com.phong.headfirst.Github4.Slider_Switch_Button;
import com.phong.headfirst.Github4.Slider_Switch_test;
import com.phong.headfirst.Github7.RecyclerViewDemoActivity;
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
import com.phong.headfirst.HMK6.SignupSignin;
import com.phong.headfirst.HMK7.Social_network_signin;

/**
 * Created by huynhducthanhphong on 12/28/15.
 */
public final class DemoDetailsList {
    private DemoDetailsList() {

    }

    public static final DemoDetails[] DEMOS = {
            new DemoDetails(R.string.hf_3_label, R.string.hf_3_description, HF_2.class),
            new DemoDetails(R.string.hf_4_label, R.string.hf_4_description, HF_4.class),
            new DemoDetails( R.string.hf_5_label, R.string.hf_5_description, HF_5.class),
            new DemoDetails(R.string.hf_6_label, R.string.hf_6_description, TopLevelActivity.class),
            new DemoDetails(R.string.hf_7_label, R.string.hf_7_description, Main2Activity.class),
            new DemoDetails(R.string.hf_8_label, R.string.hf_8_description, Main3Activity.class),
            new DemoDetails(R.string.hf_9_label, R.string.hf_9_description, Action_Bar.class),
            new DemoDetails(R.string.hf_11_label, R.string.hf_11_description, com.phong.headfirst.HF11.TopLevelActivity.class),
            new DemoDetails(R.string.hf_13_label, R.string.hf_13_description, com.phong.headfirst.HF13.Main13Activity.class),
            new DemoDetails(R.string.AST0_label, R.string.AST0_description, Bg_imagebutton.class),
            new DemoDetails(R.string.AST2_label, R.string.AST2_description, LinearLayout_Userinput_Toasts.class),
            new DemoDetails(R.string.AST3_label, R.string.AST3_description, ListView_ListAdapter_test.class),
            new DemoDetails(R.string.Github_label, R.string.Github_description, LayImageTuGoogle.class),
            new DemoDetails(R.string.Github_1_label, R.string.Github_1_description, Camera_intent.class),
            new DemoDetails(R.string.Github_2_label, R.string.Github_2_description, Video_Intent.class),
            new DemoDetails(R.string.Github_3_label, R.string.Github_3_description, Merry_christmas.class),
            new DemoDetails(R.string.Github_4_label, R.string.Github_4_description, Slider_Switch_Button.class),
            new DemoDetails(R.string.Github_5_label, R.string.Github_5_description, Slider_Switch_Button.class),
            new DemoDetails(R.string.Github_7_label, R.string.Github_7_description, RecyclerViewDemoActivity.class),
            new DemoDetails(R.string.Github_11_label, R.string.Github_11_description, Main11Activity.class),
            new DemoDetails(R.string.Github_12_label, R.string.Github_12_description, Main12Activity.class),
            new DemoDetails(R.string.Github_13_label, R.string.Github_13_description, Main13Activity.class),
            new DemoDetails(R.string.Github_14_label, R.string.Github_14_description, Main14Activity.class),
            new DemoDetails(R.string.Github_15_label, R.string.Github_15_description, Main15Activity.class),
            new DemoDetails(R.string.Github_16_label, R.string.Github_16_description, Main16Activity.class),
            new DemoDetails(R.string.Github_17_label, R.string.Github_17_description, Main17Activity.class),
            new DemoDetails(R.string.Github_18_label, R.string.Github_18_description, Main18Activity.class),
            new DemoDetails(R.string.Github_19_label, R.string.Github_19_description, Main19Activity.class),
            new DemoDetails(R.string.Github_20_label, R.string.Github_20_description, Main20Activity.class),
            new DemoDetails(R.string.Github_22_label, R.string.Github_22_description, Main6Activity.class),
            new DemoDetails(R.string.Github_23_label, R.string.Github_23_description, Main23Activity.class),
            new DemoDetails(R.string.Github_24_label, R.string.Github_24_description, Main24Activity.class),
            new DemoDetails(R.string.Github_25_label, R.string.Github_25_description, Main25Activity.class),
            new DemoDetails(R.string.HMK_1_label, R.string.HMK_1_description, Test_Material_Design.class),
            new DemoDetails(R.string.HMK_2_label, R.string.HMK_2_description, TextInputLayout.class),
            new DemoDetails(R.string.HMK_3_label, R.string.HMK_3_description, Location_google.class),
            new DemoDetails(R.string.HMK_4_label, R.string.HMK_4_description, WhatsApp.class),
            new DemoDetails(R.string.HMK_5_label, R.string.HMK_5_description, com.phong.headfirst.HMK5.RecyclerView.class),
            new DemoDetails(R.string.HMK_6_label, R.string.HMK_6_description, SignupSignin.class),
            new DemoDetails(R.string.HMK_7_label, R.string.HMK_7_description, Social_network_signin.class),
    };
}
