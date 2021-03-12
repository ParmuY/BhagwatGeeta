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
import com.parmu.bhagwatgeeta.activities.Adhyay14_AC14;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay14_AC14.pagePosition14;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment14#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment14 extends Fragment  implements ViewPager.OnPageChangeListener{
    private TextView textView;
    public MediaPlayer mediaPlayer14;
    Context context14;
    ViewPager viewPager14;
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

    public Fragment14() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment14.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment14 newInstance(String param1, String param2) {
        Fragment14 fragment = new Fragment14();
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
        context14= getActivity();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view14= inflater.inflate(R.layout.fragment_14, container, false);
        textView=view14.findViewById(R.id.text_display_14);
        textView.setText(getArguments().getString("message14"));
        constraintLayout = view14.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn14 = view14.findViewById(R.id.fabplaysound14);
        viewPager14=getActivity().findViewById(R.id.pager14);
        viewPager14.addOnPageChangeListener(this);

        fabPlayBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay14_AC14.pageGetPosition14();

                if (pagePosition14 == 0) {

                    try {
                        playDisSound(context14, R.raw.c14s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 1) {
                    try {
                        playDisSound(context14, R.raw.c14s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 2) {
                    try {
                        playDisSound(context14, R.raw.c14s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 3) {
                    try {
                        playDisSound(context14, R.raw.c14s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 4) {
                    try {
                        playDisSound(context14, R.raw.c14s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 5) {
                    try {
                        playDisSound(context14, R.raw.c14s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 6) {
                    try {
                        playDisSound(context14, R.raw.c14s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 7) {
                    try {
                        playDisSound(context14, R.raw.c14s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 8) {
                    try {
                        playDisSound(context14, R.raw.c14s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 9) {
                    try {
                        playDisSound(context14, R.raw.c14s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 10) {
                    try {
                        playDisSound(context14, R.raw.c14s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 11) {
                    try {
                        playDisSound(context14, R.raw.c14s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 12) {
                    try {
                        playDisSound(context14, R.raw.c14s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 13) {
                    try {
                        playDisSound(context14, R.raw.c14s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 14) {
                    try {
                        playDisSound(context14, R.raw.c14s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 15) {
                    try {
                        playDisSound(context14, R.raw.c14s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 16) {
                    try {
                        playDisSound(context14, R.raw.c14s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 17) {
                    try {
                        playDisSound(context14, R.raw.c14s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 18) {
                    try {
                        playDisSound(context14, R.raw.c14s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 19) {
                    try {
                        playDisSound(context14, R.raw.c14s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 20) {
                    try {
                        playDisSound(context14, R.raw.c14s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 21) {
                    try {
                        playDisSound(context14, R.raw.c14s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 22) {
                    try {
                        playDisSound(context14, R.raw.c14s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 23) {
                    try {
                        playDisSound(context14, R.raw.c14s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 24) {
                    try {
                        playDisSound(context14, R.raw.c14s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 25) {
                    try {
                        playDisSound(context14, R.raw.c14s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition14 == 26) {
                    try {
                        playDisSound(context14, R.raw.c14s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view14;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer14.isPlaying()){
            try {
                mediaPlayer14.pause();
                mediaPlayer14.seekTo(0);
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

        if(mediaPlayer14.isPlaying()) {
            mediaPlayer14.pause();
            mediaPlayer14.seekTo(0);
        }
        else {
            mediaPlayer14.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer14.prepare();
        }
        mediaPlayer14.start();

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
            if(mediaPlayer14.isPlaying()){
                mediaPlayer14.pause();
                mediaPlayer14.seekTo(0);
            }
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 14");

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onResume() {
        super.onResume();
        mediaPlayer14 = null;
        mediaPlayer14 = new MediaPlayer();
    }
    @Override
    public void onPause(){
        super.onPause();
        if(mediaPlayer14.isPlaying())
        {
            mediaPlayer14.pause();
            mediaPlayer14.seekTo(0);
        }
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer14!=null)
        {
            mediaPlayer14.reset();
            mediaPlayer14.release();
            mediaPlayer14 = null;
        }

    }

}
