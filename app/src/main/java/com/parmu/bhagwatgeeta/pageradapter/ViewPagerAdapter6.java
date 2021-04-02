package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay6_AC6;
import com.parmu.bhagwatgeeta.fragments.Fragment6;

public class ViewPagerAdapter6 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter6(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter6(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s1));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s1));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==1)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s2));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s2));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==2)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s3));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s3));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==3)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s4));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s4));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==4)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s5));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s5));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==5)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s6));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s6));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==6)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s7));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s7));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==7)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s8));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s8));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==8)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s9));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s9));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==9)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s10));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s10));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==10)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s11));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s11));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==11)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s12));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s12));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==12)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s13));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s13));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==13)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s14));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s14));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==14)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s15));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s15));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==15)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s16));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s16));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==16)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s17));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s17));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==17)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s18));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s18));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==18)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s19));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s19));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==19)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s20));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s20));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==20)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s21));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s21));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==21)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s22));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s22));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==22)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s23));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s23));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==23)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s24));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s24));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==24)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s25));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s25));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==25)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s26));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s26));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==26)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s27));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s27));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==27)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s28));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s28));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==28)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s29));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s29));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==29)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s30));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s30));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==30)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s31));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s31));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==31)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s32));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s32));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==32)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s33));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s33));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==33)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s34));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s34));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==34)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s35));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s35));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==35)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s36));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s36));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==36)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s37));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s37));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==37)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s38));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s38));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==38)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s39));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s39));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==39)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s40));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s40));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==40)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s41));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s41));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==41)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s42));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s42));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==42)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s43));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s43));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==43)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s44));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s44));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==44)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s45));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s45));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==45)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s46));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s46));
            fragment6.setArguments(bundle);
            return fragment6;
        }
        else if(position==46)
        {
            Fragment6 fragment6 =new Fragment6();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.sanskrit_c6s47));
            bundle.putString("bhavarth6", Adhyay6_AC6.getAdhyay6Resources().getString(R.string.bhavarth_c6s47));
            fragment6.setArguments(bundle);
            return fragment6;
        }


        return null;
    }

    @Override
    public int getCount() {
        return 47;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        return"श्लोक "+position;
    }
}

