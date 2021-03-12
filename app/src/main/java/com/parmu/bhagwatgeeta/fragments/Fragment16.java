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
import com.parmu.bhagwatgeeta.activities.Adhyay16_AC16;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay16_AC16.pagePosition16;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment16#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment16 extends Fragment implements ViewPager.OnPageChangeListener {
    private TextView textView;
    public MediaPlayer mediaPlayer16;
    Context context16;
    ViewPager viewPager16;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();
    private ConstraintLayout constraintLayout;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment16() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment16.
     */
    // TODO: Rename and change types and number of parameters
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
        context16= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View view16=inflater.inflate(R.layout.fragment_16, container, false);
     textView=view16.findViewById(R.id.text_display_16);
     textView.setText(getArguments().getString("message16"));
     constraintLayout = view16.findViewById(R.id.constrained_layout);
     FloatingActionButton fabPlayBtn16 = view16.findViewById(R.id.fabplaysound16);
        viewPager16=getActivity().findViewById(R.id.pager16);
        viewPager16.addOnPageChangeListener(this);
        fabPlayBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay16_AC16.pageGetPosition16();

                if (pagePosition16 == 0) {

                    try {
                        playDisSound(context16, R.raw.c16s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 1) {
                    try {
                        playDisSound(context16, R.raw.c16s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 2) {
                    try {
                        playDisSound(context16, R.raw.c16s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 3) {
                    try {
                        playDisSound(context16, R.raw.c16s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 4) {
                    try {
                        playDisSound(context16, R.raw.c16s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 5) {
                    try {
                        playDisSound(context16, R.raw.c16s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 6) {
                    try {
                        playDisSound(context16, R.raw.c16s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 7) {
                    try {
                        playDisSound(context16, R.raw.c16s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 8) {
                    try {
                        playDisSound(context16, R.raw.c16s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 9) {
                    try {
                        playDisSound(context16, R.raw.c16s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 10) {
                    try {
                        playDisSound(context16, R.raw.c16s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 11) {
                    try {
                        playDisSound(context16, R.raw.c16s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 12) {
                    try {
                        playDisSound(context16, R.raw.c16s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 13) {
                    try {
                        playDisSound(context16, R.raw.c16s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 14) {
                    try {
                        playDisSound(context16, R.raw.c16s15_16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 15) {
                    try {
                        playDisSound(context16, R.raw.c16s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 16) {
                    try {
                        playDisSound(context16, R.raw.c16s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 17) {
                    try {
                        playDisSound(context16, R.raw.c16s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 18) {
                    try {
                        playDisSound(context16, R.raw.c16s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 19) {
                    try {
                        playDisSound(context16, R.raw.c16s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 20) {
                    try {
                        playDisSound(context16, R.raw.c16s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 21) {
                    try {
                        playDisSound(context16, R.raw.c16s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 22) {
                    try {
                        playDisSound(context16, R.raw.c16s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
     return view16;

    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer16.isPlaying()){
            try {
                mediaPlayer16.pause();
                mediaPlayer16.seekTo(0);
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

        if(mediaPlayer16.isPlaying()) {
            mediaPlayer16.pause();
            mediaPlayer16.seekTo(0);
        }
        else {
            mediaPlayer16.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer16.prepare();
        }
        mediaPlayer16.start();

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
            if(mediaPlayer16.isPlaying()){
                mediaPlayer16.pause();
                mediaPlayer16.seekTo(0);
            }
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 16");

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onResume() {
        super.onResume();
        mediaPlayer16 = null;
        mediaPlayer16 = new MediaPlayer();
    }
    @Override
    public void onPause(){
        super.onPause();
        if(mediaPlayer16.isPlaying())
        {
            mediaPlayer16.pause();
            mediaPlayer16.seekTo(0);
        }
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer16!=null)
        {
            mediaPlayer16.reset();
            mediaPlayer16.release();
            mediaPlayer16 = null;
        }

    }


}