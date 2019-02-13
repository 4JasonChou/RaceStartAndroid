package com.c4j.racestart.view;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.c4j.racestart.R;
import com.c4j.racestart.view.viewInterface.ILoginPageView;

public class LoginPageActivity extends AppCompatActivity implements ILoginPageView {

    private String Tag = "Activity_LoginPage";
    private View mView;
    private Activity mActivity;

    private EditText mEditAcc;
    private EditText mEditPwd;
    private Button mButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        getSupportActionBar().hide();

        mActivity = this;
        mView = this.findViewById(android.R.id.content);

        initView();
        initEvent();

    }

    private void initView()
    {
        mButtonLogin = mView.findViewById(R.id.login_page_login);
        mEditAcc = mView.findViewById(R.id.login_page_edit_acc);
        mEditPwd = mView.findViewById(R.id.login_page_edit_pwd);
    }

    private void initEvent()
    {
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnLoginSuccess();
            }
        });
    }

    public void OnLoginSuccess() {

        Intent mainPageIntent = new Intent(LoginPageActivity.this,MainActivity.class);
        startActivity(mainPageIntent);
        /*
        Intent loginSys = new Intent(Activity_LoginPage.this,Activity_MainPage.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("AuthsData",value);
        loginSys.putExtras(bundle);
        startActivityForResult(loginSys,Config.PassUserAuths);
        */
    }
}
