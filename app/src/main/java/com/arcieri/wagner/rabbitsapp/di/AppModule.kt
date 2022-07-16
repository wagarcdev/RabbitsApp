package com.arcieri.wagner.rabbitsapp.di

import com.arcieri.wagner.rabbitsapp.data.RabbitsAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesRabbitsApi(): RabbitsAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(RabbitsAPI.BASE_URL)
            .build()
            .create(RabbitsAPI::class.java)
    }

}