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

public class Fragment18 extends Fragment{
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context18;
    private ConstraintLayout constraintLayout;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private boolean fileExist;
    private String fileName;
    private FloatingActionButton fabPlayBtn18;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment18() {
        // Required empty public constructor
    }

    public static Fragment18 newInstance(String param1, String param2) {
        Fragment18 fragment = new Fragment18();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        context18= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view18= inflater.inflate(R.layout.fragment_18, container, false);
      tvSanskrit =view18.findViewById(R.id.sanskrit_18);
      tvBhavarth = view18.findViewById(R.id.bhavarth_18);
      constraintLayout = view18.findViewById(R.id.constrained_layout);
      fabPlayBtn18 = view18.findViewById(R.id.fabplaysound18);

      assert getArguments() != null;
      fileExist = getArguments().getBoolean("fileexist18");
      fileName =getArguments().getString("filename18");
      tvSanskrit.setText(getArguments().getString("sanskrit18"));
      tvBhavarth.setText(getArguments().getString("bhavarth18"));
      checkIfFileExist();
      fabPlayBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ClassForCombinedMediaPlayer.playDisSound(context18,fileName,fabPlayBtn18);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
      return view18;
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
//            Adhyay18_AC18.pageGetPosition18();
//            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
//            try {
//                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 18", "c18_"+ pagePosition18);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//        return super.onOptionsItemSelected(item);
//    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn18.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn18.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }

}