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


import static com.parmu.bhagwatgeeta.Adhyay3_AC3.pagePosition3;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThreeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThreeFragment extends Fragment implements ViewPager.OnPageChangeListener{
    private TextView textView;
    public MediaPlayer mediaPlayer3;
    Context context3;
    ViewPager viewPager3;
    private static final int STORAGE_PERMISSION_CODE = 101;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ThreeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThreeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ThreeFragment newInstance(String param1, String param2) {
        ThreeFragment fragment = new ThreeFragment();
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
        context3= getActivity();
        mediaPlayer3 = new MediaPlayer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view3=inflater.inflate(R.layout.fragment_three, container, false);
       textView = view3.findViewById(R.id.text_display_3);
       textView.setText(getArguments().getString("message3"));


        FloatingActionButton fabPlayBtn3 = view3.findViewById(R.id.fabplaysound3);
        viewPager3=getActivity().findViewById(R.id.pager3);
        viewPager3.addOnPageChangeListener(this);



        fabPlayBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay3_AC3.pageGetPosition3();

                if (pagePosition3 == 0) {

                    try {
                        playDisSound(context3, R.raw.c3s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 1) {
                    try {
                        playDisSound(context3, R.raw.c3s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 2) {
                    try {
                        playDisSound(context3, R.raw.c3s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 3) {
                    try {
                        playDisSound(context3, R.raw.c3s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 4) {
                    try {
                        playDisSound(context3, R.raw.c3s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 5) {
                    try {
                        playDisSound(context3, R.raw.c3s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 6) {
                    try {
                        playDisSound(context3, R.raw.c3s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 7) {
                    try {
                        playDisSound(context3, R.raw.c3s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 8) {
                    try {
                        playDisSound(context3, R.raw.c3s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 9) {
                    try {
                        playDisSound(context3, R.raw.c3s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 10) {
                    try {
                        playDisSound(context3, R.raw.c3s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 11) {
                    try {
                        playDisSound(context3, R.raw.c3s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 12) {
                    try {
                        playDisSound(context3, R.raw.c3s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 13) {
                    try {
                        playDisSound(context3, R.raw.c3s14_15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 14) {
                    try {
                        playDisSound(context3, R.raw.c3s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 15) {
                    try {
                        playDisSound(context3, R.raw.c3s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 16) {
                    try {
                        playDisSound(context3, R.raw.c3s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 17) {
                    try {
                        playDisSound(context3, R.raw.c3s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 18) {
                    try {
                        playDisSound(context3, R.raw.c3s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 19) {
                    try {
                        playDisSound(context3, R.raw.c3s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 20) {
                    try {
                        playDisSound(context3, R.raw.c3s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 21) {
                    try {
                        playDisSound(context3, R.raw.c3s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 22) {
                    try {
                        playDisSound(context3, R.raw.c3s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 23) {
                    try {
                        playDisSound(context3, R.raw.c3s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 24) {
                    try {
                        playDisSound(context3, R.raw.c3s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 25) {
                    try {
                        playDisSound(context3, R.raw.c3s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 26) {
                    try {
                        playDisSound(context3, R.raw.c3s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 27) {
                    try {
                        playDisSound(context3, R.raw.c3s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 28) {
                    try {
                        playDisSound(context3, R.raw.c3s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 29) {
                    try {
                        playDisSound(context3, R.raw.c3s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 30) {
                    try {
                        playDisSound(context3, R.raw.c3s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 31) {
                    try {
                        playDisSound(context3, R.raw.c3s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 32) {
                    try {
                        playDisSound(context3, R.raw.c3s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 33) {
                    try {
                        playDisSound(context3, R.raw.c3s35);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 34) {
                    try {
                        playDisSound(context3, R.raw.c3s36);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 35) {
                    try {
                        playDisSound(context3, R.raw.c3s37);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 36) {
                    try {
                        playDisSound(context3, R.raw.c3s38);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 37) {
                    try {
                        playDisSound(context3, R.raw.c3s39);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 38) {
                    try {
                        playDisSound(context3, R.raw.c3s40);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 39) {
                    try {
                        playDisSound(context3, R.raw.c3s41);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition3 == 40) {
                    try {
                        playDisSound(context3, R.raw.c3s42);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if (pagePosition3 == 41) {
                    try {
                        playDisSound(context3, R.raw.c3s43);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

       return view3;

    }

                // method for media player
        private void playDisSound(Context c, int soundID) throws IOException {


            if(mediaPlayer3.isPlaying()){mediaPlayer3.pause(); mediaPlayer3.seekTo(0);
            }
            else {
                mediaPlayer3.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
                mediaPlayer3.prepare();
            }
            mediaPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer3) {
                    mediaPlayer3.stop();
                    mediaPlayer3.reset(); }
            });
            mediaPlayer3.start();

        }
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            if(mediaPlayer3.isPlaying()){
                try {
                    mediaPlayer3.stop();
                    mediaPlayer3.reset();
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
        if(mediaPlayer3.isPlaying())
        {
            mediaPlayer3.reset();
            mediaPlayer3.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer3.isPlaying())
        {
            mediaPlayer3.reset();
            mediaPlayer3.release();}
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
            Intent i = new Intent(Intent.ACTION_SEND);
            String adhyayN="अध्याय 3";
            String appDes = "\uD83D\uDD05"+adhyayN+"\uD83D\uDD05\n\uD83D\uDE4Fश्रीमद्भगवद्गीता\uD83D\uDE4F\nShared via Bhagvad Gita app\uD83D\uDC47"+"here will come the app link";
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
