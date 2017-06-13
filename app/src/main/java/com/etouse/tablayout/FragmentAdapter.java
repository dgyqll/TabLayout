package com.etouse.tablayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> mShowDatas;
    private List<String> mTitles;


    public FragmentAdapter(FragmentManager fm, List<Fragment> mShowDatas, List<String> mTitles) {
        super(fm);
        this.mShowDatas = mShowDatas;
        this.mTitles = mTitles;
    }

    @Override
    public Fragment getItem(int position) {
        return mShowDatas.get(position);
    }

    @Override
    public int getCount() {
        return mShowDatas.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
