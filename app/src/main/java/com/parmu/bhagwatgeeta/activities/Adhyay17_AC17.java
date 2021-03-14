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
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter17;

public class Adhyay17_AC17 extends AppCompatActivity implements ViewPager.OnPageChangeListener{
    private Toolbar toolbar;
   public static  ViewPager viewPager17;
    private ViewPagerAdapter17 adapter;
    private TabLayout tabLayout;
    public static int pagePosition17;
    private int pagePo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay17__a_c17);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved17",0);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 17");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager17= findViewById(R.id.pager17);
        adapter=new ViewPagerAdapter17(getSupportFragmentManager());
        viewPager17.setAdapter(adapter);
        viewPager17.setCurrentItem(recentPage);
        viewPager17.addOnPageChangeListener(this);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager17);
    }
    public static void pageGetPosition17()
    {

        pagePosition17 = viewPager17.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager17.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved17",pagePo);
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