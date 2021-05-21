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

public class ViewPagerAdapter1 extends FragmentStatePagerAdapter {
    private final Context context;

    public ViewPagerAdapter1(@NonNull FragmentManager fm,Context ctx) {
        super(fm);
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
            fileName = "c1s1"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s1));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;

        }

        else if (position==1)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s2"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s2));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s2));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;

        }

        else if (position==2)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s3"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s3));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s3));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==3)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s4_5_6"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s4_5_6));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s4_5_6));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==4)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s7"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s7));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s7));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==5)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s8"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s8));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s8));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==6)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s9"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s9));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s9));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==7)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s10"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s10));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s10));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==8)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s11"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s11));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s11));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==9)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s12"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s12));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s12));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==10)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s13"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s13));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s13));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==11)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s14"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s14));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s14));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==12)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s15"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s15));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s15));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==13)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s16"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s16));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s16));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==14)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s17_18"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s17_18));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s17_18));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==15)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s19"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s19));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s19));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==16)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s20_21"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s20_21));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s20_21));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==17)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s22"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s22));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s22));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==18)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s23"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s23));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s23));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==19)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s24_25"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s24_25));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s24_25));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==20)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s26"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s26));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s26));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==21)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s27"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s27));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s27));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==22)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s28_29"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s28_29));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s28_29));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==23)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s30"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s30));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s30));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==24)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s31"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s31));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s31));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==25)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s32"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s32));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s32));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==26)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s33"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s33));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s33));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==27)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s34"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s34));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s34));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==28)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s35"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s35));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s35));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==29)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s36"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s36));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s36));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==30)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s37"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s37));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s37));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==31)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s38_39"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s38_39));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s38_39));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==32)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s40"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s40));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s40));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==33)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s41"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s41));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s41));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==34)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s42"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s42));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s42));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==35)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s43"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s43));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s43));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==36)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s44"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s44));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s44));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==37)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s45"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s45));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s45));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==38)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s46"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s46));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s46));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if (position==39)
        {
            SlokaPagerFragment slokaPagerFragment =new SlokaPagerFragment();
            fileName = "c1s47"+"."+"mp3";
            Bundle bundle = new Bundle();
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context, fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c1s47));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c1s47));
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
        position=position+1;
        if(position<=3)
        {
            return "श्लोक "+position;
        }
        else if(position==4)
        {
            return "श्लोक 4,5,6";
        }
        else if(position <= 14)
        {
            position=position+2;
            return "श्लोक "+position;
        }
        else if(position==15)
        {
            return "श्लोक 17,18";
        }
        else if(position==16)
        {
            return "श्लोक 19";
        }
        else if(position==17)
        {
            return "श्लोक 20,21";
        }
        else if(position==18)
        {
            return "श्लोक 22";
        }
        else if (position==19)
        {
            return "श्लोक 23";
        }
        else if(position==20)
        {
            return "श्लोक 24,25";
        }
        else if(position==21)
        {
            return "श्लोक 26";
        }
        else if(position==22)
        {
            return "श्लोक 27";
        }
        else if(position==23)
        {
            return "श्लोक 28,29";
        }
        else if(position<=31)
        {
            position = position+6;
            return "श्लोक "+position;
        }
        else if(position==32)
        {
            return "श्लोक 38,39";
        }
        else if(position<=40)
        {
            position=position+7;
            return "श्लोक "+position;
        }
        return null;
    }


}
