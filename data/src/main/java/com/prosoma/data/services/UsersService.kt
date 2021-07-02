package com.prosoma.data.services

import com.prosoma.data.networking.models.UserApiModel

interface UsersService {

    suspend fun getUsers(): List<UserApiModel>

    interface Api : UsersService {
    }

    interface Cache : UsersService {
    }
}