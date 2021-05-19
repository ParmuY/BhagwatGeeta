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

public class ViewPagerAdapter10 extends FragmentStatePagerAdapter {
    private final Context context;

    public ViewPagerAdapter10(FragmentManager supportFragmentManager, Context ctx) {
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
            fileName = "c10s1"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s1));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==1)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s2"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s2));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s2));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==2)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s3"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s3));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s3));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==3)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s4_5"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s4_5));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s4_5));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==4)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s6"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s6));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s6));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==5)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s7"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s7));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s7));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==6)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s8"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s8));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s8));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==7)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s9"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s9));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s9));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==8)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s10"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s10));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s10));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==9)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s11"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s11));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s11));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==10)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s12_13"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s12_13));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s12_13));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==11)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s14"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s14));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s14));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==12)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s15"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s15));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s15));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==13)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s16"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s16));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s16));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==14)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s17"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s17));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s17));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==15)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s18"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s18));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s18));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==16)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s19"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s19));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s19));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==17)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s20"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s20));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s20));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==18)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s21"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s21));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s21));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==19)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s22"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s22));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s22));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==20)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s23"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s23));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s23));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==21)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s24"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s24));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s24));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==22)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s25"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s25));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s25));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==23)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s26"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s26));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s26));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==24)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s27"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s27));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s27));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==25)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s28"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s28));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s28));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==26)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s29"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s29));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s29));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==27)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s30"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s30));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s30));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==28)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s31"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s31));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s31));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==29)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s32"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s32));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s32));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==30)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s33"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s33));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s33));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==31)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s34"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s34));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s34));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==32)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s35"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s35));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s35));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==33)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s36"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s36));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s36));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==34)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s37"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s37));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s37));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==35)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s38"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s38));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s38));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==36)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s39"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s39));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s39));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==37)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s40"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s40));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s40));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==38)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s41"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s41));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s41));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==39)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c10s42"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c10s42));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c10s42));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 40;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position = position + 1;
        if (position <= 3) {
            return "श्लोक " + position;
        } else if (position == 4) {
            return "श्लोक 4,5";
        } else if (position <= 10) {
            position = position + 1;
            return "श्लोक " + position;
        } 
        else if(position==11){
            return "श्लोक 12,13";
        }
        else if (position <= 40) {
            position = position + 2;
            return "श्लोक " + position;
        }
        return null;
    }
}
