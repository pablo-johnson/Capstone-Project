package com.johnson.pablo.sharebook.ui.common;

import android.content.Context;

/**
 * @author Pablo Johnson (pablo.88j@gmail.com)
 */
public interface ShareBookView {

    void showProgressDialog();
    void showProgressDialog(String message);
    void dismissProgressDialog();
    void setTitle(String title);
    void showError(String message);
    Context getContext();
}
