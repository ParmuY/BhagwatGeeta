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
import android.media.MediaExtractor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
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

import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static android.content.ContentValues.TAG;
import static com.parmu.bhagwatgeeta.Adhyay1_AC1.pagePosition;



/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OneFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OneFragment extends Fragment implements ViewPager.OnPageChangeListener {


    public MediaPlayer mediaPlayer;
    Context context;
    ViewPager viewPager;
    TextView textView;
    private static final int STORAGE_PERMISSION_CODE = 101;




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OneFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OneFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OneFragment newInstance(String param1, String param2) {
        OneFragment fragment = new OneFragment();
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
      context= getActivity();
        mediaPlayer = new MediaPlayer();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_one, container, false);
        textView = view.findViewById(R.id.frag_text_display);

        textView.setText(getArguments().getString("message"));
        FloatingActionButton fabPlayBtn = view.findViewById(R.id.fabplaysound);
        viewPager=getActivity().findViewById(R.id.pager);
        viewPager.addOnPageChangeListener(this);
        





        fabPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Playing audio", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Adhyay1_AC1.pageGetPosition();

                if (pagePosition==0) {

                    try {
                        playDisSound(context,R.raw.c1s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==1)
                {
                    try {
                        playDisSound(context,R.raw.c1s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==2)
                {
                    try {
                        playDisSound(context,R.raw.c1s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==3)
                {
                    try {
                        playDisSound(context,R.raw.c1s4_5_6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==4)
                {
                    try {
                        playDisSound(context,R.raw.c1s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==5)
                {
                    try {
                        playDisSound(context,R.raw.c1s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==6)
                {
                    try {
                        playDisSound(context,R.raw.c1s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==7)
                {
                    try {
                        playDisSound(context,R.raw.c1s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==8)
                {
                    try {
                        playDisSound(context,R.raw.c1s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==9)
                {
                    try {
                        playDisSound(context,R.raw.c1s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==10)
                {
                    try {
                        playDisSound(context,R.raw.c1s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==11)
                {
                    try {
                        playDisSound(context,R.raw.c1s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==12)
                {
                    try {
                        playDisSound(context,R.raw.c1s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==13)
                {
                    try {
                        playDisSound(context,R.raw.c1s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==14)
                {
                    try {
                        playDisSound(context,R.raw.c1s17_18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==15)
                {
                    try {
                        playDisSound(context,R.raw.c1s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==16)
                {
                    try {
                        playDisSound(context,R.raw.c1s20_21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==17)
                {
                    try {
                        playDisSound(context,R.raw.c1s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==18)
                {
                    try {
                        playDisSound(context,R.raw.c1s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==19)
                {
                    try {
                        playDisSound(context,R.raw.c1s24_25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==20)
                {
                    try {
                        playDisSound(context,R.raw.c1s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==21)
                {
                    try {
                        playDisSound(context,R.raw.c1s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==22)
                {
                    try {
                        playDisSound(context,R.raw.c1s28_29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==23)
                {
                    try {
                        playDisSound(context,R.raw.c1s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==24)
                {
                    try {
                        playDisSound(context,R.raw.c1s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==25)
                {
                    try {
                        playDisSound(context,R.raw.c1s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==26)
                {
                    try {
                        playDisSound(context,R.raw.c1s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==27)
                {
                    try {
                        playDisSound(context,R.raw.c1s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==28)
                {
                    try {
                        playDisSound(context,R.raw.c1s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==29)
                {
                    try {
                        playDisSound(context,R.raw.c1s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==30)
                {
                    try {
                        playDisSound(context,R.raw.c1s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==31)
                {
                    try {
                        playDisSound(context,R.raw.c1s38_39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==32)
                {
                    try {
                        playDisSound(context,R.raw.c1s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==33)
                {
                    try {
                        playDisSound(context,R.raw.c1s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==34)
                {
                    try {
                        playDisSound(context,R.raw.c1s42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==35)
                {
                    try {
                        playDisSound(context,R.raw.c1s43);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==36)
                {
                    try {
                        playDisSound(context,R.raw.c1s44);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==37)
                {
                    try {
                        playDisSound(context,R.raw.c1s45);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==38)
                {
                    try {
                        playDisSound(context,R.raw.c1s46);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(pagePosition==39)
                {
                    try {
                        playDisSound(context,R.raw.c1s47);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }
        });


        return view;
    }

    // method for media player
    public void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer.isPlaying()){mediaPlayer.pause(); mediaPlayer.seekTo(0);
                }
                else {
                    mediaPlayer.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
                    mediaPlayer.prepare();
                }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
               mediaPlayer.stop();
                mediaPlayer.reset(); }
        });
                mediaPlayer.start();

    }



    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
       if(mediaPlayer.isPlaying()){
        try {
            mediaPlayer.stop();
            mediaPlayer.reset();
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
        if(mediaPlayer.isPlaying())
        {
            mediaPlayer.reset();
            mediaPlayer.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer.isPlaying())
        {
            mediaPlayer.reset();
            mediaPlayer.release();}
        int id = item.getItemId();
        if(id==R.id.share_shlola){
            checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE);
            share_bitMap_to_Apps();
        }
        return super.onOptionsItemSelected(item);
    }

    //shareing image form of shloka
    private Uri getImageUri(Context inContext, Bitmap inImage) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        inImage.compress(Bitmap.CompressFormat.PNG, 100, bytes);

        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null);
        return Uri.parse(path);
    }


    private void share_bitMap_to_Apps() {

        if (ContextCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            String adhyayN="अध्याय 1";
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

    private Bitmap getBitmapFromView(View view) {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(),view.getHeight(), Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        //Get the view's background
      //  Resources res = getResources();
        Drawable bgDrawable = view.getBackground();
                //ResourcesCompat.getDrawable(res,R.drawable.bg,null);

        if (bgDrawable != null){
            //has background drawable, then draw it on the canvas
            bgDrawable.draw(canvas);

        }
        else
        { //does not have background drawable, then draw white background on the canvas
            canvas.drawColor(Color.WHITE);
            Log.d(TAG, "getBitmapFromView:does not have back ground");
        }
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


}