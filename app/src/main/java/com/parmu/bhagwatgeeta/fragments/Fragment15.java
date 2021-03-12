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
import com.parmu.bhagwatgeeta.activities.Adhyay15_AC15;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.RequestPermissions;
import com.parmu.bhagwatgeeta.misc.ShareAsBitmap;

import java.io.IOException;

import static com.parmu.bhagwatgeeta.activities.Adhyay15_AC15.pagePosition15;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment15#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment15 extends Fragment  implements ViewPager.OnPageChangeListener{
    private TextView textView;
    public MediaPlayer mediaPlayer15;
    Context context15;
    ViewPager viewPager15;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions ;
    private ConstraintLayout constraintLayout;
    private final ShareAsBitmap shareAsBitmap = new ShareAsBitmap();



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment15() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment15.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment15 newInstance(String param1, String param2) {
        Fragment15 fragment = new Fragment15();
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
        context15= getActivity();
        mediaPlayer15 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view15= inflater.inflate(R.layout.fragment_15, container, false);
        textView=view15.findViewById(R.id.text_display_15);
        textView.setText(getArguments().getString("message15"));
        constraintLayout =view15.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn15 = view15.findViewById(R.id.fabplaysound15);
        viewPager15=getActivity().findViewById(R.id.pager15);
        viewPager15.addOnPageChangeListener(this);
        fabPlayBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay15_AC15.pageGetPosition15();

                if (pagePosition15 == 0) {

                    try {
                        playDisSound(context15, R.raw.c15s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 1) {
                    try {
                        playDisSound(context15, R.raw.c15s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 2) {
                    try {
                        playDisSound(context15, R.raw.c15s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 3) {
                    try {
                        playDisSound(context15, R.raw.c15s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 4) {
                    try {
                        playDisSound(context15, R.raw.c15s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 5) {
                    try {
                        playDisSound(context15, R.raw.c15s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 6) {
                    try {
                        playDisSound(context15, R.raw.c15s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 7) {
                    try {
                        playDisSound(context15, R.raw.c15s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 8) {
                    try {
                        playDisSound(context15, R.raw.c15s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 9) {
                    try {
                        playDisSound(context15, R.raw.c15s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 10) {
                    try {
                        playDisSound(context15, R.raw.c15s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 11) {
                    try {
                        playDisSound(context15, R.raw.c15s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 12) {
                    try {
                        playDisSound(context15, R.raw.c15s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 13) {
                    try {
                        playDisSound(context15, R.raw.c15s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 14) {
                    try {
                        playDisSound(context15, R.raw.c15s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 15) {
                    try {
                        playDisSound(context15, R.raw.c15s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 16) {
                    try {
                        playDisSound(context15, R.raw.c15s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 17) {
                    try {
                        playDisSound(context15, R.raw.c15s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 18) {
                    try {
                        playDisSound(context15, R.raw.c15s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition15 == 19) {
                    try {
                        playDisSound(context15, R.raw.c15s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view15;
    }
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer15.isPlaying()){mediaPlayer15.pause(); mediaPlayer15.seekTo(0);
        }
        else {
            mediaPlayer15.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer15.prepare();
        }
        mediaPlayer15.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer15) {
                mediaPlayer15.stop();
                mediaPlayer15.reset(); }
        });
        mediaPlayer15.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer15.isPlaying()){
            try {
                mediaPlayer15.stop();
                mediaPlayer15.reset();
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
        if(mediaPlayer15.isPlaying())
        {
            mediaPlayer15.reset();
            mediaPlayer15.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer15.isPlaying())
        {
            mediaPlayer15.reset();
            mediaPlayer15.release();}
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView,"अध्याय 15");

        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onPause(){
        super.onPause();
        if(mediaPlayer15.isPlaying())
        {
            mediaPlayer15.reset();
            mediaPlayer15.release();}
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer15.isPlaying())
        {
            mediaPlayer15.reset();
            mediaPlayer15.release();}
    }


}