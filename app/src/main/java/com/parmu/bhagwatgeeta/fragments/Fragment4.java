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
import com.parmu.bhagwatgeeta.activities.Adhyay4_AC4;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;


import static com.parmu.bhagwatgeeta.activities.Adhyay4_AC4.pagePosition4;

public class Fragment4 extends Fragment{
    private TextView textView;
    private Context context4;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;
    ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment4() {
        // Required empty public constructor
    }

    public static Fragment4 newInstance(String param1, String param2) {
        Fragment4 fragment = new Fragment4();
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
        context4 = getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view4=inflater.inflate(R.layout.fragment_4, container, false);
       textView=view4.findViewById(R.id.text_display_4);
       textView.setText(getArguments().getString("message4"));
       constraintLayout= view4.findViewById(R.id.constrained_layout);
       FloatingActionButton fabPlayBtn4 = view4.findViewById(R.id.fabplaysound4);
       fabPlayBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay4_AC4.pageGetPosition4();

                if (pagePosition4 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 20) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 21) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 22) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 23) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 24) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 25) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 26) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 27) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 28) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s29_30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 29) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 30) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 31) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 32) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 33) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 34) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 35) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 36) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 37) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 38) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 39) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 40) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4, R.raw.c4s42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
       return view4;
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
            ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 4","C4"+ pagePosition4);

        }
        return super.onOptionsItemSelected(item);
    }
}