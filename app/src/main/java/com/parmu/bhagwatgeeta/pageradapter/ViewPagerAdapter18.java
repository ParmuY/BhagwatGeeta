package com.parmu.bhagwatgeeta.pageradapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay18_AC18;
import com.parmu.bhagwatgeeta.fragments.Fragment18;
import com.parmu.bhagwatgeeta.misc.FileChecker;

public class ViewPagerAdapter18 extends FragmentPagerAdapter {
    private final Context context;

    public ViewPagerAdapter18(FragmentManager supportFragmentManager, Context ctx) {
        super(supportFragmentManager);
        this.context = ctx;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        String fileName;
        if(position==0)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s1"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s1));
            bundle.putString("bhavarth18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s1));
            fragment18.setArguments(bundle);
            return fragment18;
        }

        else if(position==1)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s2"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s2));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s2));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==2)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s3"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s3));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s3));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==3)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s4"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s4));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s4));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==4)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s5"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s5));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s5));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==5)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s6"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s6));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s6));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==6)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s7"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s7));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s7));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==7)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s8"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s8));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s8));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==8)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s9"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s9));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s9));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==9)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s10"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s10));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s10));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==10)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s11"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s11));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s11));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==11)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s12"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s12));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s12));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==12)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s13"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s13));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s13));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==13)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s14"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s14));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s14));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==14)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s15"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s15));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s15));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==15)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s16"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s16));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s16));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==16)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s17"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s17));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s17));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==17)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s18"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s18));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s18));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==18)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s19"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s19));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s19));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==19)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s20"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s20));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s20));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==20)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s21"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s21));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s21));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==21)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s22"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s22));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s22));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==22)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s23"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s23));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s23));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==23)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s24"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s24));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s24));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==24)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s25"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s25));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s25));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==25)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s26"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s26));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s26));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==26)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s27"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s27));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s27));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==27)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s28"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s28));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s28));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==28)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s29"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s29));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s29));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==29)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s30"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s30));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s30));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==30)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s31"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s31));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s31));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==31)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s32"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s32));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s32));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==32)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s33"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s33));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s33));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==33)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s34"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s34));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s34));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==34)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s35"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s35));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s35));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==35)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s36_37"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s36_37));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s36_37));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==36)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s38"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s38));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s38));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==37)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s39"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s39));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s39));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==38)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s40"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s40));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s40));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==39)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s41"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s41));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s41));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==40)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s42"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s42));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s42));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==41)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s43"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s43));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s43));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==42)
            {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
                fileName = "c18s44"+"."+"mp3";
                bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
                bundle.putString("filename18", fileName);
                bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s44));
                bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s44));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==43)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s45"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s45));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s45));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==44)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s46"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s46));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s46));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==45)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s47"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s47));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s47));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==46)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s48"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s48));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s48));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==47)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s49"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s49));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s49));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==48)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s50"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s50));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s50));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==49)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s51_52_53"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s51_52_53));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s51_52_53));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==50)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s54"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s54));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s54));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==51)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s55"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s55));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s55));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==52)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s56"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s56));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s56));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==53)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s57"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s57));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s57));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==54)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s58"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s58));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s58));
            fragment18.setArguments(bundle);
            return fragment18;
        }
         else if(position==55)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s59"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s59));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s59));
            fragment18.setArguments(bundle);
            return fragment18;
        }

        else if(position==56)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s60"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s60));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s60));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==57)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s61"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s61));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s61));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==58)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s62"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s62));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s62));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==59)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s63"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s63));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s63));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==60)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s64"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s64));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s64));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==61)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s65"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s65));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s65));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==62)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s66"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s66));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s66));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==63)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s67"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s67));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s67));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==64)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s68"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s68));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s68));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==65)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s69"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s69));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s69));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==66)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s70"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s70));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s70));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==67)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s71"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s71));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s71));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==68)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s72"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s72));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s72));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==69)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s73"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s73));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s73));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==70)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s74"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s74));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s74));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==71)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s75"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s75));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s75));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==72)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s76"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s76));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s76));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==73)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s77"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s77));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s77));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        else if(position==74)
        {
            Fragment18 fragment18 =new Fragment18();
            Bundle bundle = new Bundle();
            fileName = "c18s78"+"."+"mp3";
            bundle.putBoolean("fileexist18", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename18", fileName);
            bundle.putString("sanskrit18", Adhyay18_AC18.getAdhyay18Resources().getString(R.string.sanskrit_c18s78));
            bundle.putString("bhavarth18",Adhyay18_AC18.getAdhyay18Resources().getString(R.string.bhavarth_c18s78));
            fragment18.setArguments(bundle);
            return fragment18;
        }
        
        return null;
    }

    @Override
    public int getCount() {
        return 75;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=35)
        {
            return "श्लोक "+position;
        }
        else if(position==36)
        {
            return "श्लोक 36,37";
        }
        else if(position<=49)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        else if(position==50)
        {
            return  "श्लोक 51,52,53";
        }
        else if(position<=75){
            position=position+3;
            return  "श्लोक "+position;
        }
        return null;
    }
}
