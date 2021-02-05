package com.parmu.bhagwatgeeta;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Adhyay11_AC11 extends AppCompatActivity {
    private Toolbar toolbar;
    public static  ViewPager viewPager11;
    private ViewPagerAdapter11 adapter;
    private TabLayout tabLayout;
    public static int pagePosition11;
    private int pagePo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay11__a_c11);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved11",0);

        toolbar= findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 11");
        setSupportActionBar(toolbar);

        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager11=findViewById(R.id.pager11);
        adapter=new ViewPagerAdapter11(getSupportFragmentManager());
        viewPager11.setAdapter(adapter);
        viewPager11.setCurrentItem(recentPage);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager11);
    }
    public static void pageGetPosition11()
    {

        pagePosition11 = viewPager11.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager11.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved11",pagePo);
        editor.apply();
    }

}