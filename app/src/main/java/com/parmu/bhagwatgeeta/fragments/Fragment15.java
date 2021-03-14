package com.parmu.bhagwatgeeta.fragments;

import android.Manifest;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
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
import com.parmu.bhagwatgeeta.activities.Adhyay15_AC15;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay15_AC15.pagePosition15;
import static com.parmu.bhagwatgeeta.activities.Adhyay18_AC18.pagePosition18;

public class Fragment15 extends Fragment{
    private TextView textView;
    private Context context15;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions ;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment15() {
        // Required empty public constructor
    }

    public static Fragment15 newInstance(String param1, String param2) {
        Fragment15 fragment = new Fragment15();
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
        context15= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view15= inflater.inflate(R.layout.fragment_15, container, false);
        textView=view15.findViewById(R.id.text_display_15);
        textView.setText(getArguments().getString("message15"));
        constraintLayout =view15.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn15 = view15.findViewById(R.id.fabplaysound15);

        fabPlayBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay15_AC15.pageGetPosition15();

                if (pagePosition15 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context15, R.raw.c15s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view15;
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
            ClassForCombinedMediaPlayer.mediaPlayer.reset();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 15","C15"+ pagePosition15);

        }
        return super.onOptionsItemSelected(item);
    }

}