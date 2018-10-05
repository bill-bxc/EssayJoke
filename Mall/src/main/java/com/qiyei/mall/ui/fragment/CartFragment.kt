package com.qiyei.mall.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qiyei.framework.ui.fragment.BaseMVPFragment

import com.qiyei.mall.R
import com.qiyei.mall.injection.component.DaggerMallComponent
import com.qiyei.mall.mvp.presenter.CartFragmentPresenter
import com.qiyei.mall.mvp.view.ICartFragmentView


/**
 * @author Created by qiyei2015 on 2018/10/5.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */
class CartFragment : BaseMVPFragment<CartFragmentPresenter>(),ICartFragmentView {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    override fun onStart() {
        super.onStart()
        mPresenter.getString()
    }

    /**
     * 依赖注入
     */
    override fun initComponentInject() {
        DaggerMallComponent.builder()
                .activityComponent(mActivityComponent)
                .build()
                .inject(this)
        mPresenter.mView = this
    }

    override fun getTAG(): String {
        return CartFragment::class.java.simpleName
    }
}