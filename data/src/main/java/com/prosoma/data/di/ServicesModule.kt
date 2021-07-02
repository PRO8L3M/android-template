package com.prosoma.data.di

import com.prosoma.data.services.UsersService
import com.prosoma.data.services.api.UsersApiService
import dagger.Binds
import dagger.Module

@Module
internal interface ServicesModule {

    @Binds
    fun bindUsersApiService(service: UsersApiService): UsersService.Api
}