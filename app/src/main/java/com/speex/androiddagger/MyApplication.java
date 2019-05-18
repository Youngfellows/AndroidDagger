package com.speex.androiddagger;

import android.app.Activity;

import com.speex.androiddagger.di.components.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerApplication;


/**
 * 第二种依赖注入方式
 * 第4步: 接下来,使你的application实现HasActivityInjector接口,然后使用@Inject注入DispatchingAndroidInjector<Activity>来作为activityInjector()方法的返回值:
 */
public class MyApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
