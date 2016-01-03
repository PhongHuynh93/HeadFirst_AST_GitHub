package com.phong.headfirst.HF7;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.phong.headfirst.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {
    private WorkoutListListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // tạo adapter để lấy data từ class khác
        String[] names = new String[WorkOut.workouts.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = WorkOut.workouts[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names
        );

        setListAdapter(adapter);
        // goi super class cho nó tự tạo list
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    static interface WorkoutListListener {
        void itemClicked(long id);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (WorkoutListListener)activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}
