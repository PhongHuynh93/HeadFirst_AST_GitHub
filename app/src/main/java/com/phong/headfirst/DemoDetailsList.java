package com.phong.headfirst;

import com.phong.headfirst.AST0.Bg_imagebutton;
import com.phong.headfirst.HF3.HF_2;
import com.phong.headfirst.HF4.HF_4;
import com.phong.headfirst.HF5.HF_5;
import com.phong.headfirst.HF6.TopLevelActivity;
import com.phong.headfirst.HF7.Main2Activity;

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
            new DemoDetails(R.string.AST0_label, R.string.AST0_description, Bg_imagebutton.class)
    };
}
