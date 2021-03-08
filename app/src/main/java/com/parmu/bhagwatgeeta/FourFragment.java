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


import static com.parmu.bhagwatgeeta.Adhyay4_AC4.pagePosition4;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FourFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FourFragment extends Fragment implements ViewPager.OnPageChangeListener {
    private TextView textView;
    public MediaPlayer mediaPlayer4;
    Context context4;
    ViewPager viewPager4;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;
    ConstraintLayout constraintLayout;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FourFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FourFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FourFragment newInstance(String param1, String param2) {
        FourFragment fragment = new FourFragment();
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
        context4 = getActivity();
        mediaPlayer4 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view4=inflater.inflate(R.layout.fragment_four, container, false);
       textView=view4.findViewById(R.id.text_display_4);
       textView.setText(getArguments().getString("message4"));
       constraintLayout= view4.findViewById(R.id.constrained_layout);
       FloatingActionButton fabPlayBtn4 = view4.findViewById(R.id.fabplaysound4);
        viewPager4=getActivity().findViewById(R.id.pager4);
        viewPager4.addOnPageChangeListener(this);



        fabPlayBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay4_AC4.pageGetPosition4();

                if (pagePosition4 == 0) {

                    try {
                        playDisSound(context4, R.raw.c4s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 1) {
                    try {
                        playDisSound(context4, R.raw.c4s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 2) {
                    try {
                        playDisSound(context4, R.raw.c4s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 3) {
                    try {
                        playDisSound(context4, R.raw.c4s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 4) {
                    try {
                        playDisSound(context4, R.raw.c4s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 5) {
                    try {
                        playDisSound(context4, R.raw.c4s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 6) {
                    try {
                        playDisSound(context4, R.raw.c4s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 7) {
                    try {
                        playDisSound(context4, R.raw.c4s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 8) {
                    try {
                        playDisSound(context4, R.raw.c4s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 9) {
                    try {
                        playDisSound(context4, R.raw.c4s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 10) {
                    try {
                        playDisSound(context4, R.raw.c4s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 11) {
                    try {
                        playDisSound(context4, R.raw.c4s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 12) {
                    try {
                        playDisSound(context4, R.raw.c4s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 13) {
                    try {
                        playDisSound(context4, R.raw.c4s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 14) {
                    try {
                        playDisSound(context4, R.raw.c4s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 15) {
                    try {
                        playDisSound(context4, R.raw.c4s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 16) {
                    try {
                        playDisSound(context4, R.raw.c4s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 17) {
                    try {
                        playDisSound(context4, R.raw.c4s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 18) {
                    try {
                        playDisSound(context4, R.raw.c4s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 19) {
                    try {
                        playDisSound(context4, R.raw.c4s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 20) {
                    try {
                        playDisSound(context4, R.raw.c4s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 21) {
                    try {
                        playDisSound(context4, R.raw.c4s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 22) {
                    try {
                        playDisSound(context4, R.raw.c4s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 23) {
                    try {
                        playDisSound(context4, R.raw.c4s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 24) {
                    try {
                        playDisSound(context4, R.raw.c4s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 25) {
                    try {
                        playDisSound(context4, R.raw.c4s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 26) {
                    try {
                        playDisSound(context4, R.raw.c4s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 27) {
                    try {
                        playDisSound(context4, R.raw.c4s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 28) {
                    try {
                        playDisSound(context4, R.raw.c4s29_30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 29) {
                    try {
                        playDisSound(context4, R.raw.c4s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 30) {
                    try {
                        playDisSound(context4, R.raw.c4s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 31) {
                    try {
                        playDisSound(context4, R.raw.c4s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 32) {
                    try {
                        playDisSound(context4, R.raw.c4s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 33) {
                    try {
                        playDisSound(context4, R.raw.c4s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 34) {
                    try {
                        playDisSound(context4, R.raw.c4s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 35) {
                    try {
                        playDisSound(context4, R.raw.c4s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 36) {
                    try {
                        playDisSound(context4, R.raw.c4s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 37) {
                    try {
                        playDisSound(context4, R.raw.c4s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 38) {
                    try {
                        playDisSound(context4, R.raw.c4s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 39) {
                    try {
                        playDisSound(context4, R.raw.c4s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition4 == 40) {
                    try {
                        playDisSound(context4, R.raw.c4s42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
       return view4;
    }

    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer4.isPlaying()){mediaPlayer4.pause(); mediaPlayer4.seekTo(0);
        }
        else {
            mediaPlayer4.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer4.prepare();
        }
        mediaPlayer4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer2) {
                mediaPlayer4.stop();
                mediaPlayer4.reset(); }
        });
        mediaPlayer4.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        
    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer4.isPlaying()){
            try {
                mediaPlayer4.stop();
                mediaPlayer4.reset();
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
        if(mediaPlayer4.isPlaying())
        {
            mediaPlayer4.reset();
            mediaPlayer4.release();}
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer4.isPlaying())
        {
            mediaPlayer4.reset();
            mediaPlayer4.release();}
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());            share_bitMap_to_Apps();
        }
        return super.onOptionsItemSelected(item);
    }

    private void share_bitMap_to_Apps() {
        if (ContextCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            String adhyayN="अध्याय 4";
            String appDes = "\uD83D\uDD05"+adhyayN+"\uD83D\uDD05\n\uD83D\uDE4Fश्रीमद्भगवद्गीता\uD83D\uDE4F\nShared via Bhagvad Gita app\uD83D\uDC47"+"here will come the app link";
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("*/*");
            i.putExtra(Intent.EXTRA_STREAM, getImageUri(getBitmapFromView(constraintLayout,textView)));
            i.putExtra(Intent.EXTRA_TEXT,appDes);
            try {
                startActivity(Intent.createChooser(i, "Share by"));
            } catch (android.content.ActivityNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
    //sharing image form of shloka
    private Uri getImageUri(Bitmap inImage) {

        String dirPath = Environment.getExternalStorageDirectory().getAbsolutePath()+"/BhagwatGeeta";
        File dir = new File(dirPath);
        if(!dir.exists()){
            dir.mkdirs();
        }
        File imgFile = new File(dirPath,"image"+".png");
        if (imgFile.exists()) {
            imgFile.delete();
        }
        else{
            try {
                imgFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {

            FileOutputStream fos = new FileOutputStream(imgFile);
            inImage.compress(Bitmap.CompressFormat.PNG,100,fos);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Uri.parse(imgFile.getAbsolutePath());

    }

    private  Bitmap getBitmapFromView(View bView, TextView textView) {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(bView.getWidth(),bView.getHeight(), Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            bView.setBackgroundResource(R.drawable.paper_texture_brown);
            textView.setTextColor(Color.BLACK);
        }
        bView.draw(canvas);
        //return the bitmap
        return returnedBitmap;
    }
}