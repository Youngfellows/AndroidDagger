package com.speex.androiddagger.mvp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.speex.androiddagger.R;
import com.speex.androiddagger.base.BaseActivity;
import com.speex.androiddagger.bean.Student;

import javax.inject.Inject;


public class SecondActivity extends BaseActivity {
    private String TAG = this.getClass().getSimpleName();

    @Inject
    Student mStudent;//需要依赖注入的对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvResult = findViewById(R.id.tv);
        //初始化设置
        tvResult.setText(mStudent.getName() + "," + mStudent.getAge() + "岁 ," + mStudent.getScore() + "分");
    }
}
