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

public class ViewPagerAdapter16 extends FragmentStatePagerAdapter {
    private final Context context;

    public ViewPagerAdapter16(FragmentManager supportFragmentManager, Context ctx) {
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
            fileName = "c16s1"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s1));
            fragment1.setArguments(bundle);
            return fragment1;
        }

        else if(position==1)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s2"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s2));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s2));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==2)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s3"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s3));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s3));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==3)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s4"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s4));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s4));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==4)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s5"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s5));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s5));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==5)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s6"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s6));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s6));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==6)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s7"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s7));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s7));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==7)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s8"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s8));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s8));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==8)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s9"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s9));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s9));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==9)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s10"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s10));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s10));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==10)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s11"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s11));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s11));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==11)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s12"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s12));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s12));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==12)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s13"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s13));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s13));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==13)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s14"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s14));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s14));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==14)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s15_16"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s15_16));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s15_16));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==15)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s17"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s17));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s17));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==16)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s18"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s18));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s18));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==17)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s19"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s19));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s19));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==18)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s20"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s20));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s20));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==19)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s21"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s21));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s21));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==20)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s22"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s22));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s22));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==21)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s23"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s23));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s23));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==22)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c16s24"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c16s24));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c16s24));
            fragment1.setArguments(bundle);
            return fragment1;
        }


        return null;
    }

    @Override
    public int getCount() {
        return 23;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=14)
        {
           return  "श्लोक "+position;
        }
        else if(position==15)
        {
           return  "श्लोक 15,16";
        }
        else if(position<=23)
        {   position=position+1;
            return "श्लोक "+position;
        }
        return null;
    }
}
