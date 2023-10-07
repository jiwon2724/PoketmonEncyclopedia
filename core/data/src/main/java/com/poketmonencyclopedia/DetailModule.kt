package com.poketmonencyclopedia

import com.poketmonencyclopedia.detail.PoketmonDetailApi
import com.poketmonencyclopedia.detail.PoketmonDetailRepositoryImpl
import com.poketmonencyclopedia.domain.detail.PoketmonDetailRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
@InstallIn(SingletonComponent::class)
object DetailModule {
    @Singleton
    @Provides
    fun providePoketmonApi(retrofit: Retrofit): PoketmonDetailApi {
        return retrofit.create(PoketmonDetailApi::class.java)
    }

    @Singleton
    @Provides
    fun provideDetailRepository(poketmonDetailApi: PoketmonDetailApi): PoketmonDetailRepository {
        return PoketmonDetailRepositoryImpl(poketmonDetailApi)
    }
}