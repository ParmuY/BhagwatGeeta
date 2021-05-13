package com.parmu.bhagvadgita.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.parmu.bhagvadgita.activities.Adhyay9_AC9;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagvadgita.misc.RequestPermissions;
import com.parmu.bhagvadgita.misc.ShareAsBitmap;

import java.io.IOException;

public class Fragment9 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context9;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private boolean fileExist;
    private String fileName;
    private FloatingActionButton fabPlayBtn9;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment9() {
        // Required empty public constructor
    }

    public static Fragment9 newInstance(String param1, String param2) {
        Fragment9 fragment = new Fragment9();
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
        context9= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view9= inflater.inflate(R.layout.fragment_9, container, false);
       tvSanskrit =view9.findViewById(R.id.sanskrit_9);
       tvBhavarth = view9.findViewById(R.id.bhavarth_9);
        constraintLayout =view9.findViewById(R.id.constrained_layout);
        fabPlayBtn9 = view9.findViewById(R.id.fabplaysound9);

        fileExist = getArguments().getBoolean("fileexist9");
        fileName = getArguments().getString("filename9");
       tvSanskrit.setText(getArguments().getString("sanskrit9"));
       tvBhavarth.setText(getArguments().getString("bhavarth9"));
       checkIfFileExist();
         fabPlayBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay9_AC9.pageGetPosition9();
                try {
                    ClassForCombinedMediaPlayer.playDisSound(context9,fileName,fabPlayBtn9);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       return view9;
    }
//
//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//
//        inflater.inflate(R.menu.app_bar_menu_1, menu);
//        super.onCreateOptionsMenu(menu, inflater);
//    }
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//        if (id==R.id.share_shlola){
//            Adhyay9_AC9.pageGetPosition9();
//            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
//            try {
//                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 9","c9_"+ pagePosition9);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//        return super.onOptionsItemSelected(item);
//    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn9.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn9.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}