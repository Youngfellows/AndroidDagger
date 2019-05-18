package com.speex.androiddagger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.speex.androiddagger.activity.NormalActivity;

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

}
