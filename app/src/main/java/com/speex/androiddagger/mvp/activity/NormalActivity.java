package com.speex.androiddagger.mvp.activity;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.speex.androiddagger.R;
import com.speex.androiddagger.bean.Student;
import com.speex.androiddagger.mvp.contract.NormalContract;
import com.speex.androiddagger.mvp.presenter.NormalPresenter;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;

public class NormalActivity extends AppCompatActivity {
    private String TAG = this.getClass().getSimpleName();

    /**
     * 需要依赖注入的对象
     */
    @Inject
    String mClassName;//类名

    @Inject
    SharedPreferences mSp;//SP

    @Inject
    NormalPresenter mNormalPresenter;//Presenter

    @Inject
    Student mStu1;


    private TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_normal);

        mTvResult = findViewById(R.id.tv_result);

        //初始化设置
        mTvResult.setText(mStu1.getName() + "," + mStu1.getAge() + "岁 ," + mStu1.getScore() + "分");
    }


    /**
     * 网络请求
     *
     * @param view
     */
    public void onHttpRequest(View view) {
        mNormalPresenter.httpRequest();
    }

    /**
     * 显示View
     *
     * @param message
     */
    public void showMessage(String message) {
        mTvResult.setText(message);
    }
}
