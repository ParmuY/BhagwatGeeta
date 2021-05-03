package com.parmu.bhagwatgeeta.fragments;

import android.Manifest;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.parmu.bhagwatgeeta.activities.Adhyay15_AC15;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay15_AC15.pagePosition15;

public class Fragment15 extends Fragment{
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context15;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions ;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private boolean fileExist;
    private String fileName;
    private FloatingActionButton fabPlayBtn15;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment15() {
        // Required empty public constructor
    }

    public static Fragment15 newInstance(String param1, String param2) {
        Fragment15 fragment = new Fragment15();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        context15= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view15= inflater.inflate(R.layout.fragment_15, container, false);
        tvSanskrit =view15.findViewById(R.id.sanskrit_15);
        tvBhavarth = view15.findViewById(R.id.bhavarth_15);
        constraintLayout =view15.findViewById(R.id.constrained_layout);
        fabPlayBtn15 = view15.findViewById(R.id.fabplaysound15);

        fileExist = getArguments().getBoolean("fileexist15");
        fileName =getArguments().getString("filename15");
        tvSanskrit.setText(getArguments().getString("sanskrit15"));
        tvBhavarth.setText(getArguments().getString("bhavarth15"));
        checkIfFileExist();

        fabPlayBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay15_AC15.pageGetPosition15();
                try {
                    ClassForCombinedMediaPlayer.playDisSound(context15,fileName,fabPlayBtn15);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        return view15;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            Adhyay15_AC15.pageGetPosition15();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 15","c15_"+ pagePosition15);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return super.onOptionsItemSelected(item);
    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn15.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn15.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }

}