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
import com.parmu.bhagwatgeeta.activities.Adhyay12_AC12;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay12_AC12.pagePosition12;

public class Fragment12 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context12;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment12() {
        // Required empty public constructor
    }

    public static Fragment12 newInstance(String param1, String param2) {
        Fragment12 fragment = new Fragment12();
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
        context12= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View view12=inflater.inflate(R.layout.fragment_12, container, false);
    tvSanskrit =view12.findViewById(R.id.sanskrit_12);
    tvBhavarth = view12.findViewById(R.id.bhavarth_12);
    tvSanskrit.setText(getArguments().getString("sanskrit12"));
    tvBhavarth.setText(getArguments().getString("bhavarth12"));
    constraintLayout = view12.findViewById(R.id.constrained_layout);
    FloatingActionButton fabPlayBtn12 = view12.findViewById(R.id.fabplaysound12);
        fabPlayBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay12_AC12.pageGetPosition12();

                if (pagePosition12 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s3_4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s13_14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context12, R.raw.c12s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    return view12;
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
            Adhyay12_AC12.pageGetPosition12();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 12","c12_"+ pagePosition12);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return super.onOptionsItemSelected(item);
    }

}