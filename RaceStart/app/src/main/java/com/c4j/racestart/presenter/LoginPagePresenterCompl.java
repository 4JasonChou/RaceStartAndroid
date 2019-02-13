package com.c4j.racestart.presenter;

import android.app.Activity;

import com.c4j.racestart.presenter.presenterInterface.ILoginPagePresenter;
import com.c4j.racestart.view.viewInterface.ILoginPageView;

public class LoginPagePresenterCompl implements ILoginPagePresenter {

    private final String Tag = "LoginPageCompl";
    private ILoginPageView mContentView;
    private Activity mActivity;

    public LoginPagePresenterCompl(ILoginPageView contentView, Activity activity) {
        mContentView = contentView;
        mActivity = activity;
    }

    public void DoLogin(String account,String password) {

    }
}
