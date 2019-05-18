package com.speex.androiddagger.di.modules;


import com.speex.androiddagger.bean.Login;

import dagger.Module;
import dagger.Provides;

/**
 * 1.提供对象
 */
@Module
public class UserModule {

    @Provides
    Login provideXiaoMingUser() {
        return new Login("小明", "123456");
    }
}
