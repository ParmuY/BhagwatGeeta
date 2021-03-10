package com.parmu.bhagwatgeeta.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter10;

public class Adhyay10_AC10 extends AppCompatActivity {
    private Toolbar toolbar;
    public static  ViewPager viewPager10;
    private ViewPagerAdapter10 adapter;
    private TabLayout tabLayout;
    public static int pagePosition10;
    private int pagePo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay10__a_c10);
        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved10",0);

        toolbar= findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 10");
        setSupportActionBar(toolbar);
        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager10=findViewById(R.id.pager10);

        adapter=new ViewPagerAdapter10(getSupportFragmentManager());
        viewPager10.setAdapter(adapter);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager10);
    }
    public static void pageGetPosition10()
    {

        pagePosition10 = viewPager10.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager10.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved10",pagePo);
        editor.apply();
    }

}