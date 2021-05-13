package com.parmu.bhagvadgita.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagvadgita.misc.InterstitialAdMobClass;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter16;

import java.util.Timer;
import java.util.TimerTask;

public class Adhyay16_AC16 extends AppCompatActivity implements ViewPager.OnPageChangeListener{
    public static  ViewPager viewPager16;
    public static int pagePosition16;
    private static Resources resources;
    private boolean isTimerFinished = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay16__a_c16);
        resources = getResources();

        String interstitialAdUnitId = getString(R.string.interstitial_ad_unit_id_adhyay);
        InterstitialAdMobClass.initInterstitialAds(this, interstitialAdUnitId);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagvadgita.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved16",0);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 16");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager16=findViewById(R.id.pager16);
        ViewPagerAdapter16 adapter = new ViewPagerAdapter16(getSupportFragmentManager(),this);
        viewPager16.setAdapter(adapter);
        viewPager16.setCurrentItem(recentPage);
        viewPager16.addOnPageChangeListener(this);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager16);
        final Timer adTimer = new Timer();
        adTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                isTimerFinished = true;
                adTimer.cancel();
            }
        },3*60*1000);
    }
    public static void pageGetPosition16()
    {

        pagePosition16 = viewPager16.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        int pagePo = viewPager16.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagvadgita.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved16", pagePo);
        editor.apply();
        if(ClassForCombinedMediaPlayer.mediaPlayerOb !=null){
            if(ClassForCombinedMediaPlayer.mediaPlayerOb.isPlaying()){
                ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            }
        }
        if (InterstitialAdMobClass.mInterstitialAd !=null && isTimerFinished) {
            InterstitialAdMobClass.mInterstitialAd.show(this);
        }
        if(ClassForCombinedMediaPlayer.fileDownloadTask!=null){
            ClassForCombinedMediaPlayer.fileDownloadTask.cancel();
            ClassForCombinedMediaPlayer.fileDownloadTask = null;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if(ClassForCombinedMediaPlayer.mediaPlayerOb !=null){
            if(ClassForCombinedMediaPlayer.mediaPlayerOb.isPlaying()){
                ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            }
        }
        if(ClassForCombinedMediaPlayer.fileDownloadTask!=null){
            ClassForCombinedMediaPlayer.fileDownloadTask.cancel();
            ClassForCombinedMediaPlayer.fileDownloadTask = null;
        }
    }
    @Override
    public void onPageScrollStateChanged(int state) {}
    @Override
    protected void onPause() {
        super.onPause();
        if(ClassForCombinedMediaPlayer.mediaPlayerOb!=null){
            ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            ClassForCombinedMediaPlayer.mediaPlayerOb.release();
            ClassForCombinedMediaPlayer.mediaPlayerOb = null;
        }
        if(ClassForCombinedMediaPlayer.fileDownloadTask!=null){
            ClassForCombinedMediaPlayer.fileDownloadTask.cancel();
            ClassForCombinedMediaPlayer.fileDownloadTask = null;
        }
    }
    public static Resources getAdhyay16Resources(){
        return  resources;
    }

}