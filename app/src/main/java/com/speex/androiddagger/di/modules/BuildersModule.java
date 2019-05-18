package com.speex.androiddagger.di.modules;


import android.app.Activity;

import com.speex.androiddagger.activity.SecondActivity;
import com.speex.androiddagger.di.components.UserComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * 第二种依赖注入方式
 * 第3步: BuildersModule是我为了统一管理依赖于AppComponent的Module添加的中间件
 */

@Module(subcomponents = {UserComponent.class})
public abstract class BuildersModule {

    @Binds//注入的是UserComponent2接口
    @IntoMap
    @ActivityKey(SecondActivity.class)//注入对象Login到SecondActivity
    abstract AndroidInjector.Factory<? extends Activity> bindSecondActivityInjectorFactory(UserComponent.Builder builder);
}
