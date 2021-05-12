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
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagvadgita.misc.RequestPermissions;
import com.parmu.bhagvadgita.misc.ShareAsBitmap;

import java.io.IOException;

public class Fragment1 extends Fragment {

    private Context context;
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private FloatingActionButton fabPlayBtn;
    private boolean fileExist;
    private String fileName;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";



    public Fragment1() {
        // Required empty public constructor
    }

    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
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
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
        context= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_1, container, false);
        tvSanskrit = view.findViewById(R.id.sanskrit_1);
        tvBhavarth = view.findViewById(R.id.bhavarth_1);
        fabPlayBtn = view.findViewById(R.id.fabplaysound);
        constraintLayout = view.findViewById(R.id.constrained_layout);

        assert getArguments() != null;
        tvSanskrit.setText(getArguments().getString("sanskrit1"));
        tvBhavarth.setText(getArguments().getString("bhavarth1"));
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


//    @Override
//    public void onCreateOptionsMenu(@NonNull Menu menu, MenuInflater inflater) {
//
//        inflater.inflate(R.menu.app_bar_menu_1, menu);
//        super.onCreateOptionsMenu(menu, inflater);
//    }
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//        if (id==R.id.share_shlola){
//            Adhyay1_AC1.pageGetPosition();
//            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
//            try {
//                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 1","c1_"+ pagePosition);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return super.onOptionsItemSelected(item);
//    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}
