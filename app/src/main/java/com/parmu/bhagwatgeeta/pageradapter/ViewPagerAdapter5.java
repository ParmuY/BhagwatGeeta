package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay5_AC_5;
import com.parmu.bhagwatgeeta.fragments.Fragment5;

public class ViewPagerAdapter5 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter5(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter5(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s1));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s1));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==1)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s2));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s2));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==2)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s3));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s3));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==3)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s4));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s4));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==4)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s5));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s5));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==5)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s6));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s6));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==6)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s7));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s7));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==7)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s8_9));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s8_9));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==8)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s10));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s10));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==9)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s11));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s11));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==10)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s12));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s12));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==11)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s13));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s13));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==12)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s14));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s14));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==13)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s15));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s15));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==14)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s16));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s16));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==15)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s17));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s17));
            fragment5.setArguments(bundle);
            return fragment5;
        }else if(position==16)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s18));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s18));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==17)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s19));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s19));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==18)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s20));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s20));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==19)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s21));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s21));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==20)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s22));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s22));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==21)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s23));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s23));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==22)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s24));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s24));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==23)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s25));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s25));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==24)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s26));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s26));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==25)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s27_28));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s27_28));
            fragment5.setArguments(bundle);
            return fragment5;
        }
        else if(position==26)
        {
            Fragment5 fragment5 =new Fragment5();
            Bundle bundle= new Bundle();
            bundle.putString("sanskrit5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.sanskrit_c5s29));
            bundle.putString("bhavarth5", Adhyay5_AC_5.getAdhyay5Resources().getString(R.string.bhavarth_c5s29));
            fragment5.setArguments(bundle);
            return fragment5;
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
        if(position<=7)
        {
            return "श्लोक "+position;
        }
        else if(position==8)
        {
            return "श्लोक 8,9";
        }
        else if(position<=25&&position>=9)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        else if(position==26)
        {
            return "श्लोक 27,28";
        }
        else if(position==27)
        {
            return  "श्लोक 29";
        }
        return null;
    }
}

