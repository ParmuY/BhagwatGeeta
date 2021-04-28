package com.parmu.bhagwatgeeta.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay1_AC1;
import com.parmu.bhagwatgeeta.activities.Adhyay2_AC2;
import com.parmu.bhagwatgeeta.fragments.Fragment2;
import com.parmu.bhagwatgeeta.misc.FileChecker;

public class  ViewPagerAdapter2 extends FragmentStatePagerAdapter {
    private final Context context = Adhyay2_AC2.getAdhyay2Context();
    public ViewPagerAdapter2(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter2(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        String fileName;
        if(position==0)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s1"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s1));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s1));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==1)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s2"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s2));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s2));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==2)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s3"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s3));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s3));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==3)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s4"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s4));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s4));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==4)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s5"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s5));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s5));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==5)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s6"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s6));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s6));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==6)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s7"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s7));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s7));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==7)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s8"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s8));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s8));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==8)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s9"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s9));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s9));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==9)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s10"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s10));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s10));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==10)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s11"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s11));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s11));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==11)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s12"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s12));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s12));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==12)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s13"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s13));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s13));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==13)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s14"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s14));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s14));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==14)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s15"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s15));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s15));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==15)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s16"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s16));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s16));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==16)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s17"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s17));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s17));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==17)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s18"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s18));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s18));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==18)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s19"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s19));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s19));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==19)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s20"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s20));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s20));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==20)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s21"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s21));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s21));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==21)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s22"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s22));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s22));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==22)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s23"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s23));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s23));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==23)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s24"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s24));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s24));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==24)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s25"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s25));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s25));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==25)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s26"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s26));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s26));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==26)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s27"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s27));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s27));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==27)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s28"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s28));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s28));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==28)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s29"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s29));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s29));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==29)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s30"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s30));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s30));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==30)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s31"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s31));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s31));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==31)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s32"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s32));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s32));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==32)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s33"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s33));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s33));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==33)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s34"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s34));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s34));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==34)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s35"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s35));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s35));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==35)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s36"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s36));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s36));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==36)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s37"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s37));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s37));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==37)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s38"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s38));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s38));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==38)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s39"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s39));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s39));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==39)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s40"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s40));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s40));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==40)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s41"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s41));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s41));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==41)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s42_43_44"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s42_43_44));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s42_43_44));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==42)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s45"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s45));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s45));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==43)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s46"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s46));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s46));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==44)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s47"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s47));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s47));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==45)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s48"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s48));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s48));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==46)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s49"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s49));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s49));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==47)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s50"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s50));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s50));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==48)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s51"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s51));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s51));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==49)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s52"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s52));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s52));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==50)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s53"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s53));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s53));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==51)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s54"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s54));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s54));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==52)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s55"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s55));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s55));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==53)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s56"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s56));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s56));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==54)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s57"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s57));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s57));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==55)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s58"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s58));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s58));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==56)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s59"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s59));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s59));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==57)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s60"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s60));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s60));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==58)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s61"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s61));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s61));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==59)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s62"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s62));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s62));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==60)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s63"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s63));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s63));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==61)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s64"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s64));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s64));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==62)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s65"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s65));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s65));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==63)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s66"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s66));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s66));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==64)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s67"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s67));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s67));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==65)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s68"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s68));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s68));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==66)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s69"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s69));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s69));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==67)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s70"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s70));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s70));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==68)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s71"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s71));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s71));
            fragment2.setArguments(bundle);
            return fragment2;
        }
        if(position==69)
        {
            Fragment2 fragment2 = new Fragment2();
            fileName = "c2s72"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean("fileexist2", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename2", fileName);
            bundle.putString("sanskrit2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.sanskrit_c2s72));
            bundle.putString("bhavarth2", Adhyay2_AC2.getAdhyay2Resources().getString(R.string.bhavarth_c2s72));
            fragment2.setArguments(bundle);
            return fragment2;
        }


        return null;
    }

    @Override
    public int getCount() {
        return 70;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=41)
        {
            return "श्लोक "+position;
        }
        else if(position==42)
        {
            return "श्लोक 42,43,44";
        }
        else if(position<=70&&position>=43)
        {
            position=position+2;
            return "श्लोक "+position;
        }
        return null;

    }

}
