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
import com.parmu.bhagwatgeeta.activities.Adhyay5_AC_5;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay5_AC_5.pagePosition5;

public class Fragment5 extends Fragment {
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    Context context5;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment5() {
        // Required empty public constructor
    }

    public static Fragment5 newInstance(String param1, String param2) {
        Fragment5 fragment = new Fragment5();
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
        context5= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view5=inflater.inflate(R.layout.fragment_5, container, false);
       tvSanskrit =view5.findViewById(R.id.sanskrit_5);
       tvBhavarth = view5.findViewById(R.id.bhavarth_5);
       tvSanskrit.setText(getArguments().getString("sanskrit5"));
       tvBhavarth.setText(getArguments().getString("bhavarth5"));
       constraintLayout = view5.findViewById(R.id.constrained_layout);
       FloatingActionButton fabPlayBtn2 = view5.findViewById(R.id.fabplaysound5);
       fabPlayBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay5_AC_5.pageGetPosition5();

                if (pagePosition5 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s8_9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 20) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 21) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 22) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 23) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 24) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 27) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s27_28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 26) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5, R.raw.c5s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            });
       return view5;
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
            Adhyay5_AC_5.pageGetPosition5();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,"अध्याय 5","c5_"+ pagePosition5);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}