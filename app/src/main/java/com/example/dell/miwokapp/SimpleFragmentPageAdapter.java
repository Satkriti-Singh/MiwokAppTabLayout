package com.example.dell.miwokapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 28-05-2018.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter{

    private final List<Fragment> FragmentList = new ArrayList<>();
    private final List<String> FragmentListTitles = new ArrayList<>();
    private String tabTitles[] = new String[] { "Numbers", "Family Members", "Colors", "Phrases" };
    private Context context;

    public SimpleFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentList.get(position);
       /* if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyMembersFragment();
        }  else if (position == 2){
            return new ColorsFragment();
        }
        else {
            return new PhrasesFragment();
        }*/
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return FragmentListTitles.get(position);
    }

    public void AddFragment(Fragment fragment,String Title){
        FragmentList.add(fragment);
        FragmentListTitles.add(Title);

    }
}
