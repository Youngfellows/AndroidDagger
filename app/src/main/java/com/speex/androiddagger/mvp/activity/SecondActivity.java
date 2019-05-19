package com.speex.androiddagger.mvp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.speex.androiddagger.R;
import com.speex.androiddagger.base.BaseActivity;


public class SecondActivity extends BaseActivity {
    private String TAG = this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
