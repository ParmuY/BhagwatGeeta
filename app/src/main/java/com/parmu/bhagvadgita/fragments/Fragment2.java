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

public class Fragment2 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private FloatingActionButton fabPlayBtn2;
    private Context context2;
    private boolean fileExist;
    private String fileName;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public Fragment2() {
        // Required empty public constructor
    }

    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
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
        context2= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View view2= inflater.inflate(R.layout.fragment_2, container, false);
        tvSanskrit =view2.findViewById(R.id.sanskrit_2);
        tvBhavarth= view2.findViewById(R.id.bhavarth_2);
        fabPlayBtn2 = view2.findViewById(R.id.fabplaysound2);
        constraintLayout = view2.findViewById(R.id.constrained_layout);

        assert getArguments() != null;
        fileExist = getArguments().getBoolean("fileexist2");
        fileName = getArguments().getString("filename2");
        tvSanskrit.setText(getArguments().getString("sanskrit2"));
        tvBhavarth.setText(getArguments().getString("bhavarth2"));
        checkIfFileExist();

        fabPlayBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ClassForCombinedMediaPlayer.playDisSound(context2,fileName,fabPlayBtn2);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        return view2;
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
//            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
//            Adhyay2_AC2.pageGetPosition2();
//            try {
//                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 2","c2_"+ pagePosition2);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return super.onOptionsItemSelected(item);
//    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn2.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn2.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}