package com.parmu.bhagvadgita.misc;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Environment;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
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

    public Bitmap getBitmapFromView(Context context, TextView textView1, TextView textView2) {

        Resources res = context.getResources();
        float scale = res.getDisplayMetrics().density;
        String str1 = textView1.getText().toString();
        String str2 = textView2.getText().toString();
        Bitmap returnedBitmap = BitmapFactory.decodeResource(res,R.drawable.bg_sloka_png);
        Bitmap.Config bitmapConfig = returnedBitmap.getConfig();
        if(bitmapConfig==null){
            bitmapConfig = Bitmap.Config.ARGB_8888;
        }
        returnedBitmap = returnedBitmap.copy(bitmapConfig,true);

        Canvas canvas = new Canvas(returnedBitmap);
        TextPaint paint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        Paint imgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(Color.WHITE);
        paint.setTextSize(25*scale);
        //textwidth is taken common in str1 and str2
        int textWidth = canvas.getWidth() - (int)(16*scale);
        //for str1
        StaticLayout textLayout1 = new StaticLayout(str1,paint,textWidth, Layout.Alignment.ALIGN_CENTER,1.0f,1.0f,false);
        int textHeight1 = textLayout1.getHeight();
        //for str2
        StaticLayout textLayout2 = new StaticLayout(str2,paint,textWidth, Layout.Alignment.ALIGN_CENTER,1.0f,1.0f,false);
        int textHeight2 = textLayout2.getHeight();

        //coordinates for str1 sanskrit
        int x1 = (returnedBitmap.getWidth()- textWidth)/2;
        int y1 = (returnedBitmap.getHeight()-textHeight1)/4;
        //coordinates for str2 bhavarth
        int x2 = (returnedBitmap.getWidth()- textWidth)/2;
        int y2 = (returnedBitmap.getHeight()-textHeight2)/2;

        //for str1
        canvas.save();
        canvas.translate(x1,y1);
        textLayout1.draw(canvas);
        canvas.restore();
        //for str2
        canvas.save();
        canvas.translate(x2,y2);
        textLayout2.draw(canvas);
        canvas.restore();

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
                    inImage.compress(Bitmap.CompressFormat.PNG, 90, fos);
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


    public void share_bitMap_to_Apps(Context context, TextView textView1, TextView textView2, String adhyayN,String positionOfPager) throws IOException {
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            String appDes = "\uD83D\uDD05"+adhyayN+"\uD83D\uDD05\n\uD83D\uDE4Fश्रीमद्भगवद्गीता\uD83D\uDE4F\nShared via Bhagvad Gita app\uD83D\uDC47"+"here will come the app link";
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("*/*");
            i.putExtra(Intent.EXTRA_STREAM, getImageUri(getBitmapFromView(context, textView1, textView2),positionOfPager,context));
            i.putExtra(Intent.EXTRA_TEXT,appDes);
            try {
                context.startActivity(Intent.createChooser(i, "Share by"));
            } catch (android.content.ActivityNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

}
