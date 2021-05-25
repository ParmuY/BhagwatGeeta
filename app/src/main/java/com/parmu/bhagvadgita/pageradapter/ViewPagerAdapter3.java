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

public class ViewPagerAdapter3 extends FragmentStatePagerAdapter {
    private final Context context;


    public ViewPagerAdapter3(FragmentManager supportFragmentManager,Context ctx) {
        super(supportFragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
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
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s1"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s1));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==1)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s2"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s2));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s2));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==2)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s3"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s3));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s3));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==3)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s4"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s4));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s4));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==4)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s5"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s5));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s5));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==5)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s6"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s6));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s6));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==6)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s7"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s7));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s7));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==7)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s8"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s8));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s8));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==8)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s9"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s9));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s9));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==9)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s10"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s10));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s10));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==10)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s11"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s11));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s11));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==11)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s12"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s12));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s12));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else  if (position==12)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s13"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s13));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s13));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==13)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s14_15"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s14_15));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s14_15));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==14)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s16"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s16));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s16));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==15)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s17"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s17));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s17));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==16)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s18"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s18));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s18));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==17)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s19"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s19));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s19));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==18)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s20"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s20));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s20));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==19)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s21"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s21));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s21));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==20)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s22"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s22));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s22));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==21)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s23"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s23));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s23));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==22)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s24"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s24));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s24));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==23)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s25"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s25));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s25));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==24)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s26"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s26));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s26));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==25)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s27"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s27));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s27));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==26)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s28"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s28));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s28));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==27)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s29"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s29));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s29));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else  if (position==28)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s30"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s30));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s30));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==29)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s31"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s31));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s31));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==30)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s32"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s32));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s32));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==31)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s33"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s33));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s33));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==32)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s34"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s34));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s34));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else  if (position==33)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s35"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s35));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s35));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==34)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s36"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s36));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s36));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==35)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s37"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s37));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s37));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==36)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s38"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s38));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s38));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==37)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s39"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s39));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s39));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==38)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s40"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s40));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s40));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==39)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s41"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s41));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s41));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==40)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s42"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s42));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s42));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==41)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle=new Bundle();
            fileName = "c3s43"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c3s43));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c3s43));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
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
