package com.c4j.racestart.view;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.c4j.racestart.R;

public class MainActivity extends AppCompatActivity {

    private Fragment mMainFragment;
    private BottomNavigationView mUnderBar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_cars:
                    setFragment( new CarsFragment() );
                    return true;
                case R.id.navigation_race:
                    setFragment( new RaceFragment() );
                    return true;
                case R.id.navigation_other:
                    // TODO
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();

        // init First Page of Fragment.
        setFragment( new CarsFragment() ) ;

    }


    private void initView() {
        mUnderBar = (BottomNavigationView) findViewById(R.id.navigation);
    }

    private void initEvent() {
        mUnderBar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void setFragment(Fragment fragment) {
        // 利用 FragmentManager 去改變  R.id.content_frame 這個Fragment , 此Fragment 在 Content_main (內文主頁)
        //有一個佔據整個畫面的Fragment元件 < FrameLayout > 叫做 content_frame
        if (fragment!=null) {
            if( mMainFragment != null && mMainFragment.getClass().toString().equals( fragment.getClass().toString() ) ){ /**/ }
            else
            {
                mMainFragment = fragment;
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_fragment , fragment ).commit();
            }
        }
        /*
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        */
    }

}
