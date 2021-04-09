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
import com.parmu.bhagwatgeeta.activities.Adhyay7_AC7;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay7_AC7.pagePosition7;

public class Fragment7 extends Fragment{
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context7;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment7() {
        // Required empty public constructor
    }

    public static Fragment7 newInstance(String param1, String param2) {
        Fragment7 fragment = new Fragment7();
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
        context7= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view7= inflater.inflate(R.layout.fragment_7, container, false);
        tvSanskrit =view7.findViewById(R.id.sanskrit_7);
        tvBhavarth  =view7.findViewById(R.id.bhavarth_7);
        tvSanskrit.setText(getArguments().getString("sanskrit7"));
        tvBhavarth.setText(getArguments().getString("bhavarth7"));
        constraintLayout = view7.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn7 = view7.findViewById(R.id.fabplaysound7);

        fabPlayBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay7_AC7.pageGetPosition7();

//                if (pagePosition7 == 0) {
//
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s1);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 1) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s2);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 2) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s3);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 3) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s4_5);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 4) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s6);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 5) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s7);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 6) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s8);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 7) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s9);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 8) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s10);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 9) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s11);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 10) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s12);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 11) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s13);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 12) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s14);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 13) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s15);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 14) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s16);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 15) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s17);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 16) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s18);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 17) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s19);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 18) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s20);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 19) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s21);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 20) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s22);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 21) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s23);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 22) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s24);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 23) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s25);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 24) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s26);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 25) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s27);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 26) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s28);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 27) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s29);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                } else if (pagePosition7 == 28) {
//                    try {
//                        ClassForCombinedMediaPlayer.playDisSound(context7, R.raw.c7s30);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
            }
        });
        return view7;
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
            Adhyay7_AC7.pageGetPosition7();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 7","c7_"+ pagePosition7);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return super.onOptionsItemSelected(item);
    }

}

