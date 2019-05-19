package com.speex.androiddagger.di.components.base;

import com.speex.androiddagger.base.MyApplication;
import com.speex.androiddagger.di.modules.NormalActivityModule;
import com.speex.androiddagger.di.modules.SecondActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author Administrator
 * @version $Rev$
 * @time 2019/5/19 9:52
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        //依赖注入NormalActivityModule
        NormalActivityModule.class,

        //依赖注入SecondActivityModule
        SecondActivityModule.class

})
public interface MyAppComponent {
    void inject(MyApplication application);
}
