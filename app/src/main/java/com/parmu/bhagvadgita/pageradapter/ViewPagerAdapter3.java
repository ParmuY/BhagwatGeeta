package com.parmu.bhagvadgita.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.fragments.Fragment1;
import com.parmu.bhagvadgita.misc.FileChecker;

public class ViewPagerAdapter3 extends FragmentStatePagerAdapter {
    private final Context context;


    public ViewPagerAdapter3(FragmentManager supportFragmentManager,Context ctx) {
        super(supportFragmentManager);
        this.context =ctx;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String fileName;
        String KEY_ARGU_FILE_EXIST = "fileexist";
        String KEY_ARGU_FILE_NAME = "filename";
        String KEY_ARGU_SANSKRIT = "sanskrit";
        String KEY_ARGU_BHAVARTH = "bhavarth";
        if (position==0)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s1"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s1));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==1)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s2"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s2));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s2));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==2)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s3"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s3));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s3));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==3)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s4"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s4));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s4));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==4)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s5"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s5));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s5));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==5)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s6"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s6));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s6));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==6)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s7"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s7));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s7));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==7)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s8"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s8));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s8));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==8)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s9"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s9));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s9));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==9)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s10"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s10));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s10));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==10)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s11"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s11));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s11));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==11)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s12"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s12));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s12));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else  if (position==12)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s13"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s13));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s13));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==13)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s14_15"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s14_15));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s14_15));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==14)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s16"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s16));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s16));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==15)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s17"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s17));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s17));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==16)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s18"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s18));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s18));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==17)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s19"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s19));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s19));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==18)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s20"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s20));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s20));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==19)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s21"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s21));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s21));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==20)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s22"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s22));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s22));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==21)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s23"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s23));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s23));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==22)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s24"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s24));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s24));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==23)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s25"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s25));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s25));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==24)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s26"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s26));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s26));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==25)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s27"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s27));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s27));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==26)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s28"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s28));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s28));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==27)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s29"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s29));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s29));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else  if (position==28)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s30"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s30));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s30));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==29)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s31"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s31));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s31));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==30)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s32"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s32));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s32));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==31)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s33"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s33));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s33));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==32)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s34"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s34));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s34));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else  if (position==33)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s35"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s35));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s35));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==34)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s36"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s36));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s36));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==35)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s37"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s37));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s37));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==36)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s38"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s38));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s38));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==37)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s39"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s39));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s39));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==38)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s40"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s40));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s40));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==39)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s41"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s41));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s41));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==40)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s42"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s42));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s42));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==41)
        {
            Fragment1 fragment1 = new Fragment1();
            Bundle bundle=new Bundle();
            fileName = "c3s43"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s43));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s43));
            fragment1.setArguments(bundle);
            return fragment1;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 42;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=13)
        {
            return "श्लोक "+position;
        }
        else if(position==14)
        {
            return "श्लोक 14,15";
        }
        else if (position>=15&&position<=42)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        return null;

}
}
