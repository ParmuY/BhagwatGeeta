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
    private Context context5;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private boolean fileExist;
    private String fileName;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private FloatingActionButton fabPlayBtn5;

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
       fabPlayBtn5 = view5.findViewById(R.id.fabplaysound5);
       constraintLayout = view5.findViewById(R.id.constrained_layout);

       fileExist = getArguments().getBoolean("fileexist5");
       fileName = getArguments().getString("filename5");
       tvSanskrit.setText(getArguments().getString("sanskrit5"));
       tvBhavarth.setText(getArguments().getString("bhavarth5"));
       checkIfFileExist();

       fabPlayBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay5_AC_5.pageGetPosition5();

                if (pagePosition5 == 0) {

                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 1) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 2) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 3) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 4) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 5) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 6) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 7) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 8) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 9) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 10) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 11) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 12) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 13) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 14) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 15) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 16) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 17) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 18) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 19) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 20) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 21) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 22) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 23) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 24) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 25) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 26) {
                    try {
                        ClassForCombinedMediaPlayer.playDisSound(context5,fileName,fabPlayBtn5);
                    } catch (IOException | InterruptedException e) {
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
                shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout, tvSanskrit,tvBhavarth,"अध्याय 5","c5_"+ pagePosition5);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.onOptionsItemSelected(item);
    }
    private void checkIfFileExist(){

        if(!fileExist){
            fabPlayBtn5.setImageResource(R.drawable.ic_baseline_arrow_downward_24);
        }
        else{
            fabPlayBtn5.setImageResource(R.drawable.ic_baseline_volume_up_24);
        }
    }
}