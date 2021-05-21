package com.parmu.bhagvadgita.fragments;

import android.Manifest;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagvadgita.misc.RequestPermissions;
import com.parmu.bhagvadgita.misc.ShareAsBitmap;

import java.io.IOException;
import java.util.Random;

public class SlokaPagerFragment extends Fragment {

    private Context context;
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private FloatingActionButton fabPlayBtn;
    private boolean fileExist;
    private String fileName;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    public SlokaPagerFragment() {
        // Required empty public constructor
    }

    public static SlokaPagerFragment newInstance(String param1, String param2) {
        SlokaPagerFragment fragment = new SlokaPagerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
        context= getActivity();
        requestPermissions = new RequestPermissions();
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_1, container, false);
        tvSanskrit = view.findViewById(R.id.sanskrit_1);
        tvBhavarth = view.findViewById(R.id.bhavarth_1);
        fabPlayBtn = view.findViewById(R.id.fabplaysound);

        assert getArguments() != null;
        tvSanskrit.setText(getArguments().getString("sanskrit"));
        tvBhavarth.setText(getArguments().getString("bhavarth"));
        fileExist = getArguments().getBoolean("fileexist");
        fileName = getArguments().getString("filename");
        checkIfFileExist();

        fabPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ClassForCombinedMediaPlayer.playDisSound(context,fileName,fabPlayBtn);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
               }
        });
        return view;

    }
//
//
//    @Override
//    public void onCreateOptionsMenu(@NonNull Menu menu, MenuInflater inflater) {
//        inflater.inflate(R.menu.app_bar_menu_1, menu);
//        Log.e("OnCreateOptionsMenu", "option menu created");
//        super.onCreateOptionsMenu(menu, inflater);
//    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());

            int random = new Random().nextInt(100);
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(), tvSanskrit,tvBhavarth,"अध्याय 1","c1_"+ random);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.onOptionsItemSelected(item);
    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}
