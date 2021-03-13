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
import com.parmu.bhagwatgeeta.activities.Adhyay10_AC10;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay10_AC10.pagePosition10;
import static com.parmu.bhagwatgeeta.activities.Adhyay18_AC18.pagePosition18;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment10#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment10 extends Fragment implements ViewPager.OnPageChangeListener {
    private TextView textView;
    public MediaPlayer mediaPlayer10;
    Context context10;
    ViewPager viewPager10;
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

    public Fragment10() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment10.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment10 newInstance(String param1, String param2) {
        Fragment10 fragment = new Fragment10();
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
        context10= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view10=inflater.inflate(R.layout.fragment_10, container, false);
       textView=view10.findViewById(R.id.text_display_10);
      textView.setText(getArguments().getString("message10"));
      constraintLayout = view10.findViewById(R.id.constrained_layout);
      FloatingActionButton fabPlayBtn10 = view10.findViewById(R.id.fabplaysound10);
        viewPager10=getActivity().findViewById(R.id.pager10);
        viewPager10.addOnPageChangeListener(this);
        fabPlayBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Adhyay10_AC10.pageGetPosition10();

                if (pagePosition10 == 0) {

                    try {
                        playDisSound(context10, R.raw.c10s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 1) {
                    try {
                        playDisSound(context10, R.raw.c10s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 2) {
                    try {
                        playDisSound(context10, R.raw.c10s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 3) {
                    try {
                        playDisSound(context10, R.raw.c10s4_5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 4) {
                    try {
                        playDisSound(context10, R.raw.c10s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 5) {
                    try {
                        playDisSound(context10, R.raw.c10s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 6) {
                    try {
                        playDisSound(context10, R.raw.c10s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 7) {
                    try {
                        playDisSound(context10, R.raw.c10s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 8) {
                    try {
                        playDisSound(context10, R.raw.c10s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 9) {
                    try {
                        playDisSound(context10, R.raw.c10s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 10) {
                    try {
                        playDisSound(context10, R.raw.c10s12_13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 11) {
                    try {
                        playDisSound(context10, R.raw.c10s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 12) {
                    try {
                        playDisSound(context10, R.raw.c10s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 13) {
                    try {
                        playDisSound(context10, R.raw.c10s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 14) {
                    try {
                        playDisSound(context10, R.raw.c10s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 15) {
                    try {
                        playDisSound(context10, R.raw.c10s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 16) {
                    try {
                        playDisSound(context10, R.raw.c10s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 17) {
                    try {
                        playDisSound(context10, R.raw.c10s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 18) {
                    try {
                        playDisSound(context10, R.raw.c10s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 19) {
                    try {
                        playDisSound(context10, R.raw.c10s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 20) {
                    try {
                        playDisSound(context10, R.raw.c10s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 21) {
                    try {
                        playDisSound(context10, R.raw.c10s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 22) {
                    try {
                        playDisSound(context10, R.raw.c10s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 23) {
                    try {
                        playDisSound(context10, R.raw.c10s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 24) {
                    try {
                        playDisSound(context10, R.raw.c10s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 25) {
                    try {
                        playDisSound(context10, R.raw.c10s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 26) {
                    try {
                        playDisSound(context10, R.raw.c10s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 27) {
                    try {
                        playDisSound(context10, R.raw.c10s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 28) {
                    try {
                        playDisSound(context10, R.raw.c10s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 29) {
                    try {
                        playDisSound(context10, R.raw.c10s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 30) {
                    try {
                        playDisSound(context10, R.raw.c10s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 31) {
                    try {
                        playDisSound(context10, R.raw.c10s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 32) {
                    try {
                        playDisSound(context10, R.raw.c10s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 33) {
                    try {
                        playDisSound(context10, R.raw.c10s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 34) {
                    try {
                        playDisSound(context10, R.raw.c10s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 35) {
                    try {
                        playDisSound(context10, R.raw.c10s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 36) {
                    try {
                        playDisSound(context10, R.raw.c10s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 37) {
                    try {
                        playDisSound(context10, R.raw.c10s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 38) {
                    try {
                        playDisSound(context10, R.raw.c10s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 39) {
                    try {
                        playDisSound(context10, R.raw.c10s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 40) {
                    try {
                        playDisSound(context10, R.raw.c10s42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            });
      return view10;
    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer10.isPlaying()){
            try {
                mediaPlayer10.pause();
                mediaPlayer10.seekTo(0);
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

        if(mediaPlayer10.isPlaying()) {
            mediaPlayer10.pause();
            mediaPlayer10.seekTo(0);
        }
        else {
            mediaPlayer10.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer10.prepare();
        }
        mediaPlayer10.start();

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
            if(mediaPlayer10.isPlaying()){
                mediaPlayer10.pause();
                mediaPlayer10.seekTo(0);
            }
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 10","C10"+ pagePosition10);

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onResume() {
        super.onResume();
        mediaPlayer10 = null;
        mediaPlayer10 = new MediaPlayer();
    }
    @Override
    public void onPause(){
        super.onPause();
        if(mediaPlayer10.isPlaying())
        {
            mediaPlayer10.pause();
            mediaPlayer10.seekTo(0);
        }
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer10!=null)
        {
            mediaPlayer10.reset();
            mediaPlayer10.release();
            mediaPlayer10 = null;
        }

    }


}