package com.speex.androiddagger.mvp.presenter;

import com.speex.androiddagger.mvp.activity.NormalActivity;
import com.speex.androiddagger.mvp.contract.NormalContract;
import com.speex.androiddagger.mvp.model.NormalModel;

import javax.inject.Inject;


/**
 * Presenter持有View和Model的引用，连接View和Model的桥梁
 */
public class NormalPresenter implements NormalContract.Presenter {

    /**
     * View对象
     */
    private NormalActivity mNormalActivity;

    /**
     * Model对象
     */
    private NormalModel mNormalModel;

    @Inject
    public NormalPresenter(NormalActivity normalActivity, NormalModel normalModel) {
        mNormalActivity = normalActivity;
        mNormalModel = normalModel;
    }

    /**
     * 发起网络请求
     */
    public void httpRequest() {
        //发起网络请求
        String message = mNormalModel.requestHttpForServer();

        //显示View
        mNormalActivity.showMessage(message);
    }
}
