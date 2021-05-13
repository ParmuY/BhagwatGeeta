package com.parmu.bhagvadgita.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.activities.Adhyay3_AC3;
import com.parmu.bhagvadgita.fragments.Fragment3;
import com.parmu.bhagvadgita.misc.FileChecker;

public class ViewPagerAdapter3 extends FragmentStatePagerAdapter {
    private final Context context;


    public ViewPagerAdapter3(FragmentManager supportFragmentManager,Context ctx) {
        super(supportFragmentManager);
        this.context =ctx;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String fileName;
        if (position==0)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s1"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s1));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s1));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==1)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s2"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s2));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s2));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==2)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s3"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s3));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s3));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==3)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s4"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s4));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s4));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==4)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s5"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s5));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s5));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==5)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s6"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s6));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s6));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==6)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s7"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s7));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s7));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==7)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s8"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s8));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s8));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==8)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s9"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s9));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s9));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==9)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s10"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s10));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s10));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==10)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s11"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s11));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s11));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==11)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s12"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s12));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s12));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else  if (position==12)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s13"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s13));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s13));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==13)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s14_15"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s14_15));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s14_15));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==14)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s16"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s16));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s16));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==15)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s17"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s17));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s17));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==16)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s18"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s18));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s18));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==17)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s19"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s19));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s19));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==18)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s20"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s20));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s20));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==19)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s21"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s21));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s21));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==20)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s22"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s22));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s22));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==21)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s23"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s23));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s23));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==22)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s24"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s24));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s24));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==23)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s25"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s25));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s25));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==24)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s26"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s26));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s26));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==25)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s27"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s27));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s27));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==26)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s28"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s28));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s28));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==27)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s29"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s29));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s29));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else  if (position==28)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s30"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s30));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s30));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==29)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s31"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s31));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s31));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==30)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s32"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s32));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s32));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==31)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s33"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s33));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s33));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==32)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s34"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s34));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s34));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else  if (position==33)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s35"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s35));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s35));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==34)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s36"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s36));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s36));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==35)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s37"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s37));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s37));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==36)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s38"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s38));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s38));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==37)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s39"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s39));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s39));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==38)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s40"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s40));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s40));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==39)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s41"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s41));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s41));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==40)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s42"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s42));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s42));
            fragment3.setArguments(bundle);
            return fragment3;
        }
        else if (position==41)
        {
            Fragment3 fragment3 = new Fragment3();
            Bundle bundle=new Bundle();
            fileName = "c3s43"+"."+"mp3";
            bundle.putBoolean("fileexist3", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename3", fileName);
            bundle.putString("sanskrit3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.sanskrit_c3s43));
            bundle.putString("bhavarth3", Adhyay3_AC3.getAdhyay3Resources().getString(R.string.bhavarth_c3s43));
            fragment3.setArguments(bundle);
            return fragment3;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 42;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=13)
        {
            return "श्लोक "+position;
        }
        else if(position==14)
        {
            return "श्लोक 14,15";
        }
        else if (position>=15&&position<=42)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        return null;

}
}
