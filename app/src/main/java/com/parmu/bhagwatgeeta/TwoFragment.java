package com.parmu.bhagwatgeeta;

import android.Manifest;
import android.content.ContentResolver;
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
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;


import android.provider.MediaStore;
import android.util.Log;
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


import static com.parmu.bhagwatgeeta.Adhyay2_AC2.pagePosition2;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TwoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TwoFragment extends Fragment implements ViewPager.OnPageChangeListener {
    private TextView textView;
    public MediaPlayer mediaPlayer2;
    Context context2;
    ViewPager viewPager2;
    private static final int STORAGE_PERMISSION_CODE = 101;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TwoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TwoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TwoFragment newInstance(String param1, String param2) {
        TwoFragment fragment = new TwoFragment();
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
        context2= getActivity();
        mediaPlayer2 = new MediaPlayer();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view2= inflater.inflate(R.layout.fragment_two, container, false);
        textView=view2.findViewById(R.id.text_display_2);
        textView.setText(getArguments().getString("message2"));


        FloatingActionButton fabPlayBtn2 = view2.findViewById(R.id.fabplaysound2);
        viewPager2=getActivity().findViewById(R.id.pager2);
        viewPager2.addOnPageChangeListener(this);






        fabPlayBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay2_AC2.pageGetPosition2();

                if (pagePosition2==0) {

                    try {
                        playDisSound(context2,R.raw.c2s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==1)
                {
                    try {
                        playDisSound(context2,R.raw.c2s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==2)
                {
                    try {
                        playDisSound(context2,R.raw.c2s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==3)
                {
                    try {
                        playDisSound(context2,R.raw.c2s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==4)
                {
                    try {
                        playDisSound(context2,R.raw.c2s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==5)
                {
                    try {
                        playDisSound(context2,R.raw.c2s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==6)
                {
                    try {
                        playDisSound(context2,R.raw.c2s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==7)
                {
                    try {
                        playDisSound(context2,R.raw.c2s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==8)
                {
                    try {
                        playDisSound(context2,R.raw.c2s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==9)
                {
                    try {
                        playDisSound(context2,R.raw.c2s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==10)
                {
                    try {
                        playDisSound(context2,R.raw.c2s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==11)
                {
                    try {
                        playDisSound(context2,R.raw.c2s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==12)
                {
                    try {
                        playDisSound(context2,R.raw.c2s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==13)
                {
                    try {
                        playDisSound(context2,R.raw.c2s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==14)
                {
                    try {
                        playDisSound(context2,R.raw.c2s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==15)
                {
                    try {
                        playDisSound(context2,R.raw.c2s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==16)
                {
                    try {
                        playDisSound(context2,R.raw.c2s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==17)
                {
                    try {
                        playDisSound(context2,R.raw.c2s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==18)
                {
                    try {
                        playDisSound(context2,R.raw.c2s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==19)
                {
                    try {
                        playDisSound(context2,R.raw.c2s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==20)
                {
                    try {
                        playDisSound(context2,R.raw.c2s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==21)
                {
                    try {
                        playDisSound(context2,R.raw.c2s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==22)
                {
                    try {
                        playDisSound(context2,R.raw.c2s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==23)
                {
                    try {
                        playDisSound(context2,R.raw.c2s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==24)
                {
                    try {
                        playDisSound(context2,R.raw.c2s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==25)
                {
                    try {
                        playDisSound(context2,R.raw.c2s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==26)
                {
                    try {
                        playDisSound(context2,R.raw.c2s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==27)
                {
                    try {
                        playDisSound(context2,R.raw.c2s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==28)
                {
                    try {
                        playDisSound(context2,R.raw.c2s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==29)
                {
                    try {
                        playDisSound(context2,R.raw.c2s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==30)
                {
                    try {
                        playDisSound(context2,R.raw.c2s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==31)
                {
                    try {
                        playDisSound(context2,R.raw.c2s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==32)
                {
                    try {
                        playDisSound(context2,R.raw.c2s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==33)
                {
                    try {
                        playDisSound(context2,R.raw.c2s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==34)
                {
                    try {
                        playDisSound(context2,R.raw.c2s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==35)
                {
                    try {
                        playDisSound(context2,R.raw.c2s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==36)
                {
                    try {
                        playDisSound(context2,R.raw.c2s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==37)
                {
                    try {
                        playDisSound(context2,R.raw.c2s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==38)
                {
                    try {
                        playDisSound(context2,R.raw.c2s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==39)
                {
                    try {
                        playDisSound(context2,R.raw.c2s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==40)
                {
                    try {
                        playDisSound(context2,R.raw.c2s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==41)
                {
                    try {
                        playDisSound(context2,R.raw.c2s42_43_44);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==42)
                {
                    try {
                        playDisSound(context2,R.raw.c2s45);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==43)
                {
                    try {
                        playDisSound(context2,R.raw.c2s46);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==44)
                {
                    try {
                        playDisSound(context2,R.raw.c2s47);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==45)
                {
                    try {
                        playDisSound(context2,R.raw.c2s48);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==46)
                {
                    try {
                        playDisSound(context2,R.raw.c2s49);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==47)
                {
                    try {
                        playDisSound(context2,R.raw.c2s50);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==48)
                {
                    try {
                        playDisSound(context2,R.raw.c2s51);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==49)
                {
                    try {
                        playDisSound(context2,R.raw.c2s52);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==50)
                {
                    try {
                        playDisSound(context2,R.raw.c2s53);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==51)
                {
                    try {
                        playDisSound(context2,R.raw.c2s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==52)
                {
                    try {
                        playDisSound(context2,R.raw.c2s55);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==53)
                {
                    try {
                        playDisSound(context2,R.raw.c2s56);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==54)
                {
                    try {
                        playDisSound(context2,R.raw.c2s57);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==55)
                {
                    try {
                        playDisSound(context2,R.raw.c2s58);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==56)
                {
                    try {
                        playDisSound(context2,R.raw.c2s59);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==57)
                {
                    try {
                        playDisSound(context2,R.raw.c2s60);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==58)
                {
                    try {
                        playDisSound(context2,R.raw.c2s61);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==59)
                {
                    try {
                        playDisSound(context2,R.raw.c2s62);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==60)
                {
                    try {
                        playDisSound(context2,R.raw.c2s63);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==61)
                {
                    try {
                        playDisSound(context2,R.raw.c2s64);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==62)
                {
                    try {
                        playDisSound(context2,R.raw.c2s65);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==63)
                {
                    try {
                        playDisSound(context2,R.raw.c2s66);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==64)
                {
                    try {
                        playDisSound(context2,R.raw.c2s67);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==65)
                {
                    try {
                        playDisSound(context2,R.raw.c2s68);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==66)
                {
                    try {
                        playDisSound(context2,R.raw.c2s69);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==67)
                {
                    try {
                        playDisSound(context2,R.raw.c2s70);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==68)
                {
                    try {
                        playDisSound(context2,R.raw.c2s71);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition2==69)
                {
                    try {
                        playDisSound(context2,R.raw.c2s72);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }
        });
        return view2;
    }

    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer2.isPlaying()){mediaPlayer2.pause(); mediaPlayer2.seekTo(0);
        }
        else {
            mediaPlayer2.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer2.prepare();
        }
        mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer2) {
                mediaPlayer2.stop();
                mediaPlayer2.reset(); }
        });
        mediaPlayer2.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        
    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer2.isPlaying()){
            try {
                mediaPlayer2.stop();
                mediaPlayer2.reset();
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
        if(mediaPlayer2.isPlaying())
        {
            mediaPlayer2.reset();
            mediaPlayer2.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer2.isPlaying())
        {
            mediaPlayer2.reset();
            mediaPlayer2.release();}
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE);
            share_bitMap_to_Apps();
        }
        return super.onOptionsItemSelected(item);
    }

    //sharing image form of shloka
    private Uri getImageUri(Context inContext, Bitmap inImage) {

       ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        inImage.compress(Bitmap.CompressFormat.PNG, 100, bytes);
        try {
            bytes.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bytes.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "title", null);
        return Uri.parse(path);
    }

    private void share_bitMap_to_Apps() {
        //when user denies permission for storage the stop app show ANR
        if (ContextCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            String adhyayN="अध्याय 2";
            String appDes = "\uD83D\uDD05"+adhyayN+"\uD83D\uDD05\n\uD83D\uDE4Fश्रीमद्भगवद्गीता\uD83D\uDE4F\nShared via Bhagvad Gita app\uD83D\uDC47"+"here will come the app link";
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("*/*");
            i.putExtra(Intent.EXTRA_STREAM, getImageUri(getContext(), getBitmapFromView(textView)));
            i.putExtra(Intent.EXTRA_TEXT,appDes);

            try {
                startActivityForResult(Intent.createChooser(i, "Share by"),512);
            } catch (android.content.ActivityNotFoundException ex) {

                ex.printStackTrace();
            }
        }
    }

    private static Bitmap getBitmapFromView(View view) {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(),view.getHeight(), Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        //Get the view's background
        Drawable bgDrawable = view.getBackground();
        if (bgDrawable != null)
            //has background drawable, then draw it on the canvas
            bgDrawable.draw(canvas);
        else
            //does not have background drawable, then draw white background on the canvas
            canvas.drawColor(Color.WHITE);
        // draw the view on the canvas
        view.draw(canvas);
        //return the bitmap
        return returnedBitmap;
    }

    // Function to check and request permission.
    public void checkPermission(String permission, int requestCode)
    {
        if (ContextCompat.checkSelfPermission(getActivity().getApplicationContext(), permission) == PackageManager.PERMISSION_DENIED) {
            // Requesting the permission
            ActivityCompat.requestPermissions(getActivity(), new String[] { permission }, requestCode);
        }

    }
    // This function is called when the user accepts or decline the permission.
// Request Code is used to check which permission called this function.
// This request code is provided when the user is prompt for permission.
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == STORAGE_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(getActivity(), "Storage Permission Granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getActivity().getApplicationContext(), "Storage Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,resultCode, data);



    }

}