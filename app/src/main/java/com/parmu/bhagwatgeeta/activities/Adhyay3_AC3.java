package com.parmu.bhagwatgeeta.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter3;

public class Adhyay3_AC3 extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private Toolbar toolbar;
    public static ViewPager viewPager3;
    private ViewPagerAdapter3 adapter;
    private TabLayout tabLayout;
    public static int pagePosition3;
    private int pagePo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay3__a_c3);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved3",0);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 3");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager3=findViewById(R.id.pager3);
        adapter= new ViewPagerAdapter3(getSupportFragmentManager());
        viewPager3.setAdapter(adapter);
        viewPager3.setCurrentItem(recentPage);
        viewPager3.addOnPageChangeListener(this);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager3);
    }

    public static void pageGetPosition3()
    {

        pagePosition3 = viewPager3.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager3.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved3",pagePo);
        editor.apply();
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