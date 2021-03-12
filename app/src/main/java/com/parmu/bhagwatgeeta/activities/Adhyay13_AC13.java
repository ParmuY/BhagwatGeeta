package com.parmu.bhagwatgeeta.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter13;

public class Adhyay13_AC13 extends AppCompatActivity {
    private Toolbar toolbar;
    public static ViewPager viewPager13;
    private ViewPagerAdapter13 adapter;
    private TabLayout tabLayout;
    public static int pagePosition13;
    private int pagePo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay13__a_c13);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved13",0);

        toolbar= findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 13");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager13=findViewById(R.id.pager13);
        adapter=new ViewPagerAdapter13(getSupportFragmentManager());
        viewPager13.setAdapter(adapter);
        viewPager13.setCurrentItem(recentPage);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager13);
    }
    public static void pageGetPosition13()
    {

        pagePosition13 = viewPager13.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager13.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved13",pagePo);
        editor.apply();
    }
}