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
import com.parmu.bhagwatgeeta.activities.Adhyay14_AC14;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay14_AC14.pagePosition14;


public class Fragment14 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context14;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment14() {
        // Required empty public constructor
    }

    public static Fragment14 newInstance(String param1, String param2) {
        Fragment14 fragment = new Fragment14();
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
        context14= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view14= inflater.inflate(R.layout.fragment_14, container, false);
        tvSanskrit =view14.findViewById(R.id.sanskrit_14);
        tvBhavarth = view14.findViewById(R.id.bhavarth_14);
        tvSanskrit.setText(getArguments().getString("sanskrit14"));
        tvBhavarth.setText(getArguments().getString("bhavarth14"));
        constraintLayout = view14.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn14 = view14.findViewById(R.id.fabplaysound14);

        fabPlayBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay14_AC14.pageGetPosition14();

                if (pagePosition14 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 20) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 21) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 22) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 23) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 24) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 25) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 26) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context14, R.raw.c14s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view14;
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
            Adhyay14_AC14.pageGetPosition14();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,"अध्याय 14","c14_"+ pagePosition14);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return super.onOptionsItemSelected(item);
    }

}
