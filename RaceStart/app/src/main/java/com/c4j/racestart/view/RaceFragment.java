package com.c4j.racestart.view;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.c4j.racestart.R;
import com.c4j.racestart.presenter.RaceFragmentPresenterCompl;
import com.c4j.racestart.presenter.presenterInterface.IRaceFragmentPresenter;
import com.c4j.racestart.view.viewInterface.IRaceFragmentView;

public class RaceFragment extends Fragment implements IRaceFragmentView  {

    private IRaceFragmentPresenter mRraceFragmentPresenter;
    private Activity mActivity;
    private View mView;

    public RaceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_race, container, false);
        mActivity = getActivity();
        mRraceFragmentPresenter = new RaceFragmentPresenterCompl();


        return mView;
    }



}
