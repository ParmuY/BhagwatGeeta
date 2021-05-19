package com.parmu.bhagvadgita.pageradapter;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.fragments.Fragment14;
import com.parmu.bhagvadgita.misc.FileChecker;

public class ViewPagerAdapter14 extends FragmentStatePagerAdapter {
    private final Context context;

    public ViewPagerAdapter14(FragmentManager supportFragmentManager, Context ctx) {
        super(supportFragmentManager);
        this.context = ctx;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String fileName;
        if(position==0)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s1"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s1));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s1));
            fragment14.setArguments(bundle);
            return fragment14;
        }

        else if(position==1)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s2"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s2));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s2));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==2)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s3"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s3));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s3));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==3)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s4"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s4));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s4));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==4)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s5"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s5));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s5));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==5)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s6"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s6));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s6));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==6)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s7"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s7));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s7));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==7)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s8"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s8));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s8));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==8)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s9"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s9));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s9));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==9)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s10"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s10));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s10));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==10)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s11"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s11));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s11));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==11)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s12"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s12));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s12));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==12)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s13"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s13));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s13));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==13)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s14"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s14));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s14));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==14)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s15"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s15));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s15));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==15)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s16"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s16));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s16));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==16)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s17"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s17));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s17));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==17)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s18"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s18));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s18));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==18)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s19"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s19));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s19));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==19)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s20"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s20));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s20));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==20)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s21"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s21));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s21));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==21)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s22"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s22));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s22));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==22)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s23"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s23));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s23));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==23)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s24"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s24));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s24));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==24)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s25"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s25));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s25));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==25)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s26"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s26));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s26));
            fragment14.setArguments(bundle);
            return fragment14;
        }
        else if(position==26)
        {
            Fragment14 fragment14 =new Fragment14();
            Bundle bundle = new Bundle();
            fileName = "c14s27"+"."+"mp3";
            bundle.putBoolean("fileexist14", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename14", fileName);
            bundle.putString("sanskrit14", context.getString(R.string.sanskrit_c14s27));
            bundle.putString("bhavarth14", context.getString(R.string.bhavarth_c14s27));
            fragment14.setArguments(bundle);
            return fragment14;
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
        return "श्लोक "+position;
    }
}
