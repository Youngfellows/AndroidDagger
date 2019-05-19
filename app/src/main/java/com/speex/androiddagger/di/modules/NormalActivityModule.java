package com.speex.androiddagger.di.modules;

import android.app.Activity;

import com.speex.androiddagger.di.components.NormalActivitySubcomponent;
import com.speex.androiddagger.mvp.activity.NormalActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * 第三步: 声明NormalActivityModule，其关联NormalActivitySubcomponent和NormalActivity
 */
@Module(subcomponents = NormalActivitySubcomponent.class)
public abstract class NormalActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(NormalActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindNormalActivityInjectorFactory(NormalActivitySubcomponent.Builder builder);

}
