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

public class ViewPagerAdapter8 extends FragmentStatePagerAdapter {
    private final Context context;

    public ViewPagerAdapter8(FragmentManager supportFragmentManager,Context ctx) {
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
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s1"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s1));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s1));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==1)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s2"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s2));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s2));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==2)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s3"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s3));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s3));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==3)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s4"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s4));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s4));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==4)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s5"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s5));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s5));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==5)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s6"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s6));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s6));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==6)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s7"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s7));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s7));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==7)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s8"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s8));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s8));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==8)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s9"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s9));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s9));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==9)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s10"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s10));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s10));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==10)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s11"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s11));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s11));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==11)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s12_13"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s12_13));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s12_13));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==12)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s14"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s14));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s14));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==13)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s15"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s15));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s15));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==14)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s16"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s16));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s16));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==15)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s17"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s17));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s17));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==16)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s18"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s18));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s18));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==17)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s19"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s19));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s19));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==18)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s20"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s20));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s20));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==19)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s21"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s21));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s21));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==20)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s22"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s22));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s22));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==21)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s23"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s23));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s23));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==22)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s24"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s24));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s24));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==23)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s25"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s25));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s25));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==24)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s26"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s26));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s26));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==25)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s27"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s27));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s27));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }
        else if(position==26)
        {
            SlokaPagerFragment slokaPagerFragment = new SlokaPagerFragment();
            Bundle bundle = new Bundle();
            fileName = "c8s28"+"."+"mp3";
            bundle.putBoolean(KEY_ARGU_FILE_EXIST, FileChecker.checkFileForExistence(context,fileName));
            bundle.putString(KEY_ARGU_FILE_NAME, fileName);
            bundle.putString(KEY_ARGU_SANSKRIT, context.getString(R.string.sanskrit_c8s28));
            bundle.putString(KEY_ARGU_BHAVARTH, context.getString(R.string.bhavarth_c8s28));
            slokaPagerFragment.setArguments(bundle);
            return slokaPagerFragment;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 27;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=11)
        {
            return "श्लोक "+position;
        }
        else if(position==12)
        {
            return  "श्लोक 12,13";
        }
        else if(position<=27)
        {
            position=position+1;
            return  "श्लोक "+position;
        }
        return null;
    }
}
