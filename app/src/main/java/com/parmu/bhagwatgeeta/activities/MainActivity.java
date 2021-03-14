package com.parmu.bhagwatgeeta.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagwatgeeta.misc.RecycleViewAdapter;
import com.parmu.bhagwatgeeta.misc.RecycleViewItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch switchDark;
    public static final String MY_PREFS_FILENAME = "com.parmu.bhagwatgeeta.DarkMode";
    ArrayList<RecycleViewItem> recycleViewItemList;
    RecyclerView mRecyclerView;
    Toolbar toolbar;
    RecyclerView.LayoutManager mLayoutManager;
    RecycleViewAdapter recycleViewAdapter;
    ActionBar actionBar;
    MenuItem item;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        arrayListForRecyclerView();
        configForRecyclerView();
        hambergerToolbarActionBar();
        nightDaySwitchModeFunctionality();

    }

    // when hamberger is clicked  then drawer opens
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //array list for recycler view
    private void arrayListForRecyclerView(){
        recycleViewItemList = new ArrayList<>();
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon1,"अर्जुनविषाद योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon2,"सांख्य योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon3,"कर्म योग "));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon4,"ज्ञानकर्मसंन्यास योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon5,"कर्मसंन्यास योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon6,"आत्मसंयम योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon7,"ज्ञानविज्ञान योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon8,"अक्षरब्रह्म योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon9,"राजविद्याराजगुह्य योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon10,"विभूतियोग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon11,"विश्वरूपदर्शन योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon12,"भक्ति योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon13,"क्षेत्र-क्षेत्रज्ञविभागयोग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon14,"गुणत्रयविभाग योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon15,"पुरुषोत्तम योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon16,"दैवासुरसम्पद्विभाग योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon17,"श्रद्धात्रयविभाग योग"));
        recycleViewItemList.add(new RecycleViewItem(R.drawable.imgicon18,"मोक्षसंन्यास योग"));
    }
    //recycler view configuration and intents for different adhyay activities
    private void configForRecyclerView(){
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        recycleViewAdapter = new RecycleViewAdapter(recycleViewItemList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(recycleViewAdapter);
        recycleViewAdapter.setOnItemClickListener(new RecycleViewAdapter.OnItemClickListener(){
            @Override
            public void onItemClick(int position){

                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, Adhyay1_AC1.class);
                    startActivity(intent);

                }
                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, Adhyay2_AC2.class);
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, Adhyay3_AC3.class);
                    startActivity(intent);

                }
                if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, Adhyay4_AC4.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(MainActivity.this, Adhyay5_AC_5.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(MainActivity.this, Adhyay6_AC6.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(MainActivity.this, Adhyay7_AC7.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(MainActivity.this, Adhyay8_AC8.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(MainActivity.this, Adhyay9_AC9.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(MainActivity.this, Adhyay10_AC10.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(MainActivity.this, Adhyay11_AC11.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(MainActivity.this, Adhyay12_AC12.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(MainActivity.this, Adhyay13_AC13.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(MainActivity.this, Adhyay14_AC14.class);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(MainActivity.this, Adhyay15_AC15.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(MainActivity.this, Adhyay16_AC16.class);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(MainActivity.this, Adhyay17_AC17.class);
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(MainActivity.this, Adhyay18_AC18.class);
                    startActivity(intent);
                }


            }
        });
    }
    //hamberge menu action bar and toolbar
    private void hambergerToolbarActionBar(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("अध्याय");
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_hamburger_menu);

        //listener for navigation item click
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.dark_mode:
                        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_NO && !switchDark.isChecked()){
                            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                            switchDark.setChecked(true);
                            editor.putBoolean("isDarkModeOn", true);
                        }
                        else{
                            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                            switchDark.setChecked(false);
                            editor.putBoolean("isDarkModeOn", false);
                        }
                        editor.apply();
                        menuItem.setVisible(true);
                        return true;
                    case R.id.share_drawer:
                        displayMessage("share selected");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.rate:
                        displayMessage("rate the app");
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.feedback:
                        feedbackIntent();
                        drawerLayout.closeDrawers();
                        return true;
                    case R.id.about:
                        Intent intent = new Intent(MainActivity.this,AboutAppActivity.class);
                        startActivity(intent);
                        drawerLayout.closeDrawers();
                        return true;
                }
                return true;
            }
        });
    }
    //nightday mode switch functionality
    private void nightDaySwitchModeFunctionality(){
        // function for dark mode switch button
        item = navigationView.getMenu().findItem(R.id.dark_mode);
        switchDark = item.getActionView().findViewById(R.id.switch_dark);

        sharedPref = getSharedPreferences(MY_PREFS_FILENAME, MODE_PRIVATE);
        editor = sharedPref.edit();
        boolean isDarkModeOn = sharedPref.getBoolean("isDarkModeOn", false);
        if (isDarkModeOn) {
            switchDark.setChecked(true);
        } else {
            switchDark.setChecked(false);
        }
        switchDark.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {

                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    editor.putBoolean("isDarkModeOn", true);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    editor.putBoolean("isDarkModeOn", false);
                }
                editor.apply();

            }
        });


    }
    public void displayMessage(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }
    private void feedbackIntent(){
        Intent iFeedback = new Intent(Intent.ACTION_SEND);
        iFeedback.setType("*/*");
        try {
            iFeedback.setPackage("com.google.android.gm");
            iFeedback.putExtra(Intent.EXTRA_EMAIL,new String[] {"pramesh2151@gmail.com"});
            iFeedback.putExtra(Intent.EXTRA_SUBJECT, "App Feedback (BhagwatGeeta)");
            iFeedback.putExtra(Intent.EXTRA_TEXT,"Please provide your feedback here\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        startActivity(Intent.createChooser(iFeedback,"Send Feedback:"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ondestroy","ondestroy called main activity");
        ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
        ClassForCombinedMediaPlayer.mediaPlayerOb.release();
        ClassForCombinedMediaPlayer.mediaPlayerOb = null;
    }

}




