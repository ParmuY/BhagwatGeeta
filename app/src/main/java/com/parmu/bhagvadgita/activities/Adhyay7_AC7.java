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
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter7;

import java.util.Timer;
import java.util.TimerTask;

public class Adhyay7_AC7 extends AppCompatActivity implements ViewPager.OnPageChangeListener{
    public static ViewPager viewPager7;
    public static int pagePosition7;
    private static Resources resources;
    private boolean isTimerFinished = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay7__a_c7);
        resources = getResources();

        String interstitialAdUnitId = getString(R.string.interstitial_ad_unit_id_adhyay);
        InterstitialAdMobClass.initInterstitialAds(this, interstitialAdUnitId);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagvadgita.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved7", 0);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 7");
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager7 = findViewById(R.id.pager7);
        ViewPagerAdapter7 adapter = new ViewPagerAdapter7(getSupportFragmentManager(),this);
        viewPager7.setAdapter(adapter);
        viewPager7.setCurrentItem(recentPage);
        viewPager7.addOnPageChangeListener(this);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager7);
        final Timer adTimer = new Timer();
        adTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                isTimerFinished = true;
                adTimer.cancel();
            }
        },3*60*1000);
    }

    public static void pageGetPosition7() {

        pagePosition7 = viewPager7.getCurrentItem();
    }

    @Override
    public void onStop() {
        super.onStop();
        int pagePo = viewPager7.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagvadgita.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved7", pagePo);
        editor.apply();
        if(ClassForCombinedMediaPlayer.mediaPlayerOb !=null){
            if(ClassForCombinedMediaPlayer.mediaPlayerOb.isPlaying()){
                ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            }
        }
        if (InterstitialAdMobClass.mInterstitialAd !=null&& isTimerFinished) {
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
    public static Resources getAdhyay7Resources(){
        return resources;
    }

}