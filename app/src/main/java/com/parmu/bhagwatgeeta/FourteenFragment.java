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

import static com.parmu.bhagwatgeeta.Adhyay14_AC14.pagePosition14;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FourteenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FourteenFragment extends Fragment  implements ViewPager.OnPageChangeListener{
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

    public FourteenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FourteenFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FourteenFragment newInstance(String param1, String param2) {
        FourteenFragment fragment = new FourteenFragment();
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
        mediaPlayer14 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view14= inflater.inflate(R.layout.fragment_fourteen, container, false);
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
    
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer14.isPlaying()){mediaPlayer14.pause(); mediaPlayer14.seekTo(0);
        }
        else {
            mediaPlayer14.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer14.prepare();
        }
        mediaPlayer14.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer14) {
                mediaPlayer14.stop();
                mediaPlayer14.reset(); }
        });
        mediaPlayer14.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer14.isPlaying()){
            try {
                mediaPlayer14.stop();
                mediaPlayer14.reset();
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
        if(mediaPlayer14.isPlaying())
        {
            mediaPlayer14.reset();
            mediaPlayer14.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer14.isPlaying())
        {
            mediaPlayer14.reset();
            mediaPlayer14.release();}
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());
            shareAsBitmap.share_bitMap_to_Apps(getActivity(),constraintLayout,textView);

        }
        return super.onOptionsItemSelected(item);
    }


}
