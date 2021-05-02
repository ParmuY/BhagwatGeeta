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
import com.parmu.bhagwatgeeta.activities.Adhyay4_AC4;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;


import static com.parmu.bhagwatgeeta.activities.Adhyay4_AC4.pagePosition4;

public class Fragment4 extends Fragment{
    private TextView tvSanskrit;
    private TextView tvBhavarth;
    private Context context4;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private boolean fileExist;
    private String fileName;
    private FloatingActionButton fabPlayBtn4;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Fragment4() {
        // Required empty public constructor
    }

    public static Fragment4 newInstance(String param1, String param2) {
        Fragment4 fragment = new Fragment4();
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
        context4 = getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view4=inflater.inflate(R.layout.fragment_4, container, false);
       tvSanskrit =view4.findViewById(R.id.sanskrit_4);
       tvBhavarth = view4.findViewById(R.id.bhavarth_4);
       constraintLayout= view4.findViewById(R.id.constrained_layout);
       fabPlayBtn4 = view4.findViewById(R.id.fabplaysound4);

        assert getArguments() != null;
        fileExist = getArguments().getBoolean("fileexist4");
       fileName = getArguments().getString("filename4");
       tvSanskrit.setText(getArguments().getString("sanskrit4"));
       tvBhavarth.setText(getArguments().getString("bhavarth4"));
       checkIfFileExist();
       fabPlayBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay4_AC4.pageGetPosition4();

                if (pagePosition4 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 20) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 21) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 22) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 23) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 24) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 25) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 26) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 27) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 28) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 29) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 30) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 31) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 32) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 33) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 34) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 35) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 36) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 37) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 38) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 39) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 40) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context4,fileName,fabPlayBtn4);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
       return view4;
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
            Adhyay4_AC4.pageGetPosition4();
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            try {
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 4","c4_"+ pagePosition4);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return super.onOptionsItemSelected(item);
    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn4.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn4.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}