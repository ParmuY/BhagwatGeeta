package com.parmu.bhagwatgeeta.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter12;

public class Adhyay12_AC12 extends AppCompatActivity {
    private Toolbar toolbar;
    public static  ViewPager viewPager12;
    private ViewPagerAdapter12 adapter;
    private TabLayout tabLayout;
    public static int pagePosition12;
    private int pagePo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay12__a_c12);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved12",0);

        toolbar= findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 12");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager12=findViewById(R.id.pager12);

        adapter=new ViewPagerAdapter12(getSupportFragmentManager());
        viewPager12.setAdapter(adapter);
        viewPager12.setCurrentItem(recentPage);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager12);
    }
    public static void pageGetPosition12()
    {

        pagePosition12 = viewPager12.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager12.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved12",pagePo);
        editor.apply();
    }
}