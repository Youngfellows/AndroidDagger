package com.speex.androiddagger.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.speex.androiddagger.R;

public class NormalActivity extends AppCompatActivity {
    private String TAG = this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

    }
}
