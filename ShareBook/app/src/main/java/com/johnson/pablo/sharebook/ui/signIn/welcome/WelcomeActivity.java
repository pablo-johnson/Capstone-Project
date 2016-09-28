package com.johnson.pablo.sharebook.ui.signIn.welcome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import com.johnson.pablo.sharebook.R;
import com.johnson.pablo.sharebook.ui.common.ShareBookActivity;
import com.johnson.pablo.sharebook.ui.signIn.signIn.SignInFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WelcomeActivity extends ShareBookActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);

        if (savedInstanceState == null) {
            replaceFragment(R.id.signUpContainer, WelcomeFragment.newInstance(), false);
        }

    }


}
