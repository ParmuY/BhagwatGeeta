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

import static com.parmu.bhagwatgeeta.Adhyay11_AC11.pagePosition11;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ElevenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ElevenFragment extends Fragment implements ViewPager.OnPageChangeListener{
    private TextView textView;
    public MediaPlayer mediaPlayer11;
    Context context11;
    ViewPager viewPager11;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ElevenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ElevenFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ElevenFragment newInstance(String param1, String param2) {
        ElevenFragment fragment = new ElevenFragment();
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
        context11= getActivity();
        mediaPlayer11 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view11= inflater.inflate(R.layout.fragment_eleven, container, false);
       textView=view11.findViewById(R.id.text_display_11);
       textView.setText(getArguments().getString("message11"));

       
        FloatingActionButton fabPlayBtn11 = view11.findViewById(R.id.fabplaysound11);
        viewPager11=getActivity().findViewById(R.id.pager11);
        viewPager11.addOnPageChangeListener(this);

        fabPlayBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay11_AC11.pageGetPosition11();

                if (pagePosition11 == 0) {

                    try {
                        playDisSound(context11, R.raw.c11s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 1) {
                    try {
                        playDisSound(context11, R.raw.c11s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 2) {
                    try {
                        playDisSound(context11, R.raw.c11s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 3) {
                    try {
                        playDisSound(context11, R.raw.c11s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 4) {
                    try {
                        playDisSound(context11, R.raw.c11s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 5) {
                    try {
                        playDisSound(context11, R.raw.c11s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 6) {
                    try {
                        playDisSound(context11, R.raw.c11s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 7) {
                    try {
                        playDisSound(context11, R.raw.c11s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 8) {
                    try {
                        playDisSound(context11, R.raw.c11s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 9) {
                    try {
                        playDisSound(context11, R.raw.c11s10_11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 10) {
                    try {
                        playDisSound(context11, R.raw.c11s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 11) {
                    try {
                        playDisSound(context11, R.raw.c11s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 12) {
                    try {
                        playDisSound(context11, R.raw.c11s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 13) {
                    try {
                        playDisSound(context11, R.raw.c11s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 14) {
                    try {
                        playDisSound(context11, R.raw.c11s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 15) {
                    try {
                        playDisSound(context11, R.raw.c11s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 16) {
                    try {
                        playDisSound(context11, R.raw.c11s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 17) {
                    try {
                        playDisSound(context11, R.raw.c11s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 18) {
                    try {
                        playDisSound(context11, R.raw.c11s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 19) {
                    try {
                        playDisSound(context11, R.raw.c11s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 20) {
                    try {
                        playDisSound(context11, R.raw.c11s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 21) {
                    try {
                        playDisSound(context11, R.raw.c11s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 22) {
                    try {
                        playDisSound(context11, R.raw.c11s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 23) {
                    try {
                        playDisSound(context11, R.raw.c11s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 24) {
                    try {
                        playDisSound(context11, R.raw.c11s26_27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 25) {
                    try {
                        playDisSound(context11, R.raw.c11s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 26) {
                    try {
                        playDisSound(context11, R.raw.c11s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 27) {
                    try {
                        playDisSound(context11, R.raw.c11s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 28) {
                    try {
                        playDisSound(context11, R.raw.c11s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 29) {
                    try {
                        playDisSound(context11, R.raw.c11s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 30) {
                    try {
                        playDisSound(context11, R.raw.c11s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 31) {
                    try {
                        playDisSound(context11, R.raw.c11s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 32) {
                    try {
                        playDisSound(context11, R.raw.c11s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 33) {
                    try {
                        playDisSound(context11, R.raw.c11s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 34) {
                    try {
                        playDisSound(context11, R.raw.c11s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 35) {
                    try {
                        playDisSound(context11, R.raw.c11s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 36) {
                    try {
                        playDisSound(context11, R.raw.c11s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 37) {
                    try {
                        playDisSound(context11, R.raw.c11s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 38) {
                    try {
                        playDisSound(context11, R.raw.c11s41_42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 39) {
                    try {
                        playDisSound(context11, R.raw.c11s43);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 40) {
                    try {
                        playDisSound(context11, R.raw.c11s44);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 41) {
                    try {
                        playDisSound(context11, R.raw.c11s45);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 42) {
                    try {
                        playDisSound(context11, R.raw.c11s46);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 43) {
                    try {
                        playDisSound(context11, R.raw.c11s47);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 44) {
                    try {
                        playDisSound(context11, R.raw.c11s48);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 45) {
                    try {
                        playDisSound(context11, R.raw.c11s49);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 46) {
                    try {
                        playDisSound(context11, R.raw.c11s50);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 47) {
                    try {
                        playDisSound(context11, R.raw.c11s51);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 48) {
                    try {
                        playDisSound(context11, R.raw.c11s52);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 49) {
                    try {
                        playDisSound(context11, R.raw.c11s53);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 50) {
                    try {
                        playDisSound(context11, R.raw.c11s54);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition11 == 51) {
                    try {
                        playDisSound(context11, R.raw.c11s55);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
       return view11;
    }
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer11.isPlaying()){mediaPlayer11.pause(); mediaPlayer11.seekTo(0);
        }
        else {
            mediaPlayer11.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer11.prepare();
        }
        mediaPlayer11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer11) {
                mediaPlayer11.stop();
                mediaPlayer11.reset(); }
        });
        mediaPlayer11.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        
    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer11.isPlaying()){
            try {
                mediaPlayer11.stop();
                mediaPlayer11.reset();
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
        if(mediaPlayer11.isPlaying())
        {
            mediaPlayer11.reset();
            mediaPlayer11.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer11.isPlaying())
        {
            mediaPlayer11.reset();
            mediaPlayer11.release();}
        int id = item.getItemId();
        if (id==R.id.share_shlola){
            requestPermissions.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE, getActivity());

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
            String adhyayN="अध्याय 11";
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
}