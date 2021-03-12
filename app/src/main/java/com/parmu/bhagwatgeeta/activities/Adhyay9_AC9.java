package com.parmu.bhagwatgeeta.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.pageradapter.ViewPagerAdapter9;

public class Adhyay9_AC9 extends AppCompatActivity {
    private Toolbar toolbar;
   public static ViewPager viewPager9;
    private ViewPagerAdapter9 adapter;
    private TabLayout tabLayout;
    public static int pagePosition9;
    private int pagePo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adhyay9__a_c9);

        SharedPreferences sharedPreferences = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        int recentPage = sharedPreferences.getInt("PageSaved9",0);

        toolbar= findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय 9");
        setSupportActionBar(toolbar);
        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager9=findViewById(R.id.pager9);
        adapter=new ViewPagerAdapter9(getSupportFragmentManager());
        viewPager9.setAdapter(adapter);
        viewPager9.setCurrentItem(recentPage);

        tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager9);

    }
    public static void pageGetPosition9()
    {
        pagePosition9 = viewPager9.getCurrentItem();
    }
    @Override
    protected  void onStop(){
        super.onStop();
        pagePo = viewPager9.getCurrentItem();
        SharedPreferences sharedPref = getSharedPreferences("com.parmu.bhagwatgeeta.SavedActivity", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("PageSaved9",pagePo);
        editor.apply();
    }
}