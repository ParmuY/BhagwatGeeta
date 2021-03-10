package com.parmu.bhagwatgeeta.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter1;

public class Adhyay1_AC1 extends AppCompatActivity {

    private Toolbar toolbar;
    public static ViewPager viewPager;
    private ViewPagerAdapter1 adapter;
    private TabLayout tabLayout;

    public static int pagePosition;
    private int pagePo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay1__a_c1);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved1",0);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 1");
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.pager);
        adapter = new ViewPagerAdapter1(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        //opening recent left page in view pager
        viewPager.setCurrentItem(recentPage);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);



    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater1 = getMenuInflater();
//        menuInflater1.inflate(R.menu.app_bar_menu_1, menu);
//        return false;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//      if(id==R.id.share_shlola){
//        Intent i = new Intent(getApplicationContext(),Adhyay6_AC6.class);
//        startActivity(i);
//      }
//
//      return super.onOptionsItemSelected(item);
//    }

    public static void pageGetPosition()
   {
       pagePosition = viewPager.getCurrentItem();
   }
   @Override
    protected  void onStop(){
        super.onStop();
       pagePo = viewPager.getCurrentItem();
       SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
       SharedPreferences.Editor editor = sharedPref.edit();
       editor.putInt("PageSaved1",pagePo);
       editor.apply();
   }


//
//    //shareing image form of shloka
//    private Uri getImageUri(Context inContext, Bitmap inImage) {
//        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
//        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
//
//        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null);
//        return Uri.parse(path);
//    }
//
//
//    private void share_bitMap_to_Apps() {
//
//        Intent i = new Intent(Intent.ACTION_SEND);
//
//        i.setType("image/*");
//        ByteArrayOutputStream stream = new ByteArrayOutputStream();
//    /*compress(Bitmap.CompressFormat.PNG, 100, stream);
//    byte[] bytes = stream.toByteArray();*/
//
//        i.putExtra(Intent.EXTRA_STREAM, getImageUri(getApplicationContext(), getBitmapFromView(linearLayout1)));
//        try {
//            startActivity(Intent.createChooser(i, "Share by"));
//        } catch (android.content.ActivityNotFoundException ex) {
//
//            ex.printStackTrace();
//        }
//
//
//    }
//
//    private static Bitmap getBitmapFromView(View view) {
//        //Define a bitmap with the same size as the view
//        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(),view.getHeight(), Bitmap.Config.ARGB_8888);
//        //Bind a canvas to it
//        Canvas canvas = new Canvas(returnedBitmap);
//        //Get the view's background
//        Drawable bgDrawable = view.getBackground();
//        if (bgDrawable != null)
//            //has background drawable, then draw it on the canvas
//            bgDrawable.draw(canvas);
//        else
//            //does not have background drawable, then draw white background on the canvas
//            canvas.drawColor(Color.WHITE);
//        // draw the view on the canvas
//        view.draw(canvas);
//        //return the bitmap
//        return returnedBitmap;
//    }
}



