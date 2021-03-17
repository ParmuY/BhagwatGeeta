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
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter1;

public class Adhyay1_AC1 extends AppCompatActivity implements ViewPager.OnPageChangeListener{

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
        int recentPage = sharedPreferences.getInt("PageSaved1", 0);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 1");
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.pager);
        adapter = new ViewPagerAdapter1(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(this);
        //opening recent left page in view pager
        viewPager.setCurrentItem(recentPage);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public static void pageGetPosition() {
        pagePosition = viewPager.getCurrentItem();
    }

    @Override
    protected void onStop() {
        super.onStop();
        pagePo = viewPager.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved1", pagePo);
        editor.apply();

        if (ClassForCombinedMediaPlayer.mediaPlayerOb != null) {
            if (ClassForCombinedMediaPlayer.mediaPlayerOb.isPlaying()) {
                ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            }
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
    }
}



