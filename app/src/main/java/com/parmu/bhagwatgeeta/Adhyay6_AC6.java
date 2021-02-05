package com.parmu.bhagwatgeeta;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Adhyay6_AC6 extends AppCompatActivity {
    private Toolbar toolbar;
    public static ViewPager viewPager6;
    private ViewPagerAdapter6 adapter;
    private TabLayout tabLayout;
    public static int pagePosition6;
    private int pagePo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay6__a_c6);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved6",0);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 6");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        viewPager6= findViewById(R.id.pager6);
        adapter = new ViewPagerAdapter6(getSupportFragmentManager());
        viewPager6.setAdapter(adapter);
        viewPager6.setCurrentItem(recentPage);

        tabLayout=findViewById(R.id.tabs);
       tabLayout.setupWithViewPager(viewPager6);

    }

    public static void pageGetPosition6()
    {

        pagePosition6 = viewPager6.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager6.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved6",pagePo);
        editor.apply();
    }



}