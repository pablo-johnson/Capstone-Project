package com.johnson.pablo.sharebook.ui.signIn.signUp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.johnson.pablo.sharebook.R;
import com.johnson.pablo.sharebook.ui.common.ShareBookFragment;

/**
 * @author Pablo Johnson (pablo.88j@gmail.com)
 *         Register
 */
public class SignUpFragment extends ShareBookFragment {

    public SignUpFragment() {
        // Required empty public constructor
    }

    public static SignUpFragment newInstance() {
        SignUpFragment fragment = new SignUpFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

}
