package com.parmu.bhagwatgeeta.activities;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.InterstitialAdMobClass;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter6;

import java.util.Timer;
import java.util.TimerTask;

public class Adhyay6_AC6 extends AppCompatActivity implements ViewPager.OnPageChangeListener{
    public static ViewPager viewPager6;
    public static int pagePosition6;
    private static Resources resources;
    private boolean isTimerFinished = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay6__a_c6);
        resources = getResources();


        String interstitialAdUnitId = getString(R.string.interstitial_ad_unit_id_adhyay);
        InterstitialAdMobClass.initInterstitialAds(this, interstitialAdUnitId);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved6",0);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 6");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        viewPager6= findViewById(R.id.pager6);
        ViewPagerAdapter6 adapter = new ViewPagerAdapter6(getSupportFragmentManager(),this);
        viewPager6.setAdapter(adapter);
        viewPager6.setCurrentItem(recentPage);
        viewPager6.addOnPageChangeListener(this);

        TabLayout tabLayout = findViewById(R.id.tabs);
       tabLayout.setupWithViewPager(viewPager6);
        final Timer adTimer = new Timer();
        adTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                isTimerFinished = true;
                adTimer.cancel();
            }
        },3*60*1000);
    }

    public static void pageGetPosition6()
    {

        pagePosition6 = viewPager6.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        int pagePo = viewPager6.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved6", pagePo);
        editor.apply();

        if(ClassForCombinedMediaPlayer.mediaPlayerOb !=null){
            if(ClassForCombinedMediaPlayer.mediaPlayerOb.isPlaying()){
                ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            }
        }
        if (InterstitialAdMobClass.mInterstitialAd !=null && isTimerFinished) {
            InterstitialAdMobClass.mInterstitialAd.show(this);
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
    }
    public static Resources getAdhyay6Resources(){
        return resources;
    }
}