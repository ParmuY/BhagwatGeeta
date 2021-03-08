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

import static com.parmu.bhagwatgeeta.Adhyay5_AC_5.pagePosition5;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FiveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FiveFragment extends Fragment implements ViewPager.OnPageChangeListener {
    private TextView textView;
    public MediaPlayer mediaPlayer5;
    Context context5;
    ViewPager viewPager5;
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

    public FiveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FiveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FiveFragment newInstance(String param1, String param2) {
        FiveFragment fragment = new FiveFragment();
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
        context5= getActivity();
        mediaPlayer5 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view5=inflater.inflate(R.layout.fragment_five, container, false);
       textView=view5.findViewById(R.id.text_display_5);
       textView.setText(getArguments().getString("message5"));
       constraintLayout = view5.findViewById(R.id.constrained_layout);
       FloatingActionButton fabPlayBtn2 = view5.findViewById(R.id.fabplaysound5);
        viewPager5=getActivity().findViewById(R.id.pager5);
        viewPager5.addOnPageChangeListener(this);

        fabPlayBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay5_AC_5.pageGetPosition5();

                if (pagePosition5 == 0) {

                    try {
                        playDisSound(context5, R.raw.c5s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 1) {
                    try {
                        playDisSound(context5, R.raw.c5s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 2) {
                    try {
                        playDisSound(context5, R.raw.c5s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 3) {
                    try {
                        playDisSound(context5, R.raw.c5s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 4) {
                    try {
                        playDisSound(context5, R.raw.c5s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 5) {
                    try {
                        playDisSound(context5, R.raw.c5s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 6) {
                    try {
                        playDisSound(context5, R.raw.c5s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 7) {
                    try {
                        playDisSound(context5, R.raw.c5s8_9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 8) {
                    try {
                        playDisSound(context5, R.raw.c5s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 9) {
                    try {
                        playDisSound(context5, R.raw.c5s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 10) {
                    try {
                        playDisSound(context5, R.raw.c5s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 11) {
                    try {
                        playDisSound(context5, R.raw.c5s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 12) {
                    try {
                        playDisSound(context5, R.raw.c5s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 13) {
                    try {
                        playDisSound(context5, R.raw.c5s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 14) {
                    try {
                        playDisSound(context5, R.raw.c5s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 15) {
                    try {
                        playDisSound(context5, R.raw.c5s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 16) {
                    try {
                        playDisSound(context5, R.raw.c5s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 17) {
                    try {
                        playDisSound(context5, R.raw.c5s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 18) {
                    try {
                        playDisSound(context5, R.raw.c5s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 19) {
                    try {
                        playDisSound(context5, R.raw.c5s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 20) {
                    try {
                        playDisSound(context5, R.raw.c5s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 21) {
                    try {
                        playDisSound(context5, R.raw.c5s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 22) {
                    try {
                        playDisSound(context5, R.raw.c5s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 23) {
                    try {
                        playDisSound(context5, R.raw.c5s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 24) {
                    try {
                        playDisSound(context5, R.raw.c5s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 27) {
                    try {
                        playDisSound(context5, R.raw.c5s27_28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition5 == 26) {
                    try {
                        playDisSound(context5, R.raw.c5s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            });
       return view5;

    }
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer5.isPlaying()){mediaPlayer5.pause(); mediaPlayer5.seekTo(0);
        }
        else {
            mediaPlayer5.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer5.prepare();
        }
        mediaPlayer5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer5) {
                mediaPlayer5.stop();
                mediaPlayer5.reset(); }
        });
        mediaPlayer5.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        
    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer5.isPlaying()){
            try {
                mediaPlayer5.stop();
                mediaPlayer5.reset();
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
        if(mediaPlayer5.isPlaying())
        {
            mediaPlayer5.reset();
            mediaPlayer5.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer5.isPlaying())
        {
            mediaPlayer5.reset();
            mediaPlayer5.release();}

        int id = item.getItemId();
        if (id==R.id.share_shlola){
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());            share_bitMap_to_Apps();
        }
        return super.onOptionsItemSelected(item);
    }

    private void share_bitMap_to_Apps() {

        if (ContextCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            String adhyayN="अध्याय 5";
            String appDes = "\uD83D\uDD05"+adhyayN+"\uD83D\uDD05\n\uD83D\uDE4Fश्रीमद्भगवद्गीता\uD83D\uDE4F\nShared via Bhagvad Gita app\uD83D\uDC47"+"here will come the app link";
            Intent i = new Intent(Intent.ACTION_SEND);
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