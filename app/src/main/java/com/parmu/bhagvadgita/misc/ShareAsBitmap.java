package com.parmu.bhagvadgita.misc;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;
import com.parmu.bhagvadgita.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShareAsBitmap {

    public Bitmap getBitmapFromView(View view, TextView textView1, TextView textView2) {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(),view.getHeight(), Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            view.setBackgroundResource(R.drawable.paper_texture_brown);
            textView1.setTextColor(Color.BLACK);
            textView2.setTextColor(Color.BLACK);
        }
        view.draw(canvas);
        //return the bitmap
        return returnedBitmap;
    }

    //sharing image form of shloka
    private Uri getImageUri(Bitmap inImage, String positionOfPager,Context context) throws IOException {
        //implementing for scoped storage
        Uri imageUri;
        FileOutputStream fos = null;
            String dirPath = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath();
            Log.e("dirpath",dirPath);
            File dir = new File(dirPath);
            boolean wasCreatedSuccessfully = dir.mkdirs();
            if (!wasCreatedSuccessfully) {
                Log.i("dir unsuccess", "dir unsuccessful");
            }
            File imgFile = new File(dirPath, positionOfPager + ".jpeg");
            if (!imgFile.exists()) {
                try {
                    boolean isImageCreated = imgFile.createNewFile();
                    if (!isImageCreated) {
                        Log.i("image error", "image creation unsuccessfull");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fos = new FileOutputStream(imgFile);
                    inImage.compress(Bitmap.CompressFormat.JPEG, 51, fos);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            imageUri =Uri.parse(imgFile.getAbsolutePath());
        if(fos!=null){
            fos.flush();
            fos.close();
        }
        return imageUri;
    }


    public void share_bitMap_to_Apps(Context context, View view, TextView textView1, TextView textView2, String adhyayN,String positionOfPager) throws IOException {
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            String appDes = "\uD83D\uDD05"+adhyayN+"\uD83D\uDD05\n\uD83D\uDE4Fश्रीमद्भगवद्गीता\uD83D\uDE4F\nShared via Bhagvad Gita app\uD83D\uDC47"+"here will come the app link";
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("*/*");
            i.putExtra(Intent.EXTRA_STREAM, getImageUri(getBitmapFromView(view, textView1, textView2),positionOfPager,context));
            i.putExtra(Intent.EXTRA_TEXT,appDes);
            try {
                context.startActivity(Intent.createChooser(i, "Share by"));
            } catch (android.content.ActivityNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

}
