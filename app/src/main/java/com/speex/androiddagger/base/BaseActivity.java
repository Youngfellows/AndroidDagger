package com.speex.androiddagger.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;


/**
 * 提供统一的依赖注入
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //2.Activity级的依赖注入
        AndroidInjection.inject(this);//依赖注入
        super.onCreate(savedInstanceState);
    }
}
