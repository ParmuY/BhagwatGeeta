package com.parmu.bhagwatgeeta.fragments;

import android.Manifest;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.parmu.bhagwatgeeta.activities.Adhyay1_AC1;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;
import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay1_AC1.pageGetPosition;
import static com.parmu.bhagwatgeeta.activities.Adhyay1_AC1.pagePosition;

public class Fragment1 extends Fragment {

    Context context;
    TextView textView;
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
        textView = view.findViewById(R.id.text_display_1);
        textView.setText(getArguments().getString("message"));
        FloatingActionButton fabPlayBtn = view.findViewById(R.id.fabplaysound);
        constraintLayout = view.findViewById(R.id.constrained_layout);
        fabPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Playing audio", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Adhyay1_AC1.pageGetPosition();

                if (pagePosition==0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==1)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==2)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==3)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s4_5_6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==4)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==5)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==6)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==7)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==8)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==9)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==10)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==11)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==12)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==13)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==14)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s17_18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==15)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==16)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s20_21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==17)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==18)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==19)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s24_25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==20)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==21)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==22)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s28_29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==23)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==24)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==25)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==26)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==27)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==28)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==29)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==30)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==31)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s38_39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==32)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==33)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==34)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==35)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s43);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==36)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s44);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==37)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s45);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==38)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s46);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==39)
                {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context,R.raw.c1s47);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view;
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
            Adhyay1_AC1.pageGetPosition();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 1","c1_"+ pagePosition);
        }
        return super.onOptionsItemSelected(item);
    }

}