package com.speex.androiddagger.di.components;


import com.speex.androiddagger.MyApplication;
import com.speex.androiddagger.di.modules.BuildersModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * 第二种依赖注入方式
 * 第1步: 在AppComponent中统一注入AndroidSupportInjectionModule
 * 其实AppComponent就是AndroidInjector，在Application中注入
 */

@Component(modules = {
        AndroidSupportInjectionModule.class,
        BuildersModule.class
})
public interface AppComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication> {

    }
}
