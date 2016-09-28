package com.johnson.pablo.sharebook.ui.signIn.signIn;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.johnson.pablo.sharebook.R;
import com.johnson.pablo.sharebook.ui.common.ShareBookFragment;

import butterknife.ButterKnife;

/**
 * @author Pablo Johnson (pablo.88j@gmail.com)
 */
public class SignInFragment extends ShareBookFragment {

    public SignInFragment() {
        // Required empty public constructor
    }

    public static SignInFragment newInstance() {
        SignInFragment fragment = new SignInFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_in, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

}
