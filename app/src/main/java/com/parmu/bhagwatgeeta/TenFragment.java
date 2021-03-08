package com.parmu.bhagwatgeeta;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
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

import static com.parmu.bhagwatgeeta.Adhyay10_AC10.pagePosition10;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TenFragment extends Fragment implements ViewPager.OnPageChangeListener {
    private TextView textView;
    public MediaPlayer mediaPlayer10;
    Context context10;
    ViewPager viewPager10;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;
    private ConstraintLayout constraintLayout;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TenFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TenFragment newInstance(String param1, String param2) {
        TenFragment fragment = new TenFragment();
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
        context10= getActivity();
        mediaPlayer10 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view10=inflater.inflate(R.layout.fragment_ten, container, false);
       textView=view10.findViewById(R.id.text_display_10);
      textView.setText(getArguments().getString("message10"));
      constraintLayout = view10.findViewById(R.id.constrained_layout);
      FloatingActionButton fabPlayBtn10 = view10.findViewById(R.id.fabplaysound10);
        viewPager10=getActivity().findViewById(R.id.pager10);
        viewPager10.addOnPageChangeListener(this);
        fabPlayBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Adhyay10_AC10.pageGetPosition10();

                if (pagePosition10 == 0) {

                    try {
                        playDisSound(context10, R.raw.c10s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 1) {
                    try {
                        playDisSound(context10, R.raw.c10s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 2) {
                    try {
                        playDisSound(context10, R.raw.c10s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 3) {
                    try {
                        playDisSound(context10, R.raw.c10s4_5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 4) {
                    try {
                        playDisSound(context10, R.raw.c10s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 5) {
                    try {
                        playDisSound(context10, R.raw.c10s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 6) {
                    try {
                        playDisSound(context10, R.raw.c10s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 7) {
                    try {
                        playDisSound(context10, R.raw.c10s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 8) {
                    try {
                        playDisSound(context10, R.raw.c10s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 9) {
                    try {
                        playDisSound(context10, R.raw.c10s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 10) {
                    try {
                        playDisSound(context10, R.raw.c10s12_13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 11) {
                    try {
                        playDisSound(context10, R.raw.c10s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 12) {
                    try {
                        playDisSound(context10, R.raw.c10s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 13) {
                    try {
                        playDisSound(context10, R.raw.c10s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 14) {
                    try {
                        playDisSound(context10, R.raw.c10s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 15) {
                    try {
                        playDisSound(context10, R.raw.c10s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 16) {
                    try {
                        playDisSound(context10, R.raw.c10s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 17) {
                    try {
                        playDisSound(context10, R.raw.c10s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 18) {
                    try {
                        playDisSound(context10, R.raw.c10s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 19) {
                    try {
                        playDisSound(context10, R.raw.c10s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 20) {
                    try {
                        playDisSound(context10, R.raw.c10s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 21) {
                    try {
                        playDisSound(context10, R.raw.c10s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 22) {
                    try {
                        playDisSound(context10, R.raw.c10s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 23) {
                    try {
                        playDisSound(context10, R.raw.c10s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 24) {
                    try {
                        playDisSound(context10, R.raw.c10s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 25) {
                    try {
                        playDisSound(context10, R.raw.c10s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 26) {
                    try {
                        playDisSound(context10, R.raw.c10s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 27) {
                    try {
                        playDisSound(context10, R.raw.c10s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 28) {
                    try {
                        playDisSound(context10, R.raw.c10s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 29) {
                    try {
                        playDisSound(context10, R.raw.c10s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 30) {
                    try {
                        playDisSound(context10, R.raw.c10s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 31) {
                    try {
                        playDisSound(context10, R.raw.c10s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 32) {
                    try {
                        playDisSound(context10, R.raw.c10s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 33) {
                    try {
                        playDisSound(context10, R.raw.c10s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 34) {
                    try {
                        playDisSound(context10, R.raw.c10s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 35) {
                    try {
                        playDisSound(context10, R.raw.c10s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 36) {
                    try {
                        playDisSound(context10, R.raw.c10s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 37) {
                    try {
                        playDisSound(context10, R.raw.c10s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 38) {
                    try {
                        playDisSound(context10, R.raw.c10s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 39) {
                    try {
                        playDisSound(context10, R.raw.c10s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition10 == 40) {
                    try {
                        playDisSound(context10, R.raw.c10s42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            });
      return view10;
    }
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer10.isPlaying()){mediaPlayer10.pause(); mediaPlayer10.seekTo(0);
        }
        else {
            mediaPlayer10.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer10.prepare();
        }
        mediaPlayer10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer10) {
                mediaPlayer10.stop();
                mediaPlayer10.reset(); }
        });
        mediaPlayer10.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        
    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer10.isPlaying()){
            try {
                mediaPlayer10.stop();
                mediaPlayer10.reset();
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
        if(mediaPlayer10.isPlaying())
        {
            mediaPlayer10.reset();
            mediaPlayer10.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer10.isPlaying())
        {
            mediaPlayer10.reset();
            mediaPlayer10.release();}
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());

            share_bitMap_to_Apps();
        }
        return super.onOptionsItemSelected(item);
    }


    private void share_bitMap_to_Apps() {

        if (ContextCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            String adhyayN="अध्याय 10";
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