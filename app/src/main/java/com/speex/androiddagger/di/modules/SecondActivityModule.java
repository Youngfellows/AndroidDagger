package com.speex.androiddagger.di.modules;

import android.app.Activity;

import com.speex.androiddagger.di.components.SecondActivitySubcomponent;
import com.speex.androiddagger.mvp.activity.SecondActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * 第三步: 声明SecondActivityModule，其关联SecondActivitySubcomponent和SecondActivity
 */
@Module(subcomponents = SecondActivitySubcomponent.class)
public abstract class SecondActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(SecondActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindSecondActivityInjectorFactory(SecondActivitySubcomponent.Builder builder);

}
