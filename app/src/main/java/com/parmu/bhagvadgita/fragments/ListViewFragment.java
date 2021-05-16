package com.parmu.bhagvadgita.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.parmu.bhagvadgita.R;

public class ListViewFragment extends Fragment {

    public ListViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootListViewFrag = inflater.inflate(R.layout.fragment_list_view, container, false);

        return rootListViewFrag;
    }
}