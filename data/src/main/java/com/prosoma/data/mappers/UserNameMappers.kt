package com.prosoma.data.mappers

import com.prosoma.data.networking.models.UserNameApiModel
import com.prosoma.domain.models.UserName

fun UserNameApiModel.toDomain() = UserName(
    title as String,
    first as String,
    last as String
)