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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

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
import java.io.IOException;

import static com.parmu.bhagwatgeeta.Adhyay18_AC18.pagePosition18;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EighteenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EighteenFragment extends Fragment implements ViewPager.OnPageChangeListener{
    private TextView textView;
    public MediaPlayer mediaPlayer18;
    Context context18;
    ViewPager viewPager18;
    private static final int STORAGE_PERMISSION_CODE = 101;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EighteenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EighteenFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EighteenFragment newInstance(String param1, String param2) {
        EighteenFragment fragment = new EighteenFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        context18= getActivity();
        mediaPlayer18 = new MediaPlayer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view18= inflater.inflate(R.layout.fragment_eighteen, container, false);
      textView=view18.findViewById(R.id.text_display_18);
      textView.setText(getArguments().getString("message18"));


        FloatingActionButton fabPlayBtn18 = view18.findViewById(R.id.fabplaysound18);
        viewPager18=getActivity().findViewById(R.id.pager18);
        viewPager18.addOnPageChangeListener(this);






        fabPlayBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay18_AC18.pageGetPosition18();

                if (pagePosition18==0) {

                    try {
                        playDisSound(context18,R.raw.c18s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==1)
                {
                    try {
                        playDisSound(context18,R.raw.c18s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==2)
                {
                    try {
                        playDisSound(context18,R.raw.c18s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==3)
                {
                    try {
                        playDisSound(context18,R.raw.c18s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==4)
                {
                    try {
                        playDisSound(context18,R.raw.c18s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==5)
                {
                    try {
                        playDisSound(context18,R.raw.c18s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==6)
                {
                    try {
                        playDisSound(context18,R.raw.c18s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==7)
                {
                    try {
                        playDisSound(context18,R.raw.c18s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==8)
                {
                    try {
                        playDisSound(context18,R.raw.c18s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==9)
                {
                    try {
                        playDisSound(context18,R.raw.c18s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==10)
                {
                    try {
                        playDisSound(context18,R.raw.c18s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==11)
                {
                    try {
                        playDisSound(context18,R.raw.c18s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==12)
                {
                    try {
                        playDisSound(context18,R.raw.c18s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==13)
                {
                    try {
                        playDisSound(context18,R.raw.c18s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==14)
                {
                    try {
                        playDisSound(context18,R.raw.c18s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==15)
                {
                    try {
                        playDisSound(context18,R.raw.c18s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==16)
                {
                    try {
                        playDisSound(context18,R.raw.c18s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==17)
                {
                    try {
                        playDisSound(context18,R.raw.c18s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==18)
                {
                    try {
                        playDisSound(context18,R.raw.c18s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==19)
                {
                    try {
                        playDisSound(context18,R.raw.c18s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==20)
                {
                    try {
                        playDisSound(context18,R.raw.c18s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==21)
                {
                    try {
                        playDisSound(context18,R.raw.c18s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==22)
                {
                    try {
                        playDisSound(context18,R.raw.c18s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==23)
                {
                    try {
                        playDisSound(context18,R.raw.c18s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==24)
                {
                    try {
                        playDisSound(context18,R.raw.c18s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==25)
                {
                    try {
                        playDisSound(context18,R.raw.c18s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==26)
                {
                    try {
                        playDisSound(context18,R.raw.c18s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==27)
                {
                    try {
                        playDisSound(context18,R.raw.c18s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==28)
                {
                    try {
                        playDisSound(context18,R.raw.c18s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==29)
                {
                    try {
                        playDisSound(context18,R.raw.c18s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==30)
                {
                    try {
                        playDisSound(context18,R.raw.c18s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==31)
                {
                    try {
                        playDisSound(context18,R.raw.c18s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==32)
                {
                    try {
                        playDisSound(context18,R.raw.c18s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==33)
                {
                    try {
                        playDisSound(context18,R.raw.c18s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==34)
                {
                    try {
                        playDisSound(context18,R.raw.c18s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==35)
                {
                    try {
                        playDisSound(context18,R.raw.c18s36_37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==36)
                {
                    try {
                        playDisSound(context18,R.raw.c18s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==37)
                {
                    try {
                        playDisSound(context18,R.raw.c18s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==38)
                {
                    try {
                        playDisSound(context18,R.raw.c18s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==39)
                {
                    try {
                        playDisSound(context18,R.raw.c18s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==40)
                {
                    try {
                        playDisSound(context18,R.raw.c18s42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==41)
                {
                    try {
                        playDisSound(context18,R.raw.c18s43);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==42)
                {
                    try {
                        playDisSound(context18,R.raw.c18s44);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==43)
                {
                    try {
                        playDisSound(context18,R.raw.c18s45);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==44)
                {
                    try {
                        playDisSound(context18,R.raw.c18s46);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==45)
                {
                    try {
                        playDisSound(context18,R.raw.c18s47);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==46)
                {
                    try {
                        playDisSound(context18,R.raw.c18s48);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==47)
                {
                    try {
                        playDisSound(context18,R.raw.c18s49);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==48)
                {
                    try {
                        playDisSound(context18,R.raw.c18s50);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==49)
                {
                    try {
                        playDisSound(context18,R.raw.c18s51_52_53);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==50)
                {
                    try {
                        playDisSound(context18,R.raw.c18s54);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==51)
                {
                    try {
                        playDisSound(context18,R.raw.c18s55);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==52)
                {
                    try {
                        playDisSound(context18,R.raw.c18s56);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==53)
                {
                    try {
                        playDisSound(context18,R.raw.c18s57);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==54)
                {
                    try {
                        playDisSound(context18,R.raw.c18s58);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==55)
                {
                    try {
                        playDisSound(context18,R.raw.c18s59);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==56)
                {
                    try {
                        playDisSound(context18,R.raw.c18s60);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==57)
                {
                    try {
                        playDisSound(context18,R.raw.c18s61);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==58)
                {
                    try {
                        playDisSound(context18,R.raw.c18s62);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==59)
                {
                    try {
                        playDisSound(context18,R.raw.c18s63);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==60)
                {
                    try {
                        playDisSound(context18,R.raw.c18s64);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==61)
                {
                    try {
                        playDisSound(context18,R.raw.c18s65);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==62)
                {
                    try {
                        playDisSound(context18,R.raw.c18s66);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==63)
                {
                    try {
                        playDisSound(context18,R.raw.c18s67);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==64)
                {
                    try {
                        playDisSound(context18,R.raw.c18s68);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==65)
                {
                    try {
                        playDisSound(context18,R.raw.c18s69);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==66)
                {
                    try {
                        playDisSound(context18,R.raw.c18s70);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==67)
                {
                    try {
                        playDisSound(context18,R.raw.c18s71);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==68)
                {
                    try {
                        playDisSound(context18,R.raw.c18s72);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==69)
                {
                    try {
                        playDisSound(context18,R.raw.c18s73);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==70)
                {
                    try {
                        playDisSound(context18,R.raw.c18s74);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==71)
                {
                    try {
                        playDisSound(context18,R.raw.c18s75);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==72)
                {
                    try {
                        playDisSound(context18,R.raw.c18s76);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==73)
                {
                    try {
                        playDisSound(context18,R.raw.c18s77);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition18==74)
                {
                    try {
                        playDisSound(context18,R.raw.c18s78);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }
        });
      return view18;
    }
    
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer18.isPlaying()){mediaPlayer18.pause(); mediaPlayer18.seekTo(0);
        }
        else {
            mediaPlayer18.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer18.prepare();
        }
        mediaPlayer18.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer18) {
                mediaPlayer18.stop();
                mediaPlayer18.reset(); }
        });
        mediaPlayer18.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer18.isPlaying()){
            try {
                mediaPlayer18.stop();
                mediaPlayer18.reset();
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
        if(mediaPlayer18.isPlaying())
        {
            mediaPlayer18.reset();
            mediaPlayer18.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer18.isPlaying())
        {
            mediaPlayer18.reset();
            mediaPlayer18.release();}
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

        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null);
        return Uri.parse(path);
    }


    private void share_bitMap_to_Apps() {
        if (ContextCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            String adhyayN="अध्याय 18";
            String appDes = "\uD83D\uDD05"+adhyayN+"\uD83D\uDD05\n\uD83D\uDE4Fश्रीमद्भगवद्गीता\uD83D\uDE4F\nShared via Bhagvad Gita app\uD83D\uDC47"+"here will come the app link";
            Intent i = new Intent(Intent.ACTION_SEND);

            i.setType("*/*");
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
    /*compress(Bitmap.CompressFormat.PNG, 100, stream);
    byte[] bytes = stream.toByteArray();*/

            i.putExtra(Intent.EXTRA_STREAM, getImageUri(getActivity(), getBitmapFromView(textView)));
            i.putExtra(Intent.EXTRA_TEXT,appDes);

            try {
                startActivity(Intent.createChooser(i, "Share by"));
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
//fixing bitmap savving
}