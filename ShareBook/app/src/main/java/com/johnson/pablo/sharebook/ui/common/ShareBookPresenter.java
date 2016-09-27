package com.johnson.pablo.sharebook.ui.common;

/**
 * @author Pablo Johnsonn (pablo.88j@gmail.com)
 */
public abstract class ShareBookPresenter<T extends ShareBookView> {

    protected T view;

    protected ShareBookPresenter(T view) {
        this.view = view;
    }

    protected String getString(int resId) {
        return view.getContext().getString(resId);
    }

    protected void showError(int resId) {
        showError(getString(resId));
    }

    protected void showError(String message) {
        view.showError(message);
    }
}
