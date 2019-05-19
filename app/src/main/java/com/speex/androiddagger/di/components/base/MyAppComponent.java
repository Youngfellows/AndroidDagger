package com.speex.androiddagger.di.components.base;

import com.speex.androiddagger.base.MyApplication;
import com.speex.androiddagger.di.modules.NormalActivityModule;

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
        NormalActivityModule.class
})
public interface MyAppComponent {
    void inject(MyApplication application);
}
