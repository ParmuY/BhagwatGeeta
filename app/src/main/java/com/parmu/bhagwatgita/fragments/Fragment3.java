package com.parmu.bhagwatgita.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.parmu.bhagwatgita.R;
import com.parmu.bhagwatgita.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgita.misc.RequestPermissions;
import com.parmu.bhagwatgita.misc.ShareAsBitmap;

import java.io.IOException;

public class Fragment3 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context3;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private FloatingActionButton fabPlayBtn3;
    private boolean fileExist;
    private String fileName;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment3() {
        // Required empty public constructor
    }

    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
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
        context3= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view3=inflater.inflate(R.layout.fragment_3, container, false);
       tvSanskrit = view3.findViewById(R.id.sanskrit_3);
       tvBhavarth = view3.findViewById(R.id.bhavarth_3);
       fabPlayBtn3 = view3.findViewById(R.id.fabplaysound3);
       constraintLayout = view3.findViewById(R.id.constrained_layout);
       assert getArguments() != null;
       fileExist = getArguments().getBoolean("fileexist3");
       fileName = getArguments().getString("filename3");
       tvSanskrit.setText(getArguments().getString("sanskrit3"));
       tvBhavarth.setText(getArguments().getString("bhavarth3"));
       constraintLayout = view3.findViewById(R.id.constrained_layout);
        checkIfFileExist();
       fabPlayBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ClassForCombinedMediaPlayer.playDisSound(context3, fileName,fabPlayBtn3);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

       return view3;

    }

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
//            Adhyay3_AC3.pageGetPosition3();
//            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
//            try {
//                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 3","c3_"+ pagePosition3);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//        return super.onOptionsItemSelected(item);
//    }


    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn3.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn3.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}
