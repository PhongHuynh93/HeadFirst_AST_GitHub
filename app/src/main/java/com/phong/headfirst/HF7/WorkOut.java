package com.phong.headfirst.HF7;

/**
 * Created by huynhducthanhphong on 1/2/16.
 */
public class WorkOut {
    private String name;
    private String description;

    public static final WorkOut[] workouts = {
            new WorkOut("The Limb Loosener", "5 Handstand push-ups\n10 ..."),
            new WorkOut("Core Agony", "5 Handstand push-ups\n10 ..."),
            new WorkOut("The Wimp Special", "5 Handstand push-ups\n10 ..."),
            new WorkOut("Strength and Length", "5 Handstand push-ups\n10 ...")
    };

    private WorkOut(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
