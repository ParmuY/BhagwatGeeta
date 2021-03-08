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

import static com.parmu.bhagwatgeeta.Adhyay13_AC13.pagePosition13;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ThirteenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThirteenFragment extends Fragment  implements ViewPager.OnPageChangeListener{
    private TextView textView;
    public MediaPlayer mediaPlayer13;
    Context context13;
    ViewPager viewPager13;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ThirteenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ThirteenFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ThirteenFragment newInstance(String param1, String param2) {
        ThirteenFragment fragment = new ThirteenFragment();
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
        context13= getActivity();
        mediaPlayer13 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view13=inflater.inflate(R.layout.fragment_thirteen, container, false);
        textView=view13.findViewById(R.id.text_display_13);
        textView.setText(getArguments().getString("message13"));

        FloatingActionButton fabPlayBtn13 = view13.findViewById(R.id.fabplaysound13);
        viewPager13=getActivity().findViewById(R.id.pager13);
        viewPager13.addOnPageChangeListener(this);






        fabPlayBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay13_AC13.pageGetPosition13();

                if (pagePosition13 == 0) {

                    try {
                        playDisSound(context13, R.raw.c13s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 1) {
                    try {
                        playDisSound(context13, R.raw.c13s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 2) {
                    try {
                        playDisSound(context13, R.raw.c13s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 3) {
                    try {
                        playDisSound(context13, R.raw.c13s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 4) {
                    try {
                        playDisSound(context13, R.raw.c13s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 5) {
                    try {
                        playDisSound(context13, R.raw.c13s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 6) {
                    try {
                        playDisSound(context13, R.raw.c13s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 7) {
                    try {
                        playDisSound(context13, R.raw.c13s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 8) {
                    try {
                        playDisSound(context13, R.raw.c13s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 9) {
                    try {
                        playDisSound(context13, R.raw.c13s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 10) {
                    try {
                        playDisSound(context13, R.raw.c13s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 11) {
                    try {
                        playDisSound(context13, R.raw.c13s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 12) {
                    try {
                        playDisSound(context13, R.raw.c13s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 13) {
                    try {
                        playDisSound(context13, R.raw.c13s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 14) {
                    try {
                        playDisSound(context13, R.raw.c13s15);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 15) {
                    try {
                        playDisSound(context13, R.raw.c13s16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 16) {
                    try {
                        playDisSound(context13, R.raw.c13s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 17) {
                    try {
                        playDisSound(context13, R.raw.c13s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 18) {
                    try {
                        playDisSound(context13, R.raw.c13s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 19) {
                    try {
                        playDisSound(context13, R.raw.c13s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 20) {
                    try {
                        playDisSound(context13, R.raw.c13s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 21) {
                    try {
                        playDisSound(context13, R.raw.c13s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 22) {
                    try {
                        playDisSound(context13, R.raw.c13s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 23) {
                    try {
                        playDisSound(context13, R.raw.c13s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 24) {
                    try {
                        playDisSound(context13, R.raw.c13s25);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 25) {
                    try {
                        playDisSound(context13, R.raw.c13s26);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 26) {
                    try {
                        playDisSound(context13, R.raw.c13s27);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 27) {
                    try {
                        playDisSound(context13, R.raw.c13s28);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 28) {
                    try {
                        playDisSound(context13, R.raw.c13s29);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 29) {
                    try {
                        playDisSound(context13, R.raw.c13s30);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 30) {
                    try {
                        playDisSound(context13, R.raw.c13s31);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 31) {
                    try {
                        playDisSound(context13, R.raw.c13s32);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 32) {
                    try {
                        playDisSound(context13, R.raw.c13s33);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition13 == 33) {
                    try {
                        playDisSound(context13, R.raw.c13s34);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return view13;
    }
    
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer13.isPlaying()){mediaPlayer13.pause(); mediaPlayer13.seekTo(0);
        }
        else {
            mediaPlayer13.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer13.prepare();
        }
        mediaPlayer13.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer13) {
                mediaPlayer13.stop();
                mediaPlayer13.reset(); }
        });
        mediaPlayer13.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer13.isPlaying()){
            try {
                mediaPlayer13.stop();
                mediaPlayer13.reset();
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
        if(mediaPlayer13.isPlaying())
        {
            mediaPlayer13.reset();
            mediaPlayer13.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer13.isPlaying())
        {
            mediaPlayer13.reset();
            mediaPlayer13.release();}
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
            String adhyayN="अध्याय 13";
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
