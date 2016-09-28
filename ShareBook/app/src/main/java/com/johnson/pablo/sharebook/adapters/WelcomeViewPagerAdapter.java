package com.johnson.pablo.sharebook.adapters;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.johnson.pablo.sharebook.R;

/**
 * @author Pablo Johnson (pablo.88j@gmail.com)
 */
public class WelcomeViewPagerAdapter extends PagerAdapter {

    private final TypedArray mArray;
    private final Context mContext;
    private final LayoutInflater mLayoutInflater;

    public WelcomeViewPagerAdapter(Context context, TypedArray array) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mArray = array;
    }

    @Override
    public int getCount() {
        return mArray.length();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((View) object);

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = (ImageView) mLayoutInflater.inflate(R.layout.welcome_pager_item, container, false);

        imageView.setImageResource(mArray.getResourceId(position, -1));

        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
