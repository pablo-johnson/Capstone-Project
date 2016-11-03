package com.johnson.pablo.sharebook.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.johnson.pablo.sharebook.ui.favorites.FavoritesFragment;
import com.johnson.pablo.sharebook.ui.home.HomeFragment;
import com.johnson.pablo.sharebook.ui.library.MyLibraryFragment;

/**
 * Created by pjohnson on 24/10/2016.
 */
public class HomeViewPagerAdapter extends FragmentPagerAdapter {

    public HomeViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return HomeFragment.newInstance();
            case 1:
                return MyLibraryFragment.newInstance();
            case 2:
                return FavoritesFragment.newInstance();
            default:
                Log.e("ShareBook", "No fragment selected");
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Home";
            case 1:
                return "My Library";
            case 2:
                return "Favorites";
        }
        return null;
    }
}
