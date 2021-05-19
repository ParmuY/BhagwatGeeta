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
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s1"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s1));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }

         else if(position==1)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s2"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s2));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s2));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==2)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s3"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s3));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s3));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==3)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s4"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s4));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s4));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==4)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s5"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s5));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s5));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==5)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s6"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s6));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s6));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==6)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s7"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s7));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s7));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==7)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s8"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s8));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s8));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==8)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s9"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s9));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s9));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==9)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s10_11"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s10_11));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s10_11));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==10)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s12"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s12));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s12));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==11)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s13"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s13));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s13));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==12)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s14"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s14));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s14));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==13)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s15"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s15));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s15));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==14)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s16"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s16));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s16));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==15)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s17"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s17));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s17));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==16)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s18"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s18));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s18));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==17)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s19"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s19));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s19));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==18)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s20"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s20));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s20));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==19)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s21"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s21));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s21));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==20)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s22"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s22));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s22));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==21)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s23"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s23));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s23));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==22)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s24"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s24));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s24));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==23)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s25"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s25));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s25));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==24)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s26_27"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s26_27));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s26_27));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==25)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s28"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s28));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s28));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==26)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s29"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s29));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s29));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==27)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s30"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s30));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s30));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==28)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s31"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s31));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s31));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==29)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s32"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s32));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s32));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==30)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s33"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s33));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s33));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==31)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s34"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s34));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s34));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==32)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s35"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s35));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s35));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==33)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s36"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s36));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s36));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==34)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s37"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s37));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s37));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==35)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s38"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s38));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s38));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==36)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s39"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s39));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s39));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==37)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s40"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s40));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s40));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==38)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s41_42"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s41_42));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s41_42));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==39)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s43"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s43));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s43));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==40)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s44"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s44));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s44));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==41)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s45"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s45));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s45));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==42)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s46"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s46));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s46));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==43)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s47"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s47));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s47));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==44)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s48"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s48));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s48));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==45)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s49"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s49));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s49));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==46)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s50"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s50));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s50));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==47)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s51"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s51));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s51));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==48)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s52"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s52));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s52));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==49)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s53"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s53));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s53));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==50)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s54"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s54));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s54));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==51)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c11s55"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c11s55));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c11s55));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
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
