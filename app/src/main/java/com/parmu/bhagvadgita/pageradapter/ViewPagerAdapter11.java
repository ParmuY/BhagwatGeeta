package com.parmu.bhagvadgita.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.fragments.Fragment11;
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
        if(position==0)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s1"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s1));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s1));
            fragment11.setArguments(bundle);
            return fragment11;
        }

         else if(position==1)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s2"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s2));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s2));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==2)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s3"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s3));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s3));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==3)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s4"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s4));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s4));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==4)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s5"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s5));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s5));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==5)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s6"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s6));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s6));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==6)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s7"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s7));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s7));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==7)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s8"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s8));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s8));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==8)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s9"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s9));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s9));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==9)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s10_11"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s10_11));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s10_11));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==10)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s12"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s12));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s12));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==11)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s13"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s13));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s13));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==12)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s14"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s14));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s14));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==13)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s15"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s15));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s15));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==14)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s16"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s16));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s16));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==15)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s17"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s17));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s17));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==16)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s18"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s18));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s18));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==17)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s19"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s19));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s19));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==18)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s20"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s20));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s20));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==19)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s21"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s21));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s21));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==20)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s22"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s22));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s22));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==21)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s23"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s23));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s23));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==22)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s24"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s24));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s24));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==23)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s25"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s25));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s25));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==24)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s26_27"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s26_27));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s26_27));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==25)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s28"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s28));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s28));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==26)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s29"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s29));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s29));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==27)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s30"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s30));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s30));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==28)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s31"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s31));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s31));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==29)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s32"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s32));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s32));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==30)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s33"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s33));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s33));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==31)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s34"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s34));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s34));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==32)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s35"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s35));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s35));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==33)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s36"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s36));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s36));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==34)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s37"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s37));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s37));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==35)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s38"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s38));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s38));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==36)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s39"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s39));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s39));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==37)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s40"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s40));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s40));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==38)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s41_42"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s41_42));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s41_42));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==39)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s43"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s43));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s43));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==40)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s44"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s44));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s44));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==41)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s45"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s45));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s45));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==42)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s46"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s46));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s46));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==43)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s47"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s47));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s47));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==44)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s48"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s48));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s48));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==45)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s49"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s49));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s49));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==46)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s50"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s50));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s50));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==47)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s51"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s51));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s51));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==48)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s52"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s52));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s52));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==49)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s53"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s53));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s53));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==50)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s54"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s54));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s54));
            fragment11.setArguments(bundle);
            return fragment11;
        }
        else if(position==51)
        {
            Fragment11 fragment11 =new Fragment11();
            Bundle bundle = new Bundle();
            fileName = "c11s55"+"."+"mp3";
            bundle.putBoolean("fileexist11", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename11", fileName);
            bundle.putString("sanskrit11", context.getString(R.string.sanskrit_c11s55));
            bundle.putString("bhavarth11", context.getString(R.string.bhavarth_c11s55));
            fragment11.setArguments(bundle);
            return fragment11;
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
