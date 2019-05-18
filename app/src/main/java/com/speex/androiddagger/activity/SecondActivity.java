package com.speex.androiddagger.activity;

import android.os.Bundle;
import android.util.Log;

import com.speex.androiddagger.R;
import com.speex.androiddagger.bean.Login;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerAppCompatActivity;


public class SecondActivity extends DaggerAppCompatActivity {
    private String TAG = this.getClass().getSimpleName();
    @Inject
    Login mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i(TAG, "Name: " + mLogin.getName() + " ,psw: " + mLogin.getPassword());
    }
}
