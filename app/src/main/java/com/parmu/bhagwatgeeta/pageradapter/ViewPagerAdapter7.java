package com.parmu.bhagwatgeeta.pageradapter;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay7_AC7;
import com.parmu.bhagwatgeeta.fragments.Fragment7;
import com.parmu.bhagwatgeeta.misc.FileChecker;

public class ViewPagerAdapter7 extends FragmentStatePagerAdapter {
    private final Context context;

    public ViewPagerAdapter7(FragmentManager supportFragmentManager, Context ctx) {
        super(supportFragmentManager);
        this.context = ctx;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        String fileName;
        if(position==0)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s1"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s1));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s1));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==1)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s2"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s2));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s2));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==2)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s3"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s3));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s3));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==3)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s4_5"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s4_5));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s4_5));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==4)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s6"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s6));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s6));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==5)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s7"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s7));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s7));
            fragment7.setArguments(bundle);
            return fragment7;
        }else if(position==6)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s8"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s8));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s8));
            fragment7.setArguments(bundle);
            return fragment7;
        }else if(position==7)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s9"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s9));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s9));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==8)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s10"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s10));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s10));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==9)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s11"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s11));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s11));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==10)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s12"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s12));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s12));
            fragment7.setArguments(bundle);
            return fragment7;
        }else if(position==11)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s13"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s13));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s13));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==12)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s14"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s14));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s14));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==13)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s15"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s15));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s15));
            fragment7.setArguments(bundle);
            return fragment7;
        }else if(position==14)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s16"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s16));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s16));
            fragment7.setArguments(bundle);
            return fragment7;
        }

        else if(position==15)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s17"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s17));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s17));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==16)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s18"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s18));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s18));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==17)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s19"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s19));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s19));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==18)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s20"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s20));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s20));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==19)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s21"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s21));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s21));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==20)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s22"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s22));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s22));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==21)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s23"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s23));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s23));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==22)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s24"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s24));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s24));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==23)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s25"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s25));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s25));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==24)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s26"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s26));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s26));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==25)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s27"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s27));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s27));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==26)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s28"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s28));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s28));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==27)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s29"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s29));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s29));
            fragment7.setArguments(bundle);
            return fragment7;
        }
        else if(position==28)
        {
            Fragment7 fragment7 =new Fragment7();
            Bundle bundle= new Bundle();
            fileName = "c7s30"+"."+"mp3";
            bundle.putBoolean("fileexist7", FileChecker.checkFileForExistence(context,fileName));
            bundle.putString("filename7", fileName);
            bundle.putString("sanskrit7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.sanskrit_c7s30));
            bundle.putString("bhavarth7", Adhyay7_AC7.getAdhyay7Resources().getString(R.string.bhavarth_c7s30));
            fragment7.setArguments(bundle);
            return fragment7;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 29;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=3)
        {
            return "श्लोक "+position;
        }
        else if (position==4)
        {
            return "श्लोक 4,5";
        }
        else if(position<=29&&position>=5)
        { position=position+1;
            return "श्लोक "+position;
        }
        return null;
    }
}

