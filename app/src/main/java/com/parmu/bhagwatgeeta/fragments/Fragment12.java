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
import com.parmu.bhagwatgeeta.activities.Adhyay12_AC12;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay12_AC12.pagePosition12;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment12#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment12 extends Fragment implements ViewPager.OnPageChangeListener {
    private TextView textView;
    public MediaPlayer mediaPlayer12;
    Context context12;
    ViewPager viewPager12;
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

    public Fragment12() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment12.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment12 newInstance(String param1, String param2) {
        Fragment12 fragment = new Fragment12();
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
        context12= getActivity();
        mediaPlayer12 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View view12=inflater.inflate(R.layout.fragment_12, container, false);
    textView=view12.findViewById(R.id.text_display_12);
    textView.setText(getArguments().getString("message12"));
    constraintLayout = view12.findViewById(R.id.constrained_layout);
    FloatingActionButton fabPlayBtn12 = view12.findViewById(R.id.fabplaysound12);
        viewPager12=getActivity().findViewById(R.id.pager12);
        viewPager12.addOnPageChangeListener(this);

        fabPlayBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay12_AC12.pageGetPosition12();

                if (pagePosition12 == 0) {

                    try {
                        playDisSound(context12, R.raw.c12s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 1) {
                    try {
                        playDisSound(context12, R.raw.c12s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 2) {
                    try {
                        playDisSound(context12, R.raw.c12s3_4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 3) {
                    try {
                        playDisSound(context12, R.raw.c12s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 4) {
                    try {
                        playDisSound(context12, R.raw.c12s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 5) {
                    try {
                        playDisSound(context12, R.raw.c12s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 6) {
                    try {
                        playDisSound(context12, R.raw.c12s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 7) {
                    try {
                        playDisSound(context12, R.raw.c12s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 8) {
                    try {
                        playDisSound(context12, R.raw.c12s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 9) {
                    try {
                        playDisSound(context12, R.raw.c12s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 10) {
                    try {
                        playDisSound(context12, R.raw.c12s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 11) {
                    try {
                        playDisSound(context12, R.raw.c12s13_14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 12) {
                    try {
                        playDisSound(context12, R.raw.c12s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 13) {
                    try {
                        playDisSound(context12, R.raw.c12s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 14) {
                    try {
                        playDisSound(context12, R.raw.c12s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 15) {
                    try {
                        playDisSound(context12, R.raw.c12s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 16) {
                    try {
                        playDisSound(context12, R.raw.c12s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition12 == 17) {
                    try {
                        playDisSound(context12, R.raw.c12s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    return view12;
    }
    
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer12.isPlaying()){mediaPlayer12.pause(); mediaPlayer12.seekTo(0);
        }
        else {
            mediaPlayer12.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer12.prepare();
        }
        mediaPlayer12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer12) {
                mediaPlayer12.stop();
                mediaPlayer12.reset(); }
        });
        mediaPlayer12.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        
    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer12.isPlaying()){
            try {
                mediaPlayer12.stop();
                mediaPlayer12.reset();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            } }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
    @Override
    public void onDestroyView (){
        super.onDestroyView();
        if(mediaPlayer12.isPlaying())
        {
            mediaPlayer12.reset();
            mediaPlayer12.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer12.isPlaying())
        {
            mediaPlayer12.reset();
            mediaPlayer12.release();}
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 12");

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onPause(){
        super.onPause();
        if(mediaPlayer12.isPlaying())
        {
            mediaPlayer12.reset();
            mediaPlayer12.release();}
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer12.isPlaying())
        {
            mediaPlayer12.reset();
            mediaPlayer12.release();}
    }


}