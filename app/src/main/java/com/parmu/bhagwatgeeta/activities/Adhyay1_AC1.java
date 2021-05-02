package com.parmu.bhagwatgeeta.activities;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.InterstitialAdMobClass;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter1;
import java.util.Timer;
import java.util.TimerTask;


public class Adhyay1_AC1 extends AppCompatActivity implements ViewPager.OnPageChangeListener{

    public static ViewPager viewPager;
    public static int pagePosition;
    private static Resources resources;
    private boolean isTimerFinished= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay1__a_c1);
        resources = getResources();

        String interstitialAdUnitId = getString(R.string.interstitial_ad_unit_id_adhyay);
        InterstitialAdMobClass.initInterstitialAds(this, interstitialAdUnitId);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved1", 0);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 1");
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.pager);
        ViewPagerAdapter1 adapter = new ViewPagerAdapter1(getSupportFragmentManager(),this);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);
        //opening recent left page in view pager
        viewPager.setCurrentItem(recentPage);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        final Timer adTimer = new Timer();
        adTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                isTimerFinished = true;
                adTimer.cancel();
            }
        },3*60*1000);
    }

    public static void pageGetPosition() {
        pagePosition = viewPager.getCurrentItem();
    }

    @Override
    protected void onStop() {
        super.onStop();
        int pagePo = viewPager.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved1", pagePo);
        editor.apply();

        if (ClassForCombinedMediaPlayer.mediaPlayerOb != null) {
            if (ClassForCombinedMediaPlayer.mediaPlayerOb.isPlaying()) {
                ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            }
        }
        if (InterstitialAdMobClass.mInterstitialAd !=null&& isTimerFinished) {
            InterstitialAdMobClass.mInterstitialAd.show(this);
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (ClassForCombinedMediaPlayer.mediaPlayerOb != null) {
            if (ClassForCombinedMediaPlayer.mediaPlayerOb.isPlaying()) {
                ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            }
        }
        if(ClassForCombinedMediaPlayer.fileDownloadTask!=null){
            ClassForCombinedMediaPlayer.fileDownloadTask.cancel();
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }
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
        }
    }
    public static Resources getAdhyay1Resources(){
        return resources;
    }
}



