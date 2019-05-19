package com.speex.androiddagger.di.modules;

import com.speex.androiddagger.bean.Student;

import dagger.Module;
import dagger.Provides;

/**
 * 第一步: 声明提供对象的Module
 */
@Module//提供依赖注入的对象
public class SecondModule {

    @Provides//提供Student对象
    public Student provideStudent() {
        return new Student("梅梅", 34, 76.5f);
    }
}
