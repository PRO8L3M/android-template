package com.prosoma.data.di

import com.prosoma.data.networking.endpoints.UsersEndpoint
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
object EndpointsModule {

    @Provides
    fun getUserEndpoint(retrofit: Retrofit): UsersEndpoint {
        return retrofit.create(UsersEndpoint::class.java)
    }
}