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
import com.parmu.bhagwatgeeta.activities.Adhyay11_AC11;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay11_AC11.pagePosition11;

public class Fragment11 extends Fragment{
    private TextView textView;
    private Context context11;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment11() {
        // Required empty public constructor
    }

    public static Fragment11 newInstance(String param1, String param2) {
        Fragment11 fragment = new Fragment11();
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
        context11= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view11= inflater.inflate(R.layout.fragment_11, container, false);
       textView=view11.findViewById(R.id.text_display_11);
       textView.setText(getArguments().getString("message11"));
       constraintLayout = view11.findViewById(R.id.constrained_layout);
       FloatingActionButton fabPlayBtn11 = view11.findViewById(R.id.fabplaysound11);
       fabPlayBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay11_AC11.pageGetPosition11();

                if (pagePosition11 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s10_11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 20) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 21) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 22) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 23) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 24) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s26_27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 25) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 26) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 27) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 28) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 29) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 30) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 31) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 32) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 33) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 34) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 35) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 36) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 37) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 38) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s41_42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 39) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s43);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 40) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s44);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 41) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s45);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 42) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s46);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 43) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s47);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 44) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s48);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 45) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s49);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 46) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s50);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 47) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s51);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 48) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s52);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 49) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s53);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 50) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s54);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 51) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context11, R.raw.c11s55);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
       return view11;
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
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 11","C11"+ pagePosition11);
        }
        return super.onOptionsItemSelected(item);
    }
}