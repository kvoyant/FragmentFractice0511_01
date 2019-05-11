package com.tjeit.fragmentfractice0511_01.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tjeit.fragmentfractice0511_01.fragments.FragmentOne;
import com.tjeit.fragmentfractice0511_01.fragments.FragmentThree;
import com.tjeit.fragmentfractice0511_01.fragments.FragmentTwo;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        mNumOfTabs = numOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        Fragment fr = null;

        if (position == 0) {
            FragmentOne frag1 = new FragmentOne();
            fr = frag1;
        }
        else if (position == 1) {
            FragmentTwo frag2 = new FragmentTwo();
            fr = frag2;
        }
        else if (position == 2) {
            FragmentThree frag3 = new FragmentThree();
            fr = frag3;
        }

        return fr;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
