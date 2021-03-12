package com.parmu.bhagwatgeeta.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter7;

public class Adhyay7_AC7 extends AppCompatActivity {
    private Toolbar toolbar;
    public static ViewPager viewPager7;
    private ViewPagerAdapter7 adapter;
    private TabLayout tabLayout;
    public static int pagePosition7;
    private int pagePo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay7__a_c7);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved7", 0);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 7");
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager7 = findViewById(R.id.pager7);
        adapter = new ViewPagerAdapter7(getSupportFragmentManager());
        viewPager7.setAdapter(adapter);
        viewPager7.setCurrentItem(recentPage);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager7);
    }

    public static void pageGetPosition7() {

        pagePosition7 = viewPager7.getCurrentItem();
    }

    @Override
    public void onStop() {
        super.onStop();
        pagePo = viewPager7.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved7", pagePo);
        editor.apply();
    }
}