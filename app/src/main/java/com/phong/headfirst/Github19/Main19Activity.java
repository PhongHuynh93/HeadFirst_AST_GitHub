package com.phong.headfirst.Github19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.phong.headfirst.R;

public class Main19Activity extends AppCompatActivity implements View.OnTouchListener, View.OnDragListener {

    private String TAG = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        findViewById(R.id.textView1).setOnTouchListener(this);
        findViewById(R.id.pinkLayout).setOnDragListener(this);
        findViewById(R.id.yellowLayout).setOnDragListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(null, shadowBuilder, v, 0);
            v.setVisibility(View.INVISIBLE);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean onDrag(View v, DragEvent event) {
        int action = event.getAction();
        switch (action) {
            case DragEvent.ACTION_DRAG_STARTED:
                Log.d(TAG, "onDrag: Drag event started");
                break;
            case DragEvent.ACTION_DRAG_ENTERED:
                Log.d(TAG, "onDrag: Drag event entered into " + v.toString());
                break;
            case DragEvent.ACTION_DRAG_EXITED:
                Log.d(TAG, "onDrag: Drag event exited from " + v.toString());
                break;
            case DragEvent.ACTION_DROP:
                Log.d(TAG, "onDrag: Dropped");
                View draggableview = (View) event.getLocalState();
                ViewGroup owner = (ViewGroup) draggableview.getParent();
                owner.removeView(draggableview);
                LinearLayout container = (LinearLayout) v;
                container.addView(draggableview);
                draggableview.setVisibility(View.VISIBLE);
                break;
            case DragEvent.ACTION_DRAG_ENDED:
                Log.d(TAG, "onDrag: Drag event started");
                break;
            default:
                break;

        }
        return true;
    }
}
