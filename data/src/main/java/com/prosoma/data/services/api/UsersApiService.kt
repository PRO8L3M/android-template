package com.prosoma.data.services.api

import com.prosoma.data.networking.endpoints.UsersEndpoint
import com.prosoma.data.networking.models.UserApiModel
import com.prosoma.data.services.UsersService
import com.prosoma.data.services.base.ApiService
import javax.inject.Inject

class UsersApiService @Inject constructor(
    private val endpoint: UsersEndpoint
) : ApiService(), UsersService.Api {

    override suspend fun getUsers(): List<UserApiModel> = request { endpoint.getUsers() }.results
}