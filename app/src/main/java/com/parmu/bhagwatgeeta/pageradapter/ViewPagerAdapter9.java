package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay9_AC9;
import com.parmu.bhagwatgeeta.fragments.Fragment9;

public class ViewPagerAdapter9 extends FragmentStatePagerAdapter {

    public ViewPagerAdapter9(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter9(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s1));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s1));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==1)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s2));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s2));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==2)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s3));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s3));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==3)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s4));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s4));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==4)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s5));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s5));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==5)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s6));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s6));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==6)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s7));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s7));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==7)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s8));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s8));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==8)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s9));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s9));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==9)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s10));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s10));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==10)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s11));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s11));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==11)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s12));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s12));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==12)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s13));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s13));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==13)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s14));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s14));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==14)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s15));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s15));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==15)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s16));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s16));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==16)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s17));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s17));
            fragment9.setArguments(bundle);
            return fragment9;
        }else if(position==17)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s18));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s18));
            fragment9.setArguments(bundle);
            return fragment9;
        }else if(position==18)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s19));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s19));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==19)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s20));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s20));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==20)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s21));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s21));
            fragment9.setArguments(bundle);
            return fragment9;
        }else if(position==21)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s22));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s22));
            fragment9.setArguments(bundle);
            return fragment9;
        }else if(position==22)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s23));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s23));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==23)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s24));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s24));
            fragment9.setArguments(bundle);
            return fragment9;
        }else if(position==24)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s25));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s25));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==25)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s26));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s26));
            fragment9.setArguments(bundle);
            return fragment9;
        }

        else if(position==26)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s27));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s27));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==27)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s28));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s28));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==28)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s29));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s29));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==29)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s30));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s30));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==30)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s31));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s31));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==31)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s32));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s32));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==32)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s33));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s33));
            fragment9.setArguments(bundle);
            return fragment9;
        }
        else if(position==33)
        {
            Fragment9 fragment9 =new Fragment9();
            Bundle bundle =new Bundle();
            bundle.putString("sanskrit9", Adhyay9_AC9.getAdhyay9Resources().getString(R.string.sanskrit_c9s34));
            bundle.putString("bhavarth9",Adhyay9_AC9.getAdhyay9Resources().getString(R.string.bhavarth_c9s34));
            fragment9.setArguments(bundle);
            return fragment9;
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
