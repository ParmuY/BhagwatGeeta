package com.parmu.bhagwatgeeta.pageradapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.parmu.bhagwatgeeta.R;
import com.parmu.bhagwatgeeta.activities.Adhyay12_AC12;
import com.parmu.bhagwatgeeta.fragments.Fragment12;

public class ViewPagerAdapter12 extends FragmentStatePagerAdapter {
    public ViewPagerAdapter12(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter12(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s1));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s1));
            fragment12.setArguments(bundle);
            return fragment12;
        }

        else if(position==1)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s2));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s2));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==2)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s3_4));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s3_4));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==3)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s5));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s5));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==4)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s6));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s6));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==5)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s7));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s7));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==6)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s8));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s8));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==7)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s9));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s9));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==8)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s10));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s10));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==9)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s11));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s11));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==10)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s12));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s12));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==11)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s13_14));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s13_14));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==12)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s15));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s15));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==13)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s16));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s16));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==14)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s17));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s17));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==15)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s18));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s18));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==16)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s19));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s19));
            fragment12.setArguments(bundle);
            return fragment12;
        }
        else if(position==17)
        {
            Fragment12 fragment12 =new Fragment12();
            Bundle bundle = new Bundle();
            bundle.putString("sanskrit12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.sanskrit_c12s20));
            bundle.putString("bhavarth12", Adhyay12_AC12.getAdhyay12Resources().getString(R.string.bhavarth_c12s20));
            fragment12.setArguments(bundle);
            return fragment12;
        }


        return null;
    }

    @Override
    public int getCount() {
        return 18;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position=position+1;
        if(position<=2)
        {
            return "श्लोक "+position;
        }
        else if(position==3)
        {
            return  "श्लोक 3,4";
        }
        else if(position<=11&&position>=4)
        {
            position=position+1;
            return "श्लोक "+position;
        }
        else if(position==12)
        {
            return "श्लोक 13,14";
        }
        else if(position<=18&&position>=13)
        {
            position=position+2;
            return "श्लोक "+position;
        }
        return null;

    }
}
