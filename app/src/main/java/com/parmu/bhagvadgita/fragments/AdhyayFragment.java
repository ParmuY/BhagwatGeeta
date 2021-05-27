package com.parmu.bhagvadgita.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.misc.ClassForCombinedMediaPlayer;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter1;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter10;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter11;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter12;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter13;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter14;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter15;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter16;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter17;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter18;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter2;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter3;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter4;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter5;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter6;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter7;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter8;
import com.parmu.bhagvadgita.pageradapter.ViewPagerAdapter9;

public class AdhyayFragment extends Fragment implements ViewPager.OnPageChangeListener {
    private static ViewPager viewPager;
    private ActionBar actionBar;
    private SharedPreferences sharedPrefFrag;
    private SharedPreferences.Editor prefEditorFrag;
    private static final String MY_PAGER_HISORY_PREF_FILE = "com.parmu.bhagvadgita.PagerHistory";
    private String adhyayName ;
    private static int adhyayNum;

    public AdhyayFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @SuppressLint("RestrictedApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootAdhyayFrag = inflater.inflate(R.layout.fragment_adhyay, container, false);
        actionBar = ((AppCompatActivity) requireActivity()).getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        assert getArguments() != null;
        adhyayName = getArguments().getString("adhyayname");
        sharedPrefFrag = requireActivity().getSharedPreferences(MY_PAGER_HISORY_PREF_FILE,Context.MODE_PRIVATE);

        viewPager = rootAdhyayFrag.findViewById(R.id.view_pager);
        viewPager.addOnPageChangeListener(this);
        TabLayout tabLayout = rootAdhyayFrag.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        configureAdapter();
        return rootAdhyayFrag;
    }

    private void configureAdapter() {
            switch (adhyayName) {
                case "adhyay1":
                    adhyayNum = 1;
                    actionBar.setTitle("अध्याय 1");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter1 adapter = new ViewPagerAdapter1(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter);
                    break;
                case "adhyay2":
                    adhyayNum = 2;
                    actionBar.setTitle("अध्याय 2");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter2 adapter2 = new ViewPagerAdapter2(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter2);
                    break;
                case "adhyay3":
                    actionBar.setTitle("अध्याय 3");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter3 adapter3 = new ViewPagerAdapter3(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter3);
                    adhyayNum = 3;
                    break;
                case "adhyay4":
                    actionBar.setTitle("अध्याय 4");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter4 adapter4 = new ViewPagerAdapter4(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter4);
                    adhyayNum = 4;
                    break;
                case "adhyay5":
                    actionBar.setTitle("अध्याय 5");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter5 adapter5 = new ViewPagerAdapter5(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter5);
                    adhyayNum = 5;
                    break;
                case "adhyay6":
                    actionBar.setTitle("अध्याय 6");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter6 adapter6 = new ViewPagerAdapter6(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter6);
                    adhyayNum = 6;
                    break;
                case "adhyay7":
                    actionBar.setTitle("अध्याय 7");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter7 adapter7 = new ViewPagerAdapter7(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter7);
                    adhyayNum = 7;
                    break;
                case "adhyay8":
                    actionBar.setTitle("अध्याय 8");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter8 adapter8 = new ViewPagerAdapter8(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter8);
                    adhyayNum = 8;
                    break;
                case "adhyay9":
                    actionBar.setTitle("अध्याय 9");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter9 adapter9 = new ViewPagerAdapter9(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter9);
                    adhyayNum = 9;
                    break;
                case "adhyay10":
                    actionBar.setTitle("अध्याय 10");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter10 adapter10 = new ViewPagerAdapter10(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter10);
                    adhyayNum = 10;
                    break;
                case "adhyay11":
                    actionBar.setTitle("अध्याय 11");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter11 adapter11 = new ViewPagerAdapter11(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter11);
                    adhyayNum = 11;
                    break;
                case "adhyay12":
                    actionBar.setTitle("अध्याय 12");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter12 adapter12 = new ViewPagerAdapter12(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter12);
                    adhyayNum = 12;
                    break;
                case "adhyay13":
                    actionBar.setTitle("अध्याय 13");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter13 adapter13 = new ViewPagerAdapter13(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter13);
                    adhyayNum = 13;
                    break;
                case "adhyay14":
                    actionBar.setTitle("अध्याय 14");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter14 adapter14 = new ViewPagerAdapter14(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter14);
                    adhyayNum = 14;
                    break;
                case "adhyay15":
                    actionBar.setTitle("अध्याय 15");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter15 adapter15 = new ViewPagerAdapter15(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter15);
                    adhyayNum = 15;
                    break;
                case "adhyay16":
                    actionBar.setTitle("अध्याय 16");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter16 adapter16 = new ViewPagerAdapter16(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter16);
                    adhyayNum = 16;
                    break;
                case "adhyay17":
                    actionBar.setTitle("अध्याय 17");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter17 adapter17 = new ViewPagerAdapter17(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter17);
                    adhyayNum = 17;
                    break;
                case "adhyay18":
                    actionBar.setTitle("अध्याय 18");
                    viewPager.setAdapter(null);
                    ViewPagerAdapter18 adapter18 = new ViewPagerAdapter18(getChildFragmentManager(), getContext());
                    viewPager.setAdapter(adapter18);
                    adhyayNum = 18;
                    break;
            }
    }
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.app_bar_menu_1, menu);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        if (ClassForCombinedMediaPlayer.mediaPlayerOb != null) {
            if (ClassForCombinedMediaPlayer.mediaPlayerOb.isPlaying()) {
                ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            }
        }
        if(ClassForCombinedMediaPlayer.fileDownloadTask!=null){
            ClassForCombinedMediaPlayer.fileDownloadTask.cancel();
            ClassForCombinedMediaPlayer.fileDownloadTask = null;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        if(ClassForCombinedMediaPlayer.mediaPlayerOb!=null){
            ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            ClassForCombinedMediaPlayer.mediaPlayerOb.release();
            ClassForCombinedMediaPlayer.mediaPlayerOb = null;
        }
        if(ClassForCombinedMediaPlayer.fileDownloadTask!=null){
            ClassForCombinedMediaPlayer.fileDownloadTask.cancel();
            ClassForCombinedMediaPlayer.fileDownloadTask = null;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        if (ClassForCombinedMediaPlayer.mediaPlayerOb != null) {
            if (ClassForCombinedMediaPlayer.mediaPlayerOb.isPlaying()) {
                ClassForCombinedMediaPlayer.mediaPlayerOb.reset();
            }
        }
        if(ClassForCombinedMediaPlayer.fileDownloadTask!=null){
            ClassForCombinedMediaPlayer.fileDownloadTask.cancel();
            ClassForCombinedMediaPlayer.fileDownloadTask = null;
        }
    }
    public static int getPagerPositon(){
        return viewPager.getCurrentItem();
    }
    public static int getAdhyayNum() {
        return adhyayNum;
    }
}