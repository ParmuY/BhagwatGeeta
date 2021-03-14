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
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter18;

public class Adhyay18_AC18 extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private Toolbar toolbar;
   public static  ViewPager viewPager18;
    private ViewPagerAdapter18 adapter;
    private TabLayout tabLayout;
    public static int pagePosition18;
    private int pagePo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay18__a_c18);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved18",0);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 18");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager18= findViewById(R.id.pager18);
        adapter=new ViewPagerAdapter18(getSupportFragmentManager());
        viewPager18.setAdapter(adapter);
        viewPager18.setCurrentItem(recentPage);
        viewPager18.addOnPageChangeListener(this);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager18);
    }
    public static void pageGetPosition18()
    {

        pagePosition18 = viewPager18.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager18.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved18",pagePo);
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