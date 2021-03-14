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
import com.parmu.bhagwatgeeta.activities.Adhyay17_AC17;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay17_AC17.pagePosition17;
import static com.parmu.bhagwatgeeta.activities.Adhyay18_AC18.pagePosition18;

public class Fragment17 extends Fragment {
    private TextView textView;
    private Context context17;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment17() {
        // Required empty public constructor
    }

    public static Fragment17 newInstance(String param1, String param2) {
        Fragment17 fragment = new Fragment17();
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
        context17= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view17= inflater.inflate(R.layout.fragment_17, container, false);
        textView=view17.findViewById(R.id.text_display_17);
        textView.setText(getArguments().getString("message17"));
        constraintLayout = view17.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn17 = view17.findViewById(R.id.fabplaysound17);

        fabPlayBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay17_AC17.pageGetPosition17();

                if (pagePosition17 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 20) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 21) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 22) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 23) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 24) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 25) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 26) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition17 == 27) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context17, R.raw.c17s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view17;
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
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 17","C17"+ pagePosition17);

        }
        return super.onOptionsItemSelected(item);
    }
}