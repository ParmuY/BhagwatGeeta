package com.parmu.bhagwatgeeta.fragments;

import android.Manifest;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.parmu.bhagwatgeeta.activities.Adhyay1_AC1;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;
import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay1_AC1.pagePosition;

public class Fragment1 extends Fragment {

    Context context;
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
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
        assert getArguments() != null;
        tvSanskrit.setText(getArguments().getString("sanskrit1"));
        tvBhavarth.setText(getArguments().getString("bhavarth1"));

        boolean fileExist = getArguments().getBoolean("fileexist");
        FloatingActionButton fabPlayBtn = view.findViewById(R.id.fabplaysound);
        if(!fileExist){
            fabPlayBtn.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn.setImageResource(android.R.drawable.ic_lock_silent_mode_off);
        }
        constraintLayout = view.findViewById(R.id.constrained_layout);
        fabPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Adhyay1_AC1.pageGetPosition();
                if (pagePosition==0) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s1.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==1)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s2.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==2)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s3.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==3)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s4_5_6.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==4)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s7.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==5)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s8.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==6)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s9.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==7)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s10.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==8)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s11.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==9)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s12.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==10)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s13.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==11)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s14.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==12)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s15.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==13)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s16.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==14)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s17_18.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==15)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s19.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==16)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s20_21.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==17)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s22.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==18)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s23.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==19)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s24_25.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==20)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s26.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==21)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s27.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==22)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s28_29.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==23)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s30.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==24)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s31.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==25)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s32.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==26)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s33.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==27)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s34.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==28)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s35.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==29)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s36.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==30)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s37.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==31)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s38_39.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==32)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s40.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==33)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s41.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==34)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s42.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==35)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s43.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==36)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s44.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==37)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s45.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==38)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s46.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==39)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,"c1s47.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view;
    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            Adhyay1_AC1.pageGetPosition();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 1","c1_"+ pagePosition);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.onOptionsItemSelected(item);
    }

}