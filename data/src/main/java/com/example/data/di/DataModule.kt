package com.example.data.di

import com.example.data.api.Api
import com.example.data.repository.CoinRepositoryImpl
import com.example.domain.common.Constants.BASE_URL
import com.example.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    @Singleton
    fun providePaprikaApi(): Api {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: Api): CoinRepository {
        return CoinRepositoryImpl(api)
    }
}