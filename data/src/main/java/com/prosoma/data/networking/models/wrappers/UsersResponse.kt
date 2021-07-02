package com.prosoma.data.networking.models.wrappers

import com.prosoma.data.networking.models.UserApiModel

data class UsersResponse(
    val results: List<UserApiModel>
)