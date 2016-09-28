package com.johnson.pablo.sharebook.ui.signIn.welcome;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.johnson.pablo.sharebook.R;
import com.johnson.pablo.sharebook.ui.common.ShareBookFragment;
import com.johnson.pablo.sharebook.ui.signIn.signIn.SignInFragment;
import com.johnson.pablo.sharebook.ui.signIn.signUp.SignUpFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class WelcomeFragment extends ShareBookFragment {

    @OnClick(R.id.signInButton)
    public void onSignInClick() {
        fragmentListener.replaceFragment(R.id.signUpContainer, SignInFragment.newInstance(), true);
    }

    @OnClick(R.id.signUpButton)
    public void onSignUpClick() {
        fragmentListener.replaceFragment(R.id.signUpContainer, SignUpFragment.newInstance(), true);
    }

    @BindView(R.id.signUpButton)
    Button signUpButton;

    public WelcomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    public static Fragment newInstance() {
        return new WelcomeFragment();
    }
}
