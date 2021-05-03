package com.parmu.bhagwatgeeta.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay8_AC8;
import com.parmu.bhagwatgeeta.fragments.Fragment8;
import com.parmu.bhagwatgeeta.misc.FileChecker;

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
        if(position==0)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s1"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s1));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s1));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==1)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s2"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s2));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s2));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==2)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s3"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s3));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s3));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==3)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s4"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s4));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s4));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==4)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s5"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s5));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s5));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==5)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s6"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s6));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s6));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==6)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s7"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s7));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s7));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==7)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s8"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s8));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s8));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==8)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s9"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s9));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s9));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==9)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s10"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s10));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s10));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==10)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s11"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s11));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s11));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==11)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s12_13"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s12_13));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s12_13));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==12)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s14"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s14));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s14));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==13)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s15"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s15));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s15));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==14)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s16"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s16));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s16));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==15)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s17"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s17));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s17));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==16)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s18"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s18));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s18));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==17)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s19"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s19));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s19));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==18)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s20"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s20));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s20));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==19)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s21"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s21));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s21));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==20)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s22"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s22));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s22));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==21)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s23"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s23));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s23));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==22)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s24"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s24));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s24));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==23)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s25"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s25));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s25));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==24)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s26"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s26));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s26));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==25)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s27"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s27));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s27));
            fragment8.setArguments(bundle);
            return fragment8;
        }
        else if(position==26)
        {
            Fragment8 fragment8 = new Fragment8();
            Bundle bundle = new Bundle();
            fileName = "c8s28"+"."+"mp3";
            bundle.putBoolean("fileexist8", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename8", fileName);
            bundle.putString("sanskrit8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.sanskrit_c8s28));
            bundle.putString("bhavarth8", Adhyay8_AC8.getAdhyay8Resources().getString(R.string.bhavarth_c8s28));
            fragment8.setArguments(bundle);
            return fragment8;
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
        else if(position<=27&&position>=13)
        {
            position=position+1;
            return  "श्लोक "+position;
        }
        return null;
    }
}
