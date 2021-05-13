package com.parmu.bhagvadgita.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.parmu.bhagvadgita.R;
import com.parmu.bhagvadgita.activities.Adhyay17_AC17;
import com.parmu.bhagvadgita.fragments.Fragment17;
import com.parmu.bhagvadgita.misc.FileChecker;

public class ViewPagerAdapter17 extends FragmentPagerAdapter {
    private final Context context;

    public ViewPagerAdapter17(FragmentManager supportFragmentManager, Context ctx) {
        super(supportFragmentManager);
        this.context =ctx;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String fileName;
        if(position==0)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s1"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s1));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s1));
            fragment17.setArguments(bundle);
            return fragment17;
        }

        else if(position==1)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s2"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s2));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s2));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==2)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s3"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s3));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s3));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==3)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s4"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s4));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s4));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==4)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s5"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s5));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s5));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==5)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s6"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s6));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s6));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==6)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s7"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s7));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s7));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==7)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s8"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s8));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s8));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==8)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s9"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s9));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s9));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==9)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s10"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s10));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s10));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==10)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s11"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s11));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s11));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==11)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s12"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s12));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s12));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==12)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s13"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s13));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s13));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==13)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s14"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s14));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s14));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==14)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s15"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s15));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s15));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==15)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s16"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s16));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s16));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==16)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s17"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s17));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s17));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==17)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s18"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s18));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s18));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==18)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s19"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s19));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s19));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==19)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s20"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s20));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s20));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==20)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s21"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s21));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s21));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==21)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s22"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s22));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s22));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==22)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s23"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s23));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s23));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==23)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s24"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s24));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s24));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==24)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s25"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s25));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s25));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==25)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s26"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s26));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s26));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==26)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s27"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s27));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s27));
            fragment17.setArguments(bundle);
            return fragment17;
        }
        else if(position==27)
        {
            Fragment17 fragment17 =new Fragment17();
            Bundle bundle = new Bundle();
            fileName = "c17s28"+"."+"mp3";
            bundle.putBoolean("fileexist17", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename17", fileName);
            bundle.putString("sanskrit17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.sanskrit_c17s28));
            bundle.putString("bhavarth17", Adhyay17_AC17.getAdhyay17Resources().getString(R.string.bhavarth_c17s28));
            fragment17.setArguments(bundle);
            return fragment17;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 28;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        return "श्लोक "+position;
    }
}
