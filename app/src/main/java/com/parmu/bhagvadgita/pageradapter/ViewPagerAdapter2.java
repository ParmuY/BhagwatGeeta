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

public class  ViewPagerAdapter2 extends FragmentStatePagerAdapter {
    private final Context context;


    public ViewPagerAdapter2(FragmentManager supportFragmentManager,Context ctx) {
        super(supportFragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
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
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s1"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s1));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==1)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s2"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s2));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s2));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==2)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s3"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s3));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s3));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==3)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s4"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s4));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s4));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==4)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s5"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s5));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s5));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==5)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s6"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s6));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s6));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==6)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s7"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s7));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s7));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==7)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s8"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s8));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s8));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==8)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s9"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s9));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s9));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==9)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s10"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s10));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s10));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==10)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s11"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s11));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s11));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==11)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s12"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s12));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s12));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==12)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s13"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s13));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s13));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==13)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s14"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s14));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s14));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==14)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s15"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s15));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s15));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==15)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s16"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s16));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s16));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==16)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s17"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s17));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s17));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==17)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s18"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s18));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s18));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==18)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s19"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s19));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s19));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==19)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s20"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s20));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s20));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==20)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s21"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s21));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s21));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==21)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s22"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s22));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s22));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==22)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s23"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s23));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s23));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==23)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s24"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s24));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s24));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==24)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s25"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s25));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s25));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==25)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s26"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s26));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s26));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==26)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s27"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s27));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s27));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==27)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s28"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s28));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s28));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==28)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s29"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s29));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s29));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==29)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s30"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s30));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s30));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==30)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s31"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s31));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s31));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==31)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s32"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s32));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s32));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==32)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s33"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s33));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s33));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==33)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s34"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s34));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s34));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==34)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s35"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s35));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s35));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==35)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s36"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s36));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s36));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==36)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s37"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s37));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s37));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==37)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s38"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s38));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s38));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==38)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s39"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s39));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s39));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==39)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s40"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s40));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s40));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==40)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s41"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s41));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s41));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==41)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s42_43_44"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s42_43_44));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s42_43_44));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==42)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s45"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s45));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s45));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==43)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s46"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s46));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s46));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==44)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s47"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s47));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s47));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==45)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s48"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s48));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s48));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==46)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s49"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s49));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s49));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==47)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s50"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s50));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s50));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==48)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s51"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s51));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s51));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==49)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s52"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s52));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s52));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==50)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s53"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s53));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s53));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==51)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s54"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s54));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s54));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==52)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s55"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s55));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s55));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==53)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s56"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s56));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s56));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==54)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s57"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s57));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s57));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==55)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s58"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s58));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s58));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==56)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s59"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s59));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s59));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==57)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s60"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s60));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s60));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==58)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s61"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s61));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s61));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==59)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s62"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s62));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s62));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==60)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s63"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s63));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s63));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==61)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s64"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s64));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s64));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==62)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s65"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s65));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s65));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==63)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s66"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s66));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s66));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==64)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s67"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s67));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s67));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==65)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s68"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s68));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s68));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==66)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s69"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s69));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s69));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==67)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s70"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s70));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s70));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==68)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s71"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s71));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s71));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        if(position==69)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            fileName = "c2s72"+"."+"mp3";
            Bundle bundle=new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c2s72));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c2s72));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
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
        else if(position<=70)
        {
            position=position+2;
            return "श्लोक "+position;
        }
        return null;

    }

}
