package com.c4j.racestart.presenter;

import android.app.Activity;

import com.c4j.racestart.presenter.presenterInterface.ICarsFragmentPresenter;
import com.c4j.racestart.view.viewInterface.ICarsFragmentView;

public class CarsFragmentPresenterCompl implements ICarsFragmentPresenter {

    private final String Tag = "CarsFragmentCompl";
    private ICarsFragmentView mView;
    private Activity mActivity;

}
