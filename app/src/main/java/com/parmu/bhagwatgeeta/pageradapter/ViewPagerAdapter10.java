package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay10_AC10;
import com.parmu.bhagwatgeeta.fragments.Fragment10;

public class ViewPagerAdapter10 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter10(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter10(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s1));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s1));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==1)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s2));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s2));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==2)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s3));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s3));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==3)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s4_5));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s4_5));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==4)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s6));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s6));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==5)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s7));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s7));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==6)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s8));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s8));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==7)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s9));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s9));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==8)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s10));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s10));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==9)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s11));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s11));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==10)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s12_13));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s12_13));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==11)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s14));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s14));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==12)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s15));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s15));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==13)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s16));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s16));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==14)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s17));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s17));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==15)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s18));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s18));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==16)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s19));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s19));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==17)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s20));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s20));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==18)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s21));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s21));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==19)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s22));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s22));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==20)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s23));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s23));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==21)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s24));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s24));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==22)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s25));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s25));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==23)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s26));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s26));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==24)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s27));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s27));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==25)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s28));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s28));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==26)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s29));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s29));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==27)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s30));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s30));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==28)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s31));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s31));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==29)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s32));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s32));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==30)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s33));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s33));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==31)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s34));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s34));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==32)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s35));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s35));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==33)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s36));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s36));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==34)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s37));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s37));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==35)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s38));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s38));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==36)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s39));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s39));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==37)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s40));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s40));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==38)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s41));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s41));
            fragment10.setArguments(bundle);
            return fragment10;
        }
        else if(position==39)
        {
            Fragment10 fragment10 =new Fragment10();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.sanskrit_c10s42));
            bundle.putString("bhavarth10", Adhyay10_AC10.getAdhyay10Resources().getString(R.string.bhavarth_c10s42));
            fragment10.setArguments(bundle);
            return fragment10;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 40;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position = position + 1;
        if (position <= 3) {
            return "श्लोक " + position;
        } else if (position == 4) {
            return "श्लोक 4,5";
        } else if (position <= 10 && position >= 5) {
            position = position + 1;
            return "श्लोक " + position;
        } 
        else if(position==11){
            return "श्लोक 12,13";
        }
        else if (position <= 40 && position >= 11) {
            position = position + 2;
            return "श्लोक " + position;
        }
        return null;
    }
}
