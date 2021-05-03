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
import com.parmu.bhagwatgeeta.activities.Adhyay10_AC10;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay10_AC10.pagePosition10;

public class Fragment10 extends Fragment{
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context10;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private boolean fileExist;
    private String fileName;
    private FloatingActionButton fabPlayBtn10;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment10() {
        // Required empty public constructor
    }

    public static Fragment10 newInstance(String param1, String param2) {
        Fragment10 fragment = new Fragment10();
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
        context10= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view10=inflater.inflate(R.layout.fragment_10, container, false);
       tvSanskrit =view10.findViewById(R.id.sanskrit_10);
       tvBhavarth = view10.findViewById(R.id.bhavarth_10);
        constraintLayout = view10.findViewById(R.id.constrained_layout);
        fabPlayBtn10 = view10.findViewById(R.id.fabplaysound10);

      fileExist = getArguments().getBoolean("fileexist10");
      fileName = getArguments().getString("filename10");
      tvSanskrit.setText(getArguments().getString("sanskrit10"));
      tvBhavarth.setText(getArguments().getString("bhavarth10"));
      checkIfFileExist();

        fabPlayBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Adhyay10_AC10.pageGetPosition10();
                try {
                    ClassForCombinedMediaPlayer.playDisSound(context10,fileName,fabPlayBtn10);
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
            });
      return view10;
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
            Adhyay10_AC10.pageGetPosition10();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 10","c10_"+ pagePosition10);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return super.onOptionsItemSelected(item);
    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn10.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn10.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}