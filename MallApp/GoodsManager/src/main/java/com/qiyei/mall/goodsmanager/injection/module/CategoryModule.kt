package com.qiyei.mall.goodsmanager.injection.module

import com.qiyei.mall.goodsmanager.service.ICategoryService
import com.qiyei.mall.goodsmanager.service.impl.CategoryServiceImpl
import dagger.Module
import dagger.Provides

/**
 * @author Created by qiyei2015 on 2018/10/6.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */
@Module
class CategoryModule {

    @Provides
    fun providerCategoryService(service: CategoryServiceImpl): ICategoryService {
        return service
    }
}