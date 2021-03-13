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
import com.parmu.bhagwatgeeta.activities.Adhyay6_AC6;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay18_AC18.pagePosition18;
import static com.parmu.bhagwatgeeta.activities.Adhyay6_AC6.pagePosition6;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment6#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment6 extends Fragment implements ViewPager.OnPageChangeListener{
    private TextView textView;
    public MediaPlayer mediaPlayer6;
    Context context6;
    ViewPager viewPager6;
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

    public Fragment6() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment6.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment6 newInstance(String param1, String param2) {
        Fragment6 fragment = new Fragment6();
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
        context6=getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view6=inflater.inflate(R.layout.fragment_6, container, false);
        textView= view6.findViewById(R.id.text_display_6);
        textView.setText(getArguments().getString("message6"));
        constraintLayout = view6.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn6 = view6.findViewById(R.id.fabplaysound6);
        viewPager6=getActivity().findViewById(R.id.pager6);
        viewPager6.addOnPageChangeListener(this);
        fabPlayBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay6_AC6.pageGetPosition6();

                if (pagePosition6 == 0) {

                    try {
                        playDisSound(context6, R.raw.c6s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 1) {
                    try {
                        playDisSound(context6, R.raw.c6s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 2) {
                    try {
                        playDisSound(context6, R.raw.c6s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 3) {
                    try {
                        playDisSound(context6, R.raw.c6s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 4) {
                    try {
                        playDisSound(context6, R.raw.c6s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 5) {
                    try {
                        playDisSound(context6, R.raw.c6s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 6) {
                    try {
                        playDisSound(context6, R.raw.c6s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 7) {
                    try {
                        playDisSound(context6, R.raw.c6s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 8) {
                    try {
                        playDisSound(context6, R.raw.c6s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 9) {
                    try {
                        playDisSound(context6, R.raw.c6s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 10) {
                    try {
                        playDisSound(context6, R.raw.c6s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 11) {
                    try {
                        playDisSound(context6, R.raw.c6s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 12) {
                    try {
                        playDisSound(context6, R.raw.c6s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 13) {
                    try {
                        playDisSound(context6, R.raw.c6s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 14) {
                    try {
                        playDisSound(context6, R.raw.c6s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 15) {
                    try {
                        playDisSound(context6, R.raw.c6s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 16) {
                    try {
                        playDisSound(context6, R.raw.c6s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 17) {
                    try {
                        playDisSound(context6, R.raw.c6s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 18) {
                    try {
                        playDisSound(context6, R.raw.c6s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 19) {
                    try {
                        playDisSound(context6, R.raw.c6s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 20) {
                    try {
                        playDisSound(context6, R.raw.c6s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 21) {
                    try {
                        playDisSound(context6, R.raw.c6s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 22) {
                    try {
                        playDisSound(context6, R.raw.c6s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 23) {
                    try {
                        playDisSound(context6, R.raw.c6s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 24) {
                    try {
                        playDisSound(context6, R.raw.c6s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 25) {
                    try {
                        playDisSound(context6, R.raw.c6s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 26) {
                    try {
                        playDisSound(context6, R.raw.c6s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 27) {
                    try {
                        playDisSound(context6, R.raw.c6s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 28) {
                    try {
                        playDisSound(context6, R.raw.c6s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 29) {
                    try {
                        playDisSound(context6, R.raw.c6s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 30) {
                    try {
                        playDisSound(context6, R.raw.c6s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 31) {
                    try {
                        playDisSound(context6, R.raw.c6s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 32) {
                    try {
                        playDisSound(context6, R.raw.c6s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 33) {
                    try {
                        playDisSound(context6, R.raw.c6s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 34) {
                    try {
                        playDisSound(context6, R.raw.c6s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 35) {
                    try {
                        playDisSound(context6, R.raw.c6s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 36) {
                    try {
                        playDisSound(context6, R.raw.c6s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 37) {
                    try {
                        playDisSound(context6, R.raw.c6s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 38) {
                    try {
                        playDisSound(context6, R.raw.c6s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 39) {
                    try {
                        playDisSound(context6, R.raw.c6s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 40) {
                    try {
                        playDisSound(context6, R.raw.c6s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 41) {
                    try {
                        playDisSound(context6, R.raw.c6s42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 42) {
                    try {
                        playDisSound(context6, R.raw.c6s43);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 43) {
                    try {
                        playDisSound(context6, R.raw.c6s44);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 44) {
                    try {
                        playDisSound(context6, R.raw.c6s45);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 45) {
                    try {
                        playDisSound(context6, R.raw.c6s46);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition6 == 46) {
                    try {
                        playDisSound(context6, R.raw.c6s47);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view6;
    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer6.isPlaying()){
            try {
                mediaPlayer6.pause();
                mediaPlayer6.seekTo(0);
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

        if(mediaPlayer6.isPlaying()) {
            mediaPlayer6.pause();
            mediaPlayer6.seekTo(0);
        }
        else {
            mediaPlayer6.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer6.prepare();
        }
        mediaPlayer6.start();

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
            if(mediaPlayer6.isPlaying()){
                mediaPlayer6.pause();
                mediaPlayer6.seekTo(0);
            }
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 6","C6"+ pagePosition6);

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onResume() {
        super.onResume();
        mediaPlayer6 = null;
        mediaPlayer6 = new MediaPlayer();
    }
    @Override
    public void onPause(){
        super.onPause();
        if(mediaPlayer6.isPlaying())
        {
            mediaPlayer6.pause();
            mediaPlayer6.seekTo(0);
        }
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer6!=null)
        {
            mediaPlayer6.reset();
            mediaPlayer6.release();
            mediaPlayer6 = null;
        }

    }

}