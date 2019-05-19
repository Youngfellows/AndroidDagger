package com.speex.androiddagger.di.components;


import com.speex.androiddagger.di.modules.SecondModule;
import com.speex.androiddagger.mvp.activity.SecondActivity;

import dagger.Component;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * 第二步骤:
 * 声明Subcomponent接口，其关联的Module可以提供SecondActivity所需对象的实例
 */
@Subcomponent(modules = {
        AndroidInjectionModule.class,
        SecondModule.class
})
public interface SecondActivitySubcomponent extends AndroidInjector<SecondActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SecondActivity> {

    }

}
