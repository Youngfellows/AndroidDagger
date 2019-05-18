package com.speex.androiddagger.di.components;


import com.speex.androiddagger.activity.SecondActivity;
import com.speex.androiddagger.di.modules.UserModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * 第二种依赖注入方式
 * 第2步: a.注入对象的接口
 * b.可以注入UserModule类提供的对象
 * c.在SecondActivity中注入UserModule.class提供的Login对象
 * <p>
 * 注意：这里UserComponent2使用@Subcomponent注解是为了使用AppComponent中的AndroidSupportInjectionModule.
 *
 * 我们声明Subcomponent,其关联的module可以提供MainActivity所需要的所有依赖的实例。
 */

@Subcomponent(modules = {UserModule.class})
public interface UserComponent extends AndroidInjector<SecondActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SecondActivity> {

    }
}
