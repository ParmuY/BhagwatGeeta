package com.parmu.bhagwatgeeta.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;


import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter8;

public class Adhyay8_AC8 extends AppCompatActivity implements ViewPager.OnPageChangeListener{
    private Toolbar toolbar;
    public static ViewPager viewPager8;
    private ViewPagerAdapter8 adapter;
    private TabLayout tabLayout;
    public static int pagePosition8;
    private int pagePo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay8__a_c8);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved8",0);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 8");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager8=findViewById(R.id.pager8);
        adapter=new ViewPagerAdapter8(getSupportFragmentManager());
        viewPager8.setAdapter(adapter);
        viewPager8.setCurrentItem(recentPage);
        //implement and below change hai
        viewPager8.addOnPageChangeListener(this);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager8);

    }
    public static void pageGetPosition8()
    {
        pagePosition8 = viewPager8.getCurrentItem();
    }

    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager8.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved8",pagePo);
        editor.apply();
        //for mediaplayer   iske baad ka copy paste krna hai
        if(ClassForCombinedMediaPlayer.mediaPlayer!=null){
            if(ClassForCombinedMediaPlayer.mediaPlayer.isPlaying()){
                ClassForCombinedMediaPlayer.mediaPlayer.reset();
            }
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(ClassForCombinedMediaPlayer.mediaPlayer!=null){
            if(ClassForCombinedMediaPlayer.mediaPlayer.isPlaying()){
                ClassForCombinedMediaPlayer.mediaPlayer.reset();
            }
        }
    }
    @Override
    public void onPageScrollStateChanged(int state) {}

}