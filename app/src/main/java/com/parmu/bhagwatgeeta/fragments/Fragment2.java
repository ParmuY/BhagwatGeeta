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
import com.parmu.bhagwatgeeta.activities.Adhyay2_AC2;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;


import static com.parmu.bhagwatgeeta.activities.Adhyay2_AC2.pagePosition2;

public class Fragment2 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    Context context2;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
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
        tvSanskrit.setText(getArguments().getString("sanskrit2"));
        tvBhavarth.setText(getArguments().getString("bhavarth2"));
        FloatingActionButton fabPlayBtn2 = view2.findViewById(R.id.fabplaysound2);
        constraintLayout = view2.findViewById(R.id.constrained_layout);
        fabPlayBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay2_AC2.pageGetPosition2();

                if (pagePosition2==0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s1.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==1)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s2.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==2)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s3.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==3)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s4.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==4)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s5.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==5)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s6.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==6)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s7.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==7)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s8.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==8)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s9.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==9)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s10.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==10)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s11.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==11)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s12.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==12)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s13.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==13)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s14.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==14)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s15.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==15)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s16.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==16)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s17.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==17)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s18.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==18)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s19.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==19)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s20.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==20)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s21.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==21)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s22.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==22)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s23.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==23)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s24.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==24)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s25.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==25)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s26.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==26)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s27.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==27)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s28.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==28)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s29.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==29)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s30.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==30)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s31.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==31)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s32.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==32)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s33.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==33)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s34.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==34)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s35.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==35)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s36.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==36)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s37.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==37)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s38.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==38)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s39.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==39)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s40.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==40)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s41.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==41)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s42_43_44.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==42)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s45.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==43)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s46.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==44)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s47.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==45)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s48.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==46)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s49.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==47)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s50.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==48)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s51.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==49)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s52.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==50)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s53.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==51)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s54.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==52)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s55.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==53)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s56.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==54)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s57.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==55)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s58.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==56)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s59.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==57)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s60.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==58)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s61.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==59)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s62.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==60)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s63.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==61)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s64.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==62)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s65.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==63)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s66.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==64)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s67.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==65)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s68.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==66)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s69.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==67)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s70.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==68)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s71.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==69)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context2,"c2s72.mp3");
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view2;
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
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            Adhyay2_AC2.pageGetPosition2();
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 2","c2_"+ pagePosition2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}