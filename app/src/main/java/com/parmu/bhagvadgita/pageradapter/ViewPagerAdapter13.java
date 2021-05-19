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

public class ViewPagerAdapter13 extends FragmentStatePagerAdapter {
    private final Context context;

    public ViewPagerAdapter13(FragmentManager supportFragmentManager, Context ctx) {
        super(supportFragmentManager);
        this.context=ctx;
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
            fileName = "c13s1"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s1));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s1));
            fragment1.setArguments(bundle);
            return fragment1;
        }

        else if(position==1)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s2"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s2));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s2));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==2)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s3"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s3));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s3));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==3)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s4"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s4));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s4));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==4)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s5"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s5));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s5));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==5)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s6"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s6));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s6));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==6)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s7"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s7));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s7));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==7)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s8"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s8));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s8));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==8)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s9"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s9));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s9));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==9)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s10"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s10));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s10));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==10)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s11"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s11));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s11));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==11)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s12"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s12));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s12));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==12)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s13"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s13));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s13));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==13)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s14"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s14));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s14));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==14)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s15"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s15));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s15));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==15)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s16"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s16));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s16));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==16)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s17"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s17));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s17));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==17)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s18"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s18));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s18));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==18)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s19"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s19));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s19));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==19)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s20"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s20));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s20));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==20)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s21"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s21));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s21));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==21)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s22"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s22));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s22));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==22)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s23"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s23));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s23));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==23)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s24"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s24));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s24));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==24)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s25"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s25));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s25));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==25)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s26"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s26));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s26));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==26)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s27"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s27));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s27));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==27)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s28"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s28));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s28));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==28)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s29"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s29));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s29));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==29)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s30"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s30));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s30));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==30)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s31"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s31));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s31));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==31)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s32"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s32));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s32));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==32)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s33"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s33));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s33));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if(position==33)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            fileName = "c13s34"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c13s34));
            bundle.putString(KEY_ARGU_BHAVARTH,context.getString(R.string.bhavarth_c13s34));
            fragment1.setArguments(bundle);
            return fragment1;
        }


        return null;
    }

    @Override
    public int getCount() {
        return 34;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        return "श्लोक "+position;
    }
}
