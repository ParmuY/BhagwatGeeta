package com.parmu.bhagwatgeeta;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.parmu.bhagwatgeeta.Adhyay9_AC9.pagePosition9;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NineFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NineFragment extends Fragment implements ViewPager.OnPageChangeListener{
    private TextView textView;
    public MediaPlayer mediaPlayer9;
    Context context9;
    ViewPager viewPager9;
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

    public NineFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NineFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NineFragment newInstance(String param1, String param2) {
        NineFragment fragment = new NineFragment();
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
        context9= getActivity();
        mediaPlayer9 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view9= inflater.inflate(R.layout.fragment_nine, container, false);
       textView=view9.findViewById(R.id.text_display_9);
       textView.setText(getArguments().getString("message9"));
        constraintLayout =view9.findViewById(R.id.constrained_layout);
        FloatingActionButton fabPlayBtn9 = view9.findViewById(R.id.fabplaysound9);
        viewPager9=getActivity().findViewById(R.id.pager9);
        viewPager9.addOnPageChangeListener(this);
         fabPlayBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay9_AC9.pageGetPosition9();

                if (pagePosition9 == 0) {

                    try {
                        playDisSound(context9, R.raw.c9s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 1) {
                    try {
                        playDisSound(context9, R.raw.c9s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 2) {
                    try {
                        playDisSound(context9, R.raw.c9s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 3) {
                    try {
                        playDisSound(context9, R.raw.c9s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 4) {
                    try {
                        playDisSound(context9, R.raw.c9s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 5) {
                    try {
                        playDisSound(context9, R.raw.c9s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 6) {
                    try {
                        playDisSound(context9, R.raw.c9s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 7) {
                    try {
                        playDisSound(context9, R.raw.c9s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 8) {
                    try {
                        playDisSound(context9, R.raw.c9s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 9) {
                    try {
                        playDisSound(context9, R.raw.c9s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 10) {
                    try {
                        playDisSound(context9, R.raw.c9s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 11) {
                    try {
                        playDisSound(context9, R.raw.c9s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 12) {
                    try {
                        playDisSound(context9, R.raw.c9s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 13) {
                    try {
                        playDisSound(context9, R.raw.c9s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 14) {
                    try {
                        playDisSound(context9, R.raw.c9s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 15) {
                    try {
                        playDisSound(context9, R.raw.c9s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 16) {
                    try {
                        playDisSound(context9, R.raw.c9s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 17) {
                    try {
                        playDisSound(context9, R.raw.c9s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 18) {
                    try {
                        playDisSound(context9, R.raw.c9s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 19) {
                    try {
                        playDisSound(context9, R.raw.c9s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 20) {
                    try {
                        playDisSound(context9, R.raw.c9s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 21) {
                    try {
                        playDisSound(context9, R.raw.c9s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 22) {
                    try {
                        playDisSound(context9, R.raw.c9s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 23) {
                    try {
                        playDisSound(context9, R.raw.c9s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 24) {
                    try {
                        playDisSound(context9, R.raw.c9s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 25) {
                    try {
                        playDisSound(context9, R.raw.c9s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 26) {
                    try {
                        playDisSound(context9, R.raw.c9s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 27) {
                    try {
                        playDisSound(context9, R.raw.c9s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 28) {
                    try {
                        playDisSound(context9, R.raw.c9s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 29) {
                    try {
                        playDisSound(context9, R.raw.c9s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 30) {
                    try {
                        playDisSound(context9, R.raw.c9s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 31) {
                    try {
                        playDisSound(context9, R.raw.c9s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 32) {
                    try {
                        playDisSound(context9, R.raw.c9s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition9 == 33) {
                    try {
                        playDisSound(context9, R.raw.c9s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
       return view9;
    }
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer9.isPlaying()){mediaPlayer9.pause(); mediaPlayer9.seekTo(0);
        }
        else {
            mediaPlayer9.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer9.prepare();
        }
        mediaPlayer9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer9) {
                mediaPlayer9.stop();
                mediaPlayer9.reset(); }
        });
        mediaPlayer9.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        
    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer9.isPlaying()){
            try {
                mediaPlayer9.stop();
                mediaPlayer9.reset();
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
        if(mediaPlayer9.isPlaying())
        {
            mediaPlayer9.reset();
            mediaPlayer9.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer9.isPlaying())
        {
            mediaPlayer9.reset();
            mediaPlayer9.release();}
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView);

        }
        return super.onOptionsItemSelected(item);
    }


}