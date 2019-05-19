package com.speex.androiddagger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.speex.androiddagger.mvp.activity.NormalActivity;
import com.speex.androiddagger.mvp.activity.SecondActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 普通方式使用Dagger2
     *
     * @param view
     */
    public void normalDaggerUse(View view) {
        Intent intent = new Intent(this, NormalActivity.class);
        startActivity(intent);
    }

    /**
     * AndroidInjection方式使用Dagger2
     *
     * @param view
     */
    public void androidInjectionUse(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
