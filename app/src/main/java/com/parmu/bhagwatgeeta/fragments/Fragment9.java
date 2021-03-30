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
import com.parmu.bhagwatgeeta.activities.Adhyay9_AC9;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay9_AC9.pagePosition9;

public class Fragment9 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context9;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment9() {
        // Required empty public constructor
    }

    public static Fragment9 newInstance(String param1, String param2) {
        Fragment9 fragment = new Fragment9();
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
        context9= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view9= inflater.inflate(R.layout.fragment_9, container, false);
       tvSanskrit =view9.findViewById(R.id.sanskrit_9);
       tvBhavarth = view9.findViewById(R.id.bhavarth_9);
       tvSanskrit.setText(getArguments().getString("sanskrit9"));
       tvBhavarth.setText(getArguments().getString("bhavarth9"));
        constraintLayout =view9.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn9 = view9.findViewById(R.id.fabplaysound9);
         fabPlayBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay9_AC9.pageGetPosition9();

                if (pagePosition9 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 20) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 21) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 22) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 23) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 24) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 25) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 26) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 27) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 28) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 29) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 30) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 31) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 32) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 33) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context9, R.raw.c9s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
       return view9;
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
            Adhyay9_AC9.pageGetPosition9();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,"अध्याय 9","c9_"+ pagePosition9);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return super.onOptionsItemSelected(item);
    }
}