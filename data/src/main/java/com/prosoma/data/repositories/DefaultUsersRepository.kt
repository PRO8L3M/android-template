package com.prosoma.data.repositories

import com.prosoma.data.mappers.toDomain
import com.prosoma.data.services.UsersService
import com.prosoma.domain.models.User
import com.prosoma.domain.repositories.UsersRepository
import javax.inject.Inject

class DefaultUsersRepository @Inject constructor(
    private val usersApiService: UsersService.Api
) : UsersRepository {

    override suspend fun getUsers(): List<User> = usersApiService.getUsers().map { it.toDomain() }
}