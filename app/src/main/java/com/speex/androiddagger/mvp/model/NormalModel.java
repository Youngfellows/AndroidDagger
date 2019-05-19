package com.speex.androiddagger.mvp.model;

import com.speex.androiddagger.mvp.contract.NormalContract;

import javax.inject.Inject;

/**
 * 1.提供对象的Model
 * 2.Model可以执行具体的任务(比如网络请求呀)
 */
public class NormalModel implements NormalContract.Model {

    //可以注入构造函数
    @Inject
    public NormalModel() {

    }

    /**
     * 模拟发送网络请求
     *
     * @return
     */
    public String requestHttpForServer() {
        // TODO: 2019/5/19 做网络请求
        return "这是NormalModel请求服务器后返回的Message";
    }
}
