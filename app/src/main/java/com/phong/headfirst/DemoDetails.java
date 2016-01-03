package com.phong.headfirst;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by huynhducthanhphong on 12/28/15.
 */
public class DemoDetails {

    public final int titleId;
    public final int descriptionId;
    public final Class<? extends AppCompatActivity> activityClass;

    public DemoDetails(int titleId, int descriptionId, Class<? extends AppCompatActivity> activityClass) {
        this.titleId = titleId;
        this.descriptionId = descriptionId;
        this.activityClass = activityClass;
    }


}
