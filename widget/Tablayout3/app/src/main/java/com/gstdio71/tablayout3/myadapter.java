package com.gstdio71.tablayout3;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class myadapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public myadapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Football footballFragment = new Football();
                return footballFragment;
            case 1:
                Cricket cricketFragment = new Cricket();
                return cricketFragment;
            case 2:
                NBA nbaFragment = new NBA();
                return nbaFragment;
            case 3:
                Badminton badFragment = new Badminton();
                return badFragment;

            case 4:
                Hocky hockyFragment = new Hocky();
                return hockyFragment;

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}