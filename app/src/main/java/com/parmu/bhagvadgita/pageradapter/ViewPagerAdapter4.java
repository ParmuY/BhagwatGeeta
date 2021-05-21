package com.parmu.bhagvadgita.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.fragments.SlokaPagerFragment;
import com.parmu.bhagvadgita.misc.FileChecker;

public class ViewPagerAdapter4 extends FragmentStatePagerAdapter {
    private final Context context;


    public ViewPagerAdapter4(FragmentManager supportFragmentManager,Context ctx) {
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
        if (position == 0)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s1"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s1));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 1)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s2"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s2));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s2));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 2)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s3"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s3));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s3));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 3)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s4"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s4));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s4));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 4)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s5"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s5));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s5));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 5)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s6"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s6));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s6));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 6)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s7"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s7));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s7));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 7)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s8"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s8));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s8));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 8)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s9"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s9));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s9));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 9)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s10"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s10));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s10));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 10)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s11"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s11));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s11));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 11)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s12"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s12));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s12));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 12)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s13"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s13));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s13));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 13)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s14"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s14));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s14));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 14)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s15"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s15));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s15));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 15)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s16"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s16));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s16));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 16)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s17"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s17));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s17));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 17)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s18"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s18));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s18));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 18)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s19"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s19));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s19));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 19)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s20"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s20));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s20));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position ==20)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s21"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s21));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s21));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 21)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s22"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s22));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s22));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 22)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s23"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s23));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s23));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 23)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s24"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s24));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s24));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 24)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s25"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s25));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s25));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 25)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s26"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s26));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s26));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 26)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s27"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s27));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s27));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 27)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s28"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s28));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s28));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 28)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s29_30"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s29_30));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s29_30));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 29)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s31"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s31));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s31));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 30)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s32"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s32));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s32));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 31)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s33"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s33));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s33));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 32)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s34"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s34));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s34));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 33)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s35"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s35));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s35));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 34)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s36"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s36));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s36));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 35)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s37"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s37));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s37));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 36)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s38"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s38));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s38));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 37)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s39"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s39));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s39));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 38)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s40"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s40));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s40));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 39)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s41"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s41));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s41));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position == 40)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c4s42"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c4s42));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c4s42));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }




        return null;
    }

    @Override
    public int getCount()
    {
        return 41;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=28)
        {
          return "श्लोक "+position;
        }
        else if(position==29)
        {
            return "श्लोक 29,30";
        }
        if(position<=42&&position>=30)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        return null;

    }

}
