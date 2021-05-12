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
import com.parmu.bhagwatgita.activities.Adhyay8_AC8;
import com.parmu.bhagwatgita.R;
import com.parmu.bhagwatgita.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgita.misc.RequestPermissions;
import com.parmu.bhagwatgita.misc.ShareAsBitmap;
import java.io.IOException;


public class Fragment8 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context8;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private boolean fileExist;
    private String fileName;
    private FloatingActionButton fabPlayBtn8;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment8() {
        // Required empty public constructor
    }

    public static Fragment8 newInstance(String param1, String param2) {
        Fragment8 fragment = new Fragment8();
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
        context8= getActivity();
        requestPermissions  = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view8=inflater.inflate(R.layout.fragment_8, container, false);
        tvSanskrit =view8.findViewById(R.id.sanskrit_8);
        tvBhavarth = view8.findViewById(R.id.bhavarth_8);
        constraintLayout = view8.findViewById(R.id.constrained_layout);
        fabPlayBtn8 = view8.findViewById(R.id.fabplaysound8);
        fileExist = getArguments().getBoolean("fileexist8");
        fileName = getArguments().getString("filename8");
        tvSanskrit.setText(getArguments().getString("sanskrit8"));
        tvBhavarth.setText(getArguments().getString("bhavarth8"));
        checkIfFileExist();

        fabPlayBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay8_AC8.pageGetPosition8();
                try {
                    ClassForCombinedMediaPlayer.playDisSound(context8,fileName,fabPlayBtn8);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        return view8;
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
//            Adhyay8_AC8.pageGetPosition8();
//            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
//            try {
//                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 8","c8_"+ pagePosition8);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return super.onOptionsItemSelected(item);
//    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn8.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn8.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}