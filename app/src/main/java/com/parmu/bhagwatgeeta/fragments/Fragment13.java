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
import com.parmu.bhagwatgeeta.activities.Adhyay13_AC13;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay13_AC13.pagePosition13;
import static com.parmu.bhagwatgeeta.activities.Adhyay18_AC18.pagePosition18;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment13#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment13 extends Fragment  implements ViewPager.OnPageChangeListener{
    private TextView textView;
    public MediaPlayer mediaPlayer13;
    Context context13;
    ViewPager viewPager13;
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

    public Fragment13() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment13.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment13 newInstance(String param1, String param2) {
        Fragment13 fragment = new Fragment13();
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
        context13= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view13=inflater.inflate(R.layout.fragment_13, container, false);
        textView=view13.findViewById(R.id.text_display_13);
        textView.setText(getArguments().getString("message13"));
        constraintLayout =view13.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn13 = view13.findViewById(R.id.fabplaysound13);
        viewPager13=getActivity().findViewById(R.id.pager13);
        viewPager13.addOnPageChangeListener(this);
        fabPlayBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay13_AC13.pageGetPosition13();

                if (pagePosition13 == 0) {

                    try {
                        playDisSound(context13, R.raw.c13s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 1) {
                    try {
                        playDisSound(context13, R.raw.c13s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 2) {
                    try {
                        playDisSound(context13, R.raw.c13s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 3) {
                    try {
                        playDisSound(context13, R.raw.c13s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 4) {
                    try {
                        playDisSound(context13, R.raw.c13s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 5) {
                    try {
                        playDisSound(context13, R.raw.c13s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 6) {
                    try {
                        playDisSound(context13, R.raw.c13s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 7) {
                    try {
                        playDisSound(context13, R.raw.c13s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 8) {
                    try {
                        playDisSound(context13, R.raw.c13s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 9) {
                    try {
                        playDisSound(context13, R.raw.c13s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 10) {
                    try {
                        playDisSound(context13, R.raw.c13s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 11) {
                    try {
                        playDisSound(context13, R.raw.c13s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 12) {
                    try {
                        playDisSound(context13, R.raw.c13s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 13) {
                    try {
                        playDisSound(context13, R.raw.c13s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 14) {
                    try {
                        playDisSound(context13, R.raw.c13s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 15) {
                    try {
                        playDisSound(context13, R.raw.c13s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 16) {
                    try {
                        playDisSound(context13, R.raw.c13s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 17) {
                    try {
                        playDisSound(context13, R.raw.c13s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 18) {
                    try {
                        playDisSound(context13, R.raw.c13s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 19) {
                    try {
                        playDisSound(context13, R.raw.c13s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 20) {
                    try {
                        playDisSound(context13, R.raw.c13s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 21) {
                    try {
                        playDisSound(context13, R.raw.c13s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 22) {
                    try {
                        playDisSound(context13, R.raw.c13s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 23) {
                    try {
                        playDisSound(context13, R.raw.c13s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 24) {
                    try {
                        playDisSound(context13, R.raw.c13s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 25) {
                    try {
                        playDisSound(context13, R.raw.c13s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 26) {
                    try {
                        playDisSound(context13, R.raw.c13s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 27) {
                    try {
                        playDisSound(context13, R.raw.c13s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 28) {
                    try {
                        playDisSound(context13, R.raw.c13s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 29) {
                    try {
                        playDisSound(context13, R.raw.c13s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 30) {
                    try {
                        playDisSound(context13, R.raw.c13s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 31) {
                    try {
                        playDisSound(context13, R.raw.c13s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 32) {
                    try {
                        playDisSound(context13, R.raw.c13s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 33) {
                    try {
                        playDisSound(context13, R.raw.c13s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view13;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer13.isPlaying()){
            try {
                mediaPlayer13.pause();
                mediaPlayer13.seekTo(0);
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

        if(mediaPlayer13.isPlaying()) {
            mediaPlayer13.pause();
            mediaPlayer13.seekTo(0);
        }
        else {
            mediaPlayer13.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer13.prepare();
        }
        mediaPlayer13.start();

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
            if(mediaPlayer13.isPlaying()){
                mediaPlayer13.pause();
                mediaPlayer13.seekTo(0);
            }
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 13","C13"+ pagePosition13);

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onResume() {
        super.onResume();
        mediaPlayer13 = null;
        mediaPlayer13 = new MediaPlayer();
    }
    @Override
    public void onPause(){
        super.onPause();
        if(mediaPlayer13.isPlaying())
        {
            mediaPlayer13.pause();
            mediaPlayer13.seekTo(0);
        }
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer13!=null)
        {
            mediaPlayer13.reset();
            mediaPlayer13.release();
            mediaPlayer13 = null;
        }

    }

}
