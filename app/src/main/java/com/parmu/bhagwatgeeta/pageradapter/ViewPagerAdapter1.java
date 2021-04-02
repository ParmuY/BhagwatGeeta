package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay1_AC1;
import com.parmu.bhagwatgeeta.fragments.Fragment1;

public class ViewPagerAdapter1 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter1(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s1));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s1));
            fragment1.setArguments(bundle);
            return fragment1;

        }

        else if (position==1)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s2));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s2));
            fragment1.setArguments(bundle);
            return fragment1;

        }

        else if (position==2)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s3));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s3));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==3)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s4_5_6));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s4_5_6));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==4)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s7));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s7));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==5)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s8));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s8));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==6)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s9));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s9));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==7)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s10));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s10));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==8)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s11));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s11));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==9)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s12));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s12));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==10)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s13));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s13));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==11)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s14));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s14));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==12)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s15));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s15));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==13)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s16));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s16));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==14)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s17_18));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s17_18));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==15)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s19));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s19));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==16)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s20_21));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s20_21));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==17)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s22));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s22));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==18)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s23));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s23));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==19)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s24_25));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s24_25));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==20)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s26));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s26));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==21)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s27));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s27));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==22)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s28_29));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s28_29));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==23)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s30));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s30));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==24)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s31));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s31));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==25)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s32));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s32));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==26)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s33));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s33));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==27)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s34));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s34));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==28)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s35));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s35));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==29)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s36));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s36));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==30)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s37));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s37));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==31)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s38_39));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s38_39));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==32)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s40));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s40));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==33)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s41));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s41));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==34)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s42));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s42));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==35)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s43));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s43));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==36)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s44));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s44));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==37)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s45));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s45));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==38)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s46));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s46));
            fragment1.setArguments(bundle);
            return fragment1;
        }
        else if (position==39)
        {
            Fragment1 fragment1 =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.sanskrit_c1s47));
            bundle.putString("bhavarth1", Adhyay1_AC1.getAdhyay1Resources().getString(R.string.bhavarth_c1s47));
            fragment1.setArguments(bundle);
            return fragment1;
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
        position=position+1;
        if(position<=3)
        {
            return "श्लोक "+position;
        }
        else if(position==4)
        {
            return "श्लोक 4,5,6";
        }
        else if(position>=5&&position<=14)
        {
            position=position+2;
            return "श्लोक "+position;
        }
        else if(position==15)
        {
            return "श्लोक 17,18";
        }
        else if(position==16)
        {
            return "श्लोक 19";
        }
        else if(position==17)
        {
            return "श्लोक 20,21";
        }
        else if(position==18)
        {
            return "श्लोक 22";
        }
        else if (position==19)
        {
            return "श्लोक 23";
        }
        else if(position==20)
        {
            return "श्लोक 24,25";
        }
        else if(position==21)
        {
            return "श्लोक 26";
        }
        else if(position==22)
        {
            return "श्लोक 27";
        }
        else if(position==23)
        {
            return "श्लोक 28,29";
        }
        else if(position>=24&&position<=31)
        {
            position = position+6;
            return "श्लोक "+position;
        }
        else if(position==32)
        {
            return "श्लोक 38,39";
        }
        else if(position>=33&&position<=40)
        {
            position=position+7;
            return "श्लोक "+position;
        }
        return null;
    }


}
