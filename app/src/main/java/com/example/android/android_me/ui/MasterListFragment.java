package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * Created by SPIRIT on 02/02/2018.
 */

public class MasterListFragment extends Fragment {

    public MasterListFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        GridView gridView = (GridView) rootView.findViewById(R.id.id_master_list);

        MasterListAdapter adapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());

        gridView.setAdapter(adapter);

        return rootView;
    }
}
