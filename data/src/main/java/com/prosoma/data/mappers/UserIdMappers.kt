package com.prosoma.data.mappers

import com.prosoma.data.networking.models.UserIdApiModel
import com.prosoma.domain.models.UserId

fun UserIdApiModel.toDomain() = UserId(
    name as String,
    value
)