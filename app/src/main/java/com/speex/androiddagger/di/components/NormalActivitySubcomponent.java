package com.speex.androiddagger.di.components;

import com.speex.androiddagger.di.modules.NormalModule;
import com.speex.androiddagger.mvp.activity.NormalActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * 第二步,申明Subcomponent接口，其关联的Module可以向NormalActivity，提供所依赖对象的实例
 */
@Subcomponent(modules = {
        AndroidInjectionModule.class,
        NormalModule.class})
public interface NormalActivitySubcomponent extends AndroidInjector<NormalActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<NormalActivity> {

    }
}
