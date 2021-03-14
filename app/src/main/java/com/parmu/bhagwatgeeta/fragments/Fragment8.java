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
import com.parmu.bhagwatgeeta.activities.Adhyay8_AC8;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;
import java.io.IOException;
import static com.parmu.bhagwatgeeta.activities.Adhyay8_AC8.pagePosition8;


public class Fragment8 extends Fragment {
    private TextView textView;
    private Context context8;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment8() {
        // Required empty public constructor
    }

    public static Fragment8 newInstance(String param1, String param2) {
        Fragment8 fragment = new Fragment8();
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
        context8= getActivity();
        requestPermissions  = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view8=inflater.inflate(R.layout.fragment_8, container, false);
        textView=view8.findViewById(R.id.text_display_8);
        textView.setText(getArguments().getString("message8"));
        constraintLayout = view8.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn8 = view8.findViewById(R.id.fabplaysound8);
        fabPlayBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay8_AC8.pageGetPosition8();

                if (pagePosition8 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s12_13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 20) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 21) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 22) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 23) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 24) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 25) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition8 == 26) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context8, R.raw.c8s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view8;
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
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 8","C8"+ pagePosition8);
        }
        return super.onOptionsItemSelected(item);
    }
}