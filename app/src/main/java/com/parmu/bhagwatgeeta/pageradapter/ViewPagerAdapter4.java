package com.parmu.bhagwatgeeta.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay4_AC4;
import com.parmu.bhagwatgeeta.fragments.Fragment4;
import com.parmu.bhagwatgeeta.misc.FileChecker;

public class ViewPagerAdapter4 extends FragmentStatePagerAdapter {
    private final Context context = Adhyay4_AC4.getAdhyay4Context();
    public ViewPagerAdapter4(@NonNull FragmentManager fm, int behavior)
    {
        super(fm, behavior);
    }

    public ViewPagerAdapter4(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String fileName;
        if (position == 0)
        {
         Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s1"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s1));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s1));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 1)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s2"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s2));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s2));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 2)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s3"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s3));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s3));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 3)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s4"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s4));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s4));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 4)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s5"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s5));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s5));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 5)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s6"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s6));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s6));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 6)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s7"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s7));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s7));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 7)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s8"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s8));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s8));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 8)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s9"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s9));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s9));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 9)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s10"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s10));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s10));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 10)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s11"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s11));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s11));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 11)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s12"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s12));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s12));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 12)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s13"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s13));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s13));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 13)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s14"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s14));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s14));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 14)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s15"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s15));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s15));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 15)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s16"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s16));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s16));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 16)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s17"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s17));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s17));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 17)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s18"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s18));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s18));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 18)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s19"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s19));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s19));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 19)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s20"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s20));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s20));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position ==20)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s21"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s21));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s21));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 21)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s22"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s22));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s22));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 22)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s23"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s23));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s23));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 23)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s24"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s24));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s24));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 24)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s25"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s25));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s25));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 25)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s26"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s26));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s26));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 26)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s27"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s27));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s27));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 27)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s28"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s28));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s28));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 28)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s29_30"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s29_30));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s29_30));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 29)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s31"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s31));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s31));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 30)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s32"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s32));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s32));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 31)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s33"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s33));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s33));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 32)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s34"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s34));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s34));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 33)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s35"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s35));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s35));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 34)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s36"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s36));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s36));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 35)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s37"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s37));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s37));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 36)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s38"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s38));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s38));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 37)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s39"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s39));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s39));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 38)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s40"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s40));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s40));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 39)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s41"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s41));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s41));
            fragment4.setArguments(bundle);
            return fragment4;
        }
        else if (position == 40)
        {
            Fragment4 fragment4 =new Fragment4();
            Bundle bundle=new Bundle();
            fileName = "c4s42"+"."+"mp3";
            bundle.putBoolean("fileexist4", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename4", fileName);
            bundle.putString("sanskrit4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.sanskrit_c4s42));
            bundle.putString("bhavarth4", Adhyay4_AC4.getAdhyay4Resources().getString(R.string.bhavarth_c4s42));
            fragment4.setArguments(bundle);
            return fragment4;
        }




        return null;
    }

    @Override
    public int getCount()
    {
        return 41;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=28)
        {
          return "श्लोक "+position;
        }
        else if(position==29)
        {
            return "श्लोक 29,30";
        }
        if(position<=42&&position>=30)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        return null;

    }

}
