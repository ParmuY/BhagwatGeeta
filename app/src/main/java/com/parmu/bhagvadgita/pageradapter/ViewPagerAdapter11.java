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

public class ViewPagerAdapter11 extends FragmentStatePagerAdapter {
   private final Context context;

    public ViewPagerAdapter11(FragmentManager supportFragmentManager, Context ctx) {
        super(supportFragmentManager);
        this.context = ctx;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String fileName;
        String KEY_ARGU_FILE_EXIST = "fileexist";
        String KEY_ARGU_FILE_NAME = "filename";
        String KEY_ARGU_SANSKRIT = "sanskrit";
        String KEY_ARGU_BHAVARTH = "bhavarth";
        if(position==0)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s1"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s1));
            fragment1.setArguments(bundle);
            return fragment1;
        }

         else if(position==1)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s2"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s2));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s2));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==2)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s3"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s3));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s3));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==3)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s4"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s4));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s4));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==4)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s5"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s5));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s5));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==5)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s6"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s6));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s6));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==6)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s7"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s7));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s7));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==7)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s8"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s8));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s8));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==8)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s9"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s9));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s9));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==9)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s10_11"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s10_11));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s10_11));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==10)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s12"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s12));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s12));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==11)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s13"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s13));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s13));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==12)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s14"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s14));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s14));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==13)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s15"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s15));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s15));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==14)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s16"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s16));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s16));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==15)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s17"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s17));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s17));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==16)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s18"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s18));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s18));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==17)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s19"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s19));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s19));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==18)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s20"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s20));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s20));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==19)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s21"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s21));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s21));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==20)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s22"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s22));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s22));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==21)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s23"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s23));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s23));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==22)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s24"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s24));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s24));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==23)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s25"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s25));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s25));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==24)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s26_27"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s26_27));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s26_27));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==25)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s28"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s28));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s28));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==26)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s29"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s29));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s29));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==27)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s30"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s30));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s30));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==28)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s31"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s31));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s31));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==29)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s32"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s32));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s32));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==30)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s33"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s33));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s33));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==31)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s34"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s34));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s34));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==32)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s35"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s35));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s35));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==33)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s36"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s36));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s36));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==34)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s37"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s37));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s37));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==35)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s38"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s38));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s38));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==36)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s39"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s39));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s39));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==37)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s40"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s40));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s40));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==38)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s41_42"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s41_42));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s41_42));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==39)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s43"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s43));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s43));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==40)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s44"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s44));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s44));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==41)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s45"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s45));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s45));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==42)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s46"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s46));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s46));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==43)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s47"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s47));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s47));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==44)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s48"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s48));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s48));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==45)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s49"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s49));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s49));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==46)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s50"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s50));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s50));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==47)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s51"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s51));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s51));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==48)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s52"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s52));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s52));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==49)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s53"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s53));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s53));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==50)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s54"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s54));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s54));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==51)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c11s55"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s55));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s55));
            fragment1.setArguments(bundle);
            return fragment1;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 52;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=9)
        {
            return "श्लोक "+position;
        }
        else if(position==10)
        {
            return "श्लोक 10,11";
        }
        else if(position<=24)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        else if(position==25)
        {
            return "श्लोक 26,27";
        }
        else if(position<=38)
        {
            position=position+2;
            return "श्लोक "+position;
        }
        else if(position==39){
            return "श्लोक 41,42";
        }
        else if(position<=52)
        {
            position=position+3;
            return "श्लोक "+position;
        }

        return  null;
    }
}
