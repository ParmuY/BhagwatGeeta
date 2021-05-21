package com.parmu.bhagvadgita.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
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

    public AdhyayFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootAdhyayFrag = inflater.inflate(R.layout.fragment_adhyay, container, false);
        ActionBar actionBar = ((AppCompatActivity) requireActivity()).getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        ViewPager viewPager = rootAdhyayFrag.findViewById(R.id.view_pager);
        if (getArguments() != null) {
            String adhyayName = getArguments().getString("adhyayname");
                if(adhyayName.equals("adhyay1")) {
                    actionBar.setTitle("अध्याय 1");
                    ViewPagerAdapter1 adapter = new ViewPagerAdapter1(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter);
                }
                else if(adhyayName.equals("adhyay2")) {
                    actionBar.setTitle("अध्याय 2");
                    ViewPagerAdapter2 adapter2 = new ViewPagerAdapter2(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter2);
                }
                else if(adhyayName.equals("adhyay3")) {
                    actionBar.setTitle("अध्याय 3");
                    ViewPagerAdapter3 adapter3 = new ViewPagerAdapter3(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter3);
                }
                else if(adhyayName.equals("adhyay4")) {
                    actionBar.setTitle("अध्याय 4");
                    ViewPagerAdapter4 adapter4 = new ViewPagerAdapter4(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter4);
                }
                else if(adhyayName.equals("adhyay5")) {
                    actionBar.setTitle("अध्याय 5");
                    ViewPagerAdapter5 adapter5 = new ViewPagerAdapter5(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter5);
                }
                else if(adhyayName.equals("adhyay6")) {
                    actionBar.setTitle("अध्याय 6");
                    ViewPagerAdapter6 adapter6 = new ViewPagerAdapter6(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter6);
                }
                else if(adhyayName.equals("adhyay7")) {
                    actionBar.setTitle("अध्याय 7");
                    ViewPagerAdapter7 adapter7 = new ViewPagerAdapter7(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter7);
                }
                else if(adhyayName.equals("adhyay8")) {
                    actionBar.setTitle("अध्याय 8");
                    ViewPagerAdapter8 adapter8 = new ViewPagerAdapter8(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter8);
                }
                else if(adhyayName.equals("adhyay9")) {
                    actionBar.setTitle("अध्याय 9");
                    ViewPagerAdapter9 adapter9 = new ViewPagerAdapter9(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter9);
                }
                else if(adhyayName.equals("adhyay10")) {
                    actionBar.setTitle("अध्याय 10");
                    ViewPagerAdapter10 adapter10 = new ViewPagerAdapter10(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter10);
                }
                else if(adhyayName.equals("adhyay11")) {
                    actionBar.setTitle("अध्याय 11");
                    ViewPagerAdapter11 adapter11 = new ViewPagerAdapter11(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter11);
                }
                else if(adhyayName.equals("adhyay12")) {
                    actionBar.setTitle("अध्याय 12");
                    ViewPagerAdapter12 adapter12 = new ViewPagerAdapter12(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter12);
                }
                else if(adhyayName.equals("adhyay13")) {
                    actionBar.setTitle("अध्याय 13");
                    ViewPagerAdapter13 adapter13 = new ViewPagerAdapter13(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter13);
                }
                else if(adhyayName.equals("adhyay14")) {
                    actionBar.setTitle("अध्याय 14");
                    ViewPagerAdapter14 adapter14 = new ViewPagerAdapter14(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter14);
                }
                else if(adhyayName.equals("adhyay15")) {
                    actionBar.setTitle("अध्याय 15");
                    ViewPagerAdapter15 adapter15 = new ViewPagerAdapter15(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter15);
                }
                else if(adhyayName.equals("adhyay16")) {
                    actionBar.setTitle("अध्याय 16");
                    ViewPagerAdapter16 adapter16 = new ViewPagerAdapter16(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter16);
                }
                else if(adhyayName.equals("adhyay17")) {
                    actionBar.setTitle("अध्याय 17");
                    ViewPagerAdapter17 adapter17 = new ViewPagerAdapter17(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter17);
                }
                else if(adhyayName.equals("adhyay18")) {
                    actionBar.setTitle("अध्याय 18");
                    ViewPagerAdapter18 adapter18 = new ViewPagerAdapter18(requireActivity().getSupportFragmentManager(),getContext());
                    viewPager.setAdapter(adapter18);
                }

        }
        viewPager.addOnPageChangeListener(this);
        TabLayout tabLayout = rootAdhyayFrag.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        return rootAdhyayFrag;
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
}