package com.prosoma.domain.repositories

import com.prosoma.domain.models.User

interface UsersRepository {

    suspend fun getUsers(): List<User>
}