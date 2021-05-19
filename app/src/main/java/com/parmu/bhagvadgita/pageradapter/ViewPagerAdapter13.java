package com.parmu.bhagvadgita.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.fragments.Fragment13;
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
        if(position==0)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s1"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s1));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s1));
            fragment13.setArguments(bundle);
            return fragment13;
        }

        else if(position==1)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s2"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s2));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s2));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==2)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s3"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s3));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s3));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==3)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s4"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s4));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s4));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==4)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s5"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s5));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s5));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==5)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s6"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s6));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s6));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==6)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s7"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s7));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s7));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==7)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s8"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s8));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s8));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==8)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s9"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s9));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s9));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==9)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s10"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s10));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s10));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==10)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s11"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s11));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s11));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==11)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s12"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s12));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s12));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==12)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s13"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s13));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s13));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==13)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s14"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s14));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s14));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==14)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s15"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s15));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s15));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==15)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s16"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s16));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s16));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==16)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s17"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s17));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s17));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==17)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s18"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s18));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s18));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==18)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s19"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s19));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s19));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==19)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s20"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s20));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s20));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==20)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s21"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s21));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s21));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==21)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s22"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s22));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s22));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==22)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s23"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s23));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s23));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==23)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s24"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s24));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s24));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==24)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s25"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s25));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s25));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==25)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s26"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s26));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s26));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==26)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s27"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s27));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s27));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==27)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s28"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s28));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s28));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==28)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s29"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s29));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s29));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==29)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s30"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s30));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s30));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==30)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s31"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s31));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s31));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==31)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s32"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s32));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s32));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==32)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s33"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s33));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s33));
            fragment13.setArguments(bundle);
            return fragment13;
        }
        else if(position==33)
        {
            Fragment13 fragment13 =new Fragment13();
            Bundle bundle = new Bundle();
            fileName = "c13s34"+"."+"mp3";
            bundle.putBoolean("fileexist13", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename13", fileName);
            bundle.putString("sanskrit13", context.getString(R.string.sanskrit_c13s34));
            bundle.putString("bhavarth13",context.getString(R.string.bhavarth_c13s34));
            fragment13.setArguments(bundle);
            return fragment13;
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
