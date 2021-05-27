package com.parmu.bhagvadgita.activities;

import android.annotation.SuppressLint;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.navigation.NavigationView;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.fragments.ListViewFragment;
import com.parmu.bhagvadgita.misc.InterstitialAdMobClass;


public class MainActivity extends AppCompatActivity {
//code optimization and improvization
    //bitmap feature implementation branch

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private SwitchCompat switchDark;
    private static final String MY_PREFS_FILENAME = "com.parmu.bhagvadgita.DarkMode";
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;
    private boolean isDarkModeOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.frag_container_list_view, ListViewFragment.class,null,"listviewfrag")
                    .commit();
        }
        sharedPref = getSharedPreferences(MY_PREFS_FILENAME, MODE_PRIVATE);
        isDarkModeOn = sharedPref.getBoolean("isDarkModeOn", false);
        if(isDarkModeOn){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
        hambergerToolbarActionBar();
        nightDaySwitchModeFunctionality();

        MobileAds.initialize(this, initializationStatus -> {});
    }

    // when hamberger is clicked  then drawer opens
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.e("home button clicked", "hamberger menu opens");
        FragmentManager fm = getSupportFragmentManager();
        if (item.getItemId() == android.R.id.home) {
            if(fm.getBackStackEntryCount()==0){
                drawerLayout.openDrawer(GravityCompat.START);
            }
            else if(fm.getBackStackEntryCount()==1){
                fm.popBackStack("adhyay",FragmentManager.POP_BACK_STACK_INCLUSIVE);
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @SuppressLint("NonConstantResourceId")
    private void hambergerToolbarActionBar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("अध्याय");
        setSupportActionBar(toolbar);
        editor = sharedPref.edit();
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(menuItem -> {
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
                    Intent iShare= new Intent(Intent.ACTION_VIEW);
                    iShare.setData(Uri.parse(getResources().getString(R.string.app_link_playstore)+ "com.parmu.bhagvadgita"));
                    startActivity(iShare);
                    drawerLayout.closeDrawers();
                    return true;
                case R.id.rate:
                    displayMessage("rate the app (currently not available)");
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
                case R.id.privacy_policy:
                    Intent ipolicy = new Intent(Intent.ACTION_VIEW);
                    ipolicy.setData(Uri.parse("https://bhgvd-giitaa-bhagavad-g.flycricket.io/privacy.html"));
                    startActivity(ipolicy);
            }
            return true;
        });
    }
    //nightday mode switch functionality
    private void nightDaySwitchModeFunctionality(){
        // function for dark mode switch button
        MenuItem item = navigationView.getMenu().findItem(R.id.dark_mode);
        switchDark = item.getActionView().findViewById(R.id.switch_dark);
        editor=sharedPref.edit();
        switchDark.setChecked(isDarkModeOn);
        switchDark.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                editor.putBoolean("isDarkModeOn", true);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                editor.putBoolean("isDarkModeOn", false);
            }
            editor.apply();
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
    protected void onStop(){
        super.onStop();
        if(InterstitialAdMobClass.mInterstitialAd!=null){
            InterstitialAdMobClass.mInterstitialAd = null;
        }
    }

}




