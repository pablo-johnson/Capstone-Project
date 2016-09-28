package com.johnson.pablo.sharebook.ui.signIn.welcome;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import com.johnson.pablo.sharebook.R;
import com.johnson.pablo.sharebook.adapters.WelcomeViewPagerAdapter;
import com.johnson.pablo.sharebook.ui.common.ShareBookActivity;
import com.johnson.pablo.sharebook.ui.signIn.signIn.SignInFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author Pablo Johnson (pablo.88j@gmail.com)
 */
public class WelcomeActivity extends ShareBookActivity {

    @BindView(R.id.welcomeViewPager)
    ViewPager welcomeViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
        welcomeViewPager.setAdapter(new WelcomeViewPagerAdapter(this, getResources().obtainTypedArray(R.array.portraits)));

        if (savedInstanceState == null) {
            replaceFragment(R.id.signUpContainer, WelcomeFragment.newInstance(), false);
        }

    }


}
