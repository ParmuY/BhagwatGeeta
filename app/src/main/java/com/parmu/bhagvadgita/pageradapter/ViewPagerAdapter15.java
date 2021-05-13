package com.parmu.bhagvadgita.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.activities.Adhyay15_AC15;
import com.parmu.bhagvadgita.fragments.Fragment15;
import com.parmu.bhagvadgita.misc.FileChecker;

public class ViewPagerAdapter15 extends FragmentStatePagerAdapter {
    private final Context context;

    public ViewPagerAdapter15(FragmentManager supportFragmentManager, Context ctx) {
        super(supportFragmentManager);
        this.context = ctx;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String fileName;
        if(position==0)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s1"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s1));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s1));
            fragment15.setArguments(bundle);
            return fragment15;
        }

        else if(position==1)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s2"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s2));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s2));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==2)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s3"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s3));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s3));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==3)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s4"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s4));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s4));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==4)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s5"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s5));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s5));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==5)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s6"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s6));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s6));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==6)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s7"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s7));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s7));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==7)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s8"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s8));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s8));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==8)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s9"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s9));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s9));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==9)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s10"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s10));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s10));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==10)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s11"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s11));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s11));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==11)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s12"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s12));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s12));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==12)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s13"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s13));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s13));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==13)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s14"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s14));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s14));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==14)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s15"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s15));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s15));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==15)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s16"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s16));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s16));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==16)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s17"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s17));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s17));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==17)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s18"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s18));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s18));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==18)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s19"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s19));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s19));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        else if(position==19)
        {
            Fragment15 fragment15 =new Fragment15();
            Bundle bundle = new Bundle();
            fileName = "c15s20"+"."+"mp3";
            bundle.putBoolean("fileexist15", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename15", fileName);
            bundle.putString("sanskrit15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.sanskrit_c15s20));
            bundle.putString("bhavarth15", Adhyay15_AC15.getAdhyay15Resources().getString(R.string.bhavarth_c15s20));
            fragment15.setArguments(bundle);
            return fragment15;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        return "श्लोक "+position;
    }
}
