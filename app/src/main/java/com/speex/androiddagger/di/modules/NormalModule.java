package com.speex.androiddagger.di.modules;

import android.content.Context;
import android.content.SharedPreferences;

import com.speex.androiddagger.bean.Student;
import com.speex.androiddagger.mvp.activity.NormalActivity;
import com.speex.androiddagger.mvp.model.NormalModel;
import com.speex.androiddagger.mvp.presenter.NormalPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * 第一步创建Moudle,该Module可以提供如下对象的实例
 */
@Module
public class NormalModule {

    @Provides
    public String proviteClassName() {
        return NormalActivity.class.getSimpleName();
    }

    @Provides
    public SharedPreferences provideSp(NormalActivity activity) {
        return activity.getSharedPreferences("def_test", Context.MODE_PRIVATE);
    }

    @Provides
    public NormalPresenter provideNormalPresenter(NormalActivity normalActivity, NormalModel normalModel) {
        return new NormalPresenter(normalActivity, normalModel);
    }

    /**
     * 提供对象张三
     *f
     * @return
     */
    @Provides
    public Student provideStudent() {
        return new Student("张三", 22, 88.5f);
    }

}
