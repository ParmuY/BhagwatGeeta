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
import com.parmu.bhagvadgita.activities.Adhyay13_AC13;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagvadgita.misc.RequestPermissions;
import com.parmu.bhagvadgita.misc.ShareAsBitmap;

import java.io.IOException;

public class Fragment13 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context13;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private boolean fileExist;
    private String fileName;
    private FloatingActionButton fabPlayBtn13;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment13() {
        // Required empty public constructor
    }

    public static Fragment13 newInstance(String param1, String param2) {
        Fragment13 fragment = new Fragment13();
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
        context13= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view13=inflater.inflate(R.layout.fragment_13, container, false);
        tvSanskrit =view13.findViewById(R.id.sanskrit_13);
        tvBhavarth = view13.findViewById(R.id.bhavarth_13);
        constraintLayout =view13.findViewById(R.id.constrained_layout);
        fabPlayBtn13 = view13.findViewById(R.id.fabplaysound13);

        fileExist = getArguments().getBoolean("fileexist13");
        fileName =getArguments().getString("filename13");
        tvSanskrit.setText(getArguments().getString("sanskrit13"));
        tvBhavarth.setText(getArguments().getString("bhavarth13"));
        checkIfFileExist();
        fabPlayBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay13_AC13.pageGetPosition13();
                try {
                    ClassForCombinedMediaPlayer.playDisSound(context13,fileName,fabPlayBtn13);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        return view13;
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
//            Adhyay13_AC13.pageGetPosition13();
//            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
//            try {
//                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 13","c13_"+ pagePosition13);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//        return super.onOptionsItemSelected(item);
//    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn13.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn13.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}
