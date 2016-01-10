package com.phong.headfirst.HF8;


import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.phong.headfirst.HF7.WorkOut;
import com.phong.headfirst.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment_Test extends ListFragment {

    private WorkoutListListener listener;

    static interface WorkoutListListener {
        void itemClicked(long id);
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[WorkOut.workouts.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = WorkOut.workouts[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity a = null;
        if (context instanceof Activity) {
            a = (Activity)context;
        }
        this.listener = (WorkoutListListener)a;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}
