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
import com.parmu.bhagwatgeeta.activities.Adhyay16_AC16;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay16_AC16.pagePosition16;

public class Fragment16 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context16;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private ConstraintLayout constraintLayout;
    private boolean fileExist;
    private String fileName;
    private FloatingActionButton fabPlayBtn16;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment16() {
        // Required empty public constructor
    }

    public static Fragment16 newInstance(String param1, String param2) {
        Fragment16 fragment = new Fragment16();
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
        context16 = getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view16 = inflater.inflate(R.layout.fragment_16, container, false);
        tvSanskrit = view16.findViewById(R.id.sanskrit_16);
        tvBhavarth = view16.findViewById(R.id.bhavarth_16);
        constraintLayout = view16.findViewById(R.id.constrained_layout);
        fabPlayBtn16 = view16.findViewById(R.id.fabplaysound16);

        assert getArguments() != null;
        fileExist = getArguments().getBoolean("fileexist16");
        fileName =getArguments().getString("filename16");
        tvSanskrit.setText(getArguments().getString("sanskrit16"));
        tvBhavarth.setText(getArguments().getString("bhavarth16"));

        checkIfFileExist();
        fabPlayBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay16_AC16.pageGetPosition16();
                try {
                    ClassForCombinedMediaPlayer.playDisSound(context16,fileName,fabPlayBtn16);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        return view16;

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.share_shlola) {
            Adhyay16_AC16.pageGetPosition16();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(), constraintLayout, tvSanskrit,tvBhavarth, "अध्याय 16", "c16_" + pagePosition16);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return super.onOptionsItemSelected(item);
    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn16.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn16.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}