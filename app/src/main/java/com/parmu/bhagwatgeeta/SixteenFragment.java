package com.parmu.bhagwatgeeta;

import android.Manifest;
import android.app.DownloadManager;
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

import org.w3c.dom.Text;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static com.parmu.bhagwatgeeta.Adhyay16_AC16.pagePosition16;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SixteenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SixteenFragment extends Fragment implements ViewPager.OnPageChangeListener {
    private TextView textView;
    public MediaPlayer mediaPlayer16;
    Context context16;
    ViewPager viewPager16;
    private static final int STORAGE_PERMISSION_CODE = 101;
    RequestPermissions requestPermissions;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SixteenFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SixteenFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SixteenFragment newInstance(String param1, String param2) {
        SixteenFragment fragment = new SixteenFragment();
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
        context16= getActivity();
        mediaPlayer16 = new MediaPlayer();
        requestPermissions = new RequestPermissions();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View view16=inflater.inflate(R.layout.fragment_sixteen, container, false);
     textView=view16.findViewById(R.id.text_display_16);
     textView.setText(getArguments().getString("message16"));


        FloatingActionButton fabPlayBtn16 = view16.findViewById(R.id.fabplaysound16);
        viewPager16=getActivity().findViewById(R.id.pager16);
        viewPager16.addOnPageChangeListener(this);






        fabPlayBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adhyay16_AC16.pageGetPosition16();

                if (pagePosition16 == 0) {

                    try {
                        playDisSound(context16, R.raw.c16s1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 1) {
                    try {
                        playDisSound(context16, R.raw.c16s2);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 2) {
                    try {
                        playDisSound(context16, R.raw.c16s3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 3) {
                    try {
                        playDisSound(context16, R.raw.c16s4);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 4) {
                    try {
                        playDisSound(context16, R.raw.c16s5);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 5) {
                    try {
                        playDisSound(context16, R.raw.c16s6);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 6) {
                    try {
                        playDisSound(context16, R.raw.c16s7);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 7) {
                    try {
                        playDisSound(context16, R.raw.c16s8);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 8) {
                    try {
                        playDisSound(context16, R.raw.c16s9);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 9) {
                    try {
                        playDisSound(context16, R.raw.c16s10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 10) {
                    try {
                        playDisSound(context16, R.raw.c16s11);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 11) {
                    try {
                        playDisSound(context16, R.raw.c16s12);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 12) {
                    try {
                        playDisSound(context16, R.raw.c16s13);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 13) {
                    try {
                        playDisSound(context16, R.raw.c16s14);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 14) {
                    try {
                        playDisSound(context16, R.raw.c16s15_16);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 15) {
                    try {
                        playDisSound(context16, R.raw.c16s17);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 16) {
                    try {
                        playDisSound(context16, R.raw.c16s18);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 17) {
                    try {
                        playDisSound(context16, R.raw.c16s19);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 18) {
                    try {
                        playDisSound(context16, R.raw.c16s20);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 19) {
                    try {
                        playDisSound(context16, R.raw.c16s21);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 20) {
                    try {
                        playDisSound(context16, R.raw.c16s22);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 21) {
                    try {
                        playDisSound(context16, R.raw.c16s23);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (pagePosition16 == 22) {
                    try {
                        playDisSound(context16, R.raw.c16s24);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
     return view16;

    }
    // method for media player
    private void playDisSound(Context c, int soundID) throws IOException {


        if(mediaPlayer16.isPlaying()){mediaPlayer16.pause(); mediaPlayer16.seekTo(0);
        }
        else {
            mediaPlayer16.setDataSource(c, Uri.parse("android.resource://com.parmu.bhagwatgeeta/" + soundID));
            mediaPlayer16.prepare();
        }
        mediaPlayer16.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer16) {
                mediaPlayer16.stop();
                mediaPlayer16.reset(); }
        });
        mediaPlayer16.start();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(mediaPlayer16.isPlaying()){
            try {
                mediaPlayer16.stop();
                mediaPlayer16.reset();
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
        if(mediaPlayer16.isPlaying())
        {
            mediaPlayer16.reset();
            mediaPlayer16.release();}
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.app_bar_menu_1, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mediaPlayer16.isPlaying())
        {
            mediaPlayer16.reset();
            mediaPlayer16.release();}
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
            String adhyayN="अध्याय 16";
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