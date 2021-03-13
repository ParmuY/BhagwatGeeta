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
import com.parmu.bhagwatgeeta.activities.Adhyay3_AC3;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;


import static com.parmu.bhagwatgeeta.activities.Adhyay18_AC18.pagePosition18;
import static com.parmu.bhagwatgeeta.activities.Adhyay3_AC3.pagePosition3;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment implements ViewPager.OnPageChangeListener{
    private TextView textView;
    public MediaPlayer mediaPlayer3;
    Context context3;
    ViewPager viewPager3;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
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
        context3= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view3=inflater.inflate(R.layout.fragment_3, container, false);
       textView = view3.findViewById(R.id.text_display_3);
       textView.setText(getArguments().getString("message3"));
       constraintLayout = view3.findViewById(R.id.constrained_layout);
         FloatingActionButton fabPlayBtn3 = view3.findViewById(R.id.fabplaysound3);
        viewPager3=getActivity().findViewById(R.id.pager3);
        viewPager3.addOnPageChangeListener(this);



        fabPlayBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay3_AC3.pageGetPosition3();

                if (pagePosition3 == 0) {

                    try {
                        playDisSound(context3, R.raw.c3s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 1) {
                    try {
                        playDisSound(context3, R.raw.c3s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 2) {
                    try {
                        playDisSound(context3, R.raw.c3s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 3) {
                    try {
                        playDisSound(context3, R.raw.c3s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 4) {
                    try {
                        playDisSound(context3, R.raw.c3s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 5) {
                    try {
                        playDisSound(context3, R.raw.c3s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 6) {
                    try {
                        playDisSound(context3, R.raw.c3s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 7) {
                    try {
                        playDisSound(context3, R.raw.c3s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 8) {
                    try {
                        playDisSound(context3, R.raw.c3s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 9) {
                    try {
                        playDisSound(context3, R.raw.c3s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 10) {
                    try {
                        playDisSound(context3, R.raw.c3s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 11) {
                    try {
                        playDisSound(context3, R.raw.c3s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 12) {
                    try {
                        playDisSound(context3, R.raw.c3s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 13) {
                    try {
                        playDisSound(context3, R.raw.c3s14_15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 14) {
                    try {
                        playDisSound(context3, R.raw.c3s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 15) {
                    try {
                        playDisSound(context3, R.raw.c3s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 16) {
                    try {
                        playDisSound(context3, R.raw.c3s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 17) {
                    try {
                        playDisSound(context3, R.raw.c3s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 18) {
                    try {
                        playDisSound(context3, R.raw.c3s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 19) {
                    try {
                        playDisSound(context3, R.raw.c3s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 20) {
                    try {
                        playDisSound(context3, R.raw.c3s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 21) {
                    try {
                        playDisSound(context3, R.raw.c3s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 22) {
                    try {
                        playDisSound(context3, R.raw.c3s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 23) {
                    try {
                        playDisSound(context3, R.raw.c3s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 24) {
                    try {
                        playDisSound(context3, R.raw.c3s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 25) {
                    try {
                        playDisSound(context3, R.raw.c3s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 26) {
                    try {
                        playDisSound(context3, R.raw.c3s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 27) {
                    try {
                        playDisSound(context3, R.raw.c3s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 28) {
                    try {
                        playDisSound(context3, R.raw.c3s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 29) {
                    try {
                        playDisSound(context3, R.raw.c3s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 30) {
                    try {
                        playDisSound(context3, R.raw.c3s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 31) {
                    try {
                        playDisSound(context3, R.raw.c3s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 32) {
                    try {
                        playDisSound(context3, R.raw.c3s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 33) {
                    try {
                        playDisSound(context3, R.raw.c3s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 34) {
                    try {
                        playDisSound(context3, R.raw.c3s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 35) {
                    try {
                        playDisSound(context3, R.raw.c3s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 36) {
                    try {
                        playDisSound(context3, R.raw.c3s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 37) {
                    try {
                        playDisSound(context3, R.raw.c3s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 38) {
                    try {
                        playDisSound(context3, R.raw.c3s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 39) {
                    try {
                        playDisSound(context3, R.raw.c3s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 40) {
                    try {
                        playDisSound(context3, R.raw.c3s42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if (pagePosition3 == 41) {
                    try {
                        playDisSound(context3, R.raw.c3s43);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

       return view3;

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer3.isPlaying()){
            try {
                mediaPlayer3.pause();
                mediaPlayer3.seekTo(0);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {

        if(mediaPlayer3.isPlaying()) {
            mediaPlayer3.pause();
            mediaPlayer3.seekTo(0);
        }
        else {
            mediaPlayer3.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer3.prepare();
        }
        mediaPlayer3.start();

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
            if(mediaPlayer3.isPlaying()){
                mediaPlayer3.pause();
                mediaPlayer3.seekTo(0);
            }
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 3","C3"+ pagePosition3);

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onResume() {
        super.onResume();
        mediaPlayer3 = null;
        mediaPlayer3 = new MediaPlayer();

    }
    @Override
    public void onPause(){
        super.onPause();
        if(mediaPlayer3.isPlaying())
        {
            mediaPlayer3.pause();
            mediaPlayer3.seekTo(0);
        }
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer3!=null)
        {
            mediaPlayer3.reset();
            mediaPlayer3.release();
            mediaPlayer3 = null;
        }

    }


}
