package com.parmu.bhagwatgeeta.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.InterstitialAdMobClass;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter10;

public class Adhyay10_AC10 extends AppCompatActivity implements ViewPager.OnPageChangeListener{
    public static  ViewPager viewPager10;
    public static int pagePosition10;
    private static Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay10__a_c10);
        resources = getResources();
        String interstitialAdUnitId = getString(R.string.interstitial_ad_unit_id_adhyay);
        InterstitialAdMobClass.initInterstitialAds(this, interstitialAdUnitId);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved10",0);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 10");
        setSupportActionBar(toolbar);
        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager10=findViewById(R.id.pager10);

        ViewPagerAdapter10 adapter = new ViewPagerAdapter10(getSupportFragmentManager());
        viewPager10.setAdapter(adapter);
        viewPager10.addOnPageChangeListener(this);
        viewPager10.setCurrentItem(recentPage);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager10);
    }
    public static void pageGetPosition10()
    {

        pagePosition10 = viewPager10.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        int pagePo = viewPager10.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved10", pagePo);
        editor.apply();
        if(ClassForCombinedMediaPlayer.mediaPlayerOb !=null){
            if(ClassForCombinedMediaPlayer.mediaPlayerOb.isPlaying()){
                ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            }
        }
        if (InterstitialAdMobClass.mInterstitialAd !=null) {
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
    public static Resources getAdhyay10Resources(){
        return  resources;
    }

}