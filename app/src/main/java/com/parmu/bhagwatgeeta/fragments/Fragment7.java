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
import com.parmu.bhagwatgeeta.activities.Adhyay7_AC7;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay7_AC7.pagePosition7;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment7#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment7 extends Fragment implements ViewPager.OnPageChangeListener {
    private TextView textView;
    public MediaPlayer mediaPlayer7;
    Context context7;
    ViewPager viewPager2;
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

    public Fragment7() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment7.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment7 newInstance(String param1, String param2) {
        Fragment7 fragment = new Fragment7();
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
        context7= getActivity();
        mediaPlayer7 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view7= inflater.inflate(R.layout.fragment_seven, container, false);
        textView=view7.findViewById(R.id.text_display_7);
        textView.setText(getArguments().getString("message7"));
        constraintLayout = view7.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn7 = view7.findViewById(R.id.fabplaysound7);
        viewPager2=getActivity().findViewById(R.id.pager7);
        viewPager2.addOnPageChangeListener(this);
        fabPlayBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay7_AC7.pageGetPosition7();

                if (pagePosition7 == 0) {

                    try {
                        playDisSound(context7, R.raw.c7s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 1) {
                    try {
                        playDisSound(context7, R.raw.c7s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 2) {
                    try {
                        playDisSound(context7, R.raw.c7s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 3) {
                    try {
                        playDisSound(context7, R.raw.c7s4_5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 4) {
                    try {
                        playDisSound(context7, R.raw.c7s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 5) {
                    try {
                        playDisSound(context7, R.raw.c7s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 6) {
                    try {
                        playDisSound(context7, R.raw.c7s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 7) {
                    try {
                        playDisSound(context7, R.raw.c7s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 8) {
                    try {
                        playDisSound(context7, R.raw.c7s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 9) {
                    try {
                        playDisSound(context7, R.raw.c7s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 10) {
                    try {
                        playDisSound(context7, R.raw.c7s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 11) {
                    try {
                        playDisSound(context7, R.raw.c7s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 12) {
                    try {
                        playDisSound(context7, R.raw.c7s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 13) {
                    try {
                        playDisSound(context7, R.raw.c7s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 14) {
                    try {
                        playDisSound(context7, R.raw.c7s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 15) {
                    try {
                        playDisSound(context7, R.raw.c7s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 16) {
                    try {
                        playDisSound(context7, R.raw.c7s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 17) {
                    try {
                        playDisSound(context7, R.raw.c7s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 18) {
                    try {
                        playDisSound(context7, R.raw.c7s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 19) {
                    try {
                        playDisSound(context7, R.raw.c7s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 20) {
                    try {
                        playDisSound(context7, R.raw.c7s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 21) {
                    try {
                        playDisSound(context7, R.raw.c7s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 22) {
                    try {
                        playDisSound(context7, R.raw.c7s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 23) {
                    try {
                        playDisSound(context7, R.raw.c7s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 24) {
                    try {
                        playDisSound(context7, R.raw.c7s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 25) {
                    try {
                        playDisSound(context7, R.raw.c7s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 26) {
                    try {
                        playDisSound(context7, R.raw.c7s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 27) {
                    try {
                        playDisSound(context7, R.raw.c7s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition7 == 28) {
                    try {
                        playDisSound(context7, R.raw.c7s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view7;
    }

    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer7.isPlaying()){mediaPlayer7.pause(); mediaPlayer7.seekTo(0);
        }
        else {
            mediaPlayer7.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer7.prepare();
        }
        mediaPlayer7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer7) {
                mediaPlayer7.stop();
                mediaPlayer7.reset(); }
        });
        mediaPlayer7.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        
    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer7.isPlaying()){
            try {
                mediaPlayer7.stop();
                mediaPlayer7.reset();
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
        if(mediaPlayer7.isPlaying())
        {
            mediaPlayer7.reset();
            mediaPlayer7.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer7.isPlaying())
        {
            mediaPlayer7.reset();
            mediaPlayer7.release();}
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 7");

        }
        return super.onOptionsItemSelected(item);
    }

}