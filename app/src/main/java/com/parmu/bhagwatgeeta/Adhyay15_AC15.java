package com.parmu.bhagwatgeeta;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Adhyay15_AC15 extends AppCompatActivity {
    private Toolbar toolbar;
   public static  ViewPager viewPager15;
    private ViewPagerAdapter15 adapter;
    private TabLayout tabLayout;
    public static int pagePosition15;
    private int pagePo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay15__a_c15);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved15",0);

        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 15");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager15=findViewById(R.id.pager15);
        adapter=new ViewPagerAdapter15(getSupportFragmentManager());
        viewPager15.setAdapter(adapter);
        viewPager15.setCurrentItem(recentPage);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager15);
    }
    public static void pageGetPosition15()
    {

        pagePosition15 = viewPager15.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager15.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved15",pagePo);
        editor.apply();
    }
}