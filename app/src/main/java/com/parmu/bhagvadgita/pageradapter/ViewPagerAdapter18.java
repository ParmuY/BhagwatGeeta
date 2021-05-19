package com.parmu.bhagvadgita.pageradapter;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.fragments.Fragment1;
import com.parmu.bhagvadgita.misc.FileChecker;

public class ViewPagerAdapter18 extends FragmentPagerAdapter {
    private final Context context;

    public ViewPagerAdapter18(FragmentManager supportFragmentManager, Context ctx) {
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
            fileName = "c18s1"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c18s1));
            fragment1.setArguments(bundle);
            return fragment1;
        }

        else if(position==1)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s2"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s2));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s2));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==2)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s3"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s3));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s3));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==3)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s4"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s4));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s4));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==4)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s5"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s5));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s5));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==5)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s6"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s6));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s6));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==6)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s7"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s7));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s7));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==7)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s8"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s8));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s8));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==8)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s9"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s9));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s9));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==9)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s10"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s10));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s10));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==10)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s11"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s11));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s11));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==11)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s12"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s12));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s12));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==12)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s13"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s13));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s13));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==13)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s14"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s14));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s14));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==14)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s15"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s15));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s15));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==15)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s16"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s16));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s16));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==16)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s17"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s17));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s17));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==17)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s18"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s18));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s18));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==18)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s19"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s19));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s19));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==19)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s20"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s20));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s20));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==20)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s21"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s21));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s21));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==21)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s22"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s22));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s22));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==22)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s23"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s23));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s23));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==23)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s24"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s24));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s24));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==24)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s25"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s25));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s25));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==25)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s26"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s26));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s26));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==26)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s27"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s27));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s27));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==27)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s28"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s28));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s28));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==28)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s29"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s29));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s29));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==29)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s30"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s30));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s30));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==30)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s31"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s31));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s31));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==31)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s32"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s32));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s32));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==32)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s33"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s33));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s33));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==33)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s34"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s34));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s34));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==34)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s35"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s35));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s35));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==35)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s36_37"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s36_37));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s36_37));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==36)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s38"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s38));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s38));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==37)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s39"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s39));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s39));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==38)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s40"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s40));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s40));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==39)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s41"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s41));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s41));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==40)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s42"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s42));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s42));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==41)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s43"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s43));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s43));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==42)
            {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
                fileName = "c18s44"+"."+"mp3";
                bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
                bundle.putString(KEY_ARGU_FILE_NAME, fileName);
                bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s44));
                bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s44));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==43)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s45"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s45));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s45));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==44)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s46"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s46));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s46));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==45)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s47"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s47));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s47));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==46)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s48"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s48));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s48));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==47)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s49"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s49));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s49));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==48)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s50"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s50));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s50));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==49)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s51_52_53"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s51_52_53));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s51_52_53));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==50)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s54"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s54));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s54));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==51)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s55"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s55));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s55));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==52)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s56"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s56));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s56));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==53)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s57"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s57));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s57));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==54)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s58"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s58));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s58));
            fragment1.setArguments(bundle);
            return fragment1;
        }
         else if(position==55)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s59"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s59));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s59));
            fragment1.setArguments(bundle);
            return fragment1;
        }

        else if(position==56)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s60"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s60));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s60));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==57)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s61"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s61));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s61));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==58)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s62"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s62));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s62));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==59)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s63"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s63));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s63));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==60)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s64"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s64));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s64));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==61)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s65"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s65));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s65));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==62)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s66"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s66));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s66));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==63)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s67"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s67));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s67));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==64)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s68"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s68));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s68));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==65)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s69"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s69));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s69));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==66)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s70"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s70));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s70));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==67)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s71"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s71));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s71));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==68)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s72"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s72));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s72));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==69)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s73"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s73));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s73));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==70)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s74"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s74));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s74));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==71)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s75"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s75));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s75));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==72)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s76"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s76));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s76));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==73)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s77"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s77));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s77));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==74)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c18s78"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c18s78));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c18s78));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        
        return null;
    }

    @Override
    public int getCount() {
        return 75;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=35)
        {
            return "श्लोक "+position;
        }
        else if(position==36)
        {
            return "श्लोक 36,37";
        }
        else if(position<=49)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        else if(position==50)
        {
            return  "श्लोक 51,52,53";
        }
        else if(position<=75){
            position=position+3;
            return  "श्लोक "+position;
        }
        return null;
    }
}
