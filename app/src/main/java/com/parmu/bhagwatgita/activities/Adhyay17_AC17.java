package com.parmu.bhagwatgita.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgita.R;
import com.parmu.bhagwatgita.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgita.misc.InterstitialAdMobClass;
import com.parmu.bhagwatgita.pageradapter.ViewPagerAdapter17;

import java.util.Timer;
import java.util.TimerTask;

public class Adhyay17_AC17 extends AppCompatActivity implements ViewPager.OnPageChangeListener{
    public static  ViewPager viewPager17;
    public static int pagePosition17;
    private static Resources resources;
    private boolean isTimerFinished = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay17__a_c17);
        resources = getResources();

        String interstitialAdUnitId = getString(R.string.interstitial_ad_unit_id_adhyay);
        InterstitialAdMobClass.initInterstitialAds(this, interstitialAdUnitId);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgita.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved17",0);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 17");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager17= findViewById(R.id.pager17);
        ViewPagerAdapter17 adapter = new ViewPagerAdapter17(getSupportFragmentManager(),this);
        viewPager17.setAdapter(adapter);
        viewPager17.setCurrentItem(recentPage);
        viewPager17.addOnPageChangeListener(this);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager17);
        final Timer adTimer = new Timer();
        adTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                isTimerFinished = true;
                adTimer.cancel();
            }
        },3*60*1000);
    }
    public static void pageGetPosition17()
    {

        pagePosition17 = viewPager17.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        int pagePo = viewPager17.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgita.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved17", pagePo);
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
 public static Resources getAdhyay17Resources(){
        return resources;
 }
}