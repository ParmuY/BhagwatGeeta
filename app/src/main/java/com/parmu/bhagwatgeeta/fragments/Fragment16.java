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
import com.parmu.bhagwatgeeta.activities.Adhyay16_AC16;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay16_AC16.pagePosition16;

public class Fragment16 extends Fragment {
    private TextView textView;
    private Context context16;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private ConstraintLayout constraintLayout;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment16() {
        // Required empty public constructor
    }

    public static Fragment16 newInstance(String param1, String param2) {
        Fragment16 fragment = new Fragment16();
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
        context16 = getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view16 = inflater.inflate(R.layout.fragment_16, container, false);
        textView = view16.findViewById(R.id.text_display_16);
        textView.setText(getArguments().getString("message16"));
        constraintLayout = view16.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn16 = view16.findViewById(R.id.fabplaysound16);

        fabPlayBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay16_AC16.pageGetPosition16();

                if (pagePosition16 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s15_16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 20) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 21) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 22) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context16, R.raw.c16s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view16;

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.share_shlola) {
            ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            Adhyay16_AC16.pageGetPosition16();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(), constraintLayout, textView, "अध्याय 16", "c16_" + pagePosition16);

        }
        return super.onOptionsItemSelected(item);
    }
}