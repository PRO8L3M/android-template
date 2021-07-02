package com.prosoma.data.di

import com.prosoma.data.repositories.DefaultUsersRepository
import com.prosoma.domain.repositories.UsersRepository
import dagger.Binds
import dagger.Module

@Module
internal interface RepositoriesModule {

    @Binds
    fun bindUserRepository(repository: DefaultUsersRepository): UsersRepository
}