package com.prosoma.data.mappers

import com.prosoma.data.networking.models.UserApiModel
import com.prosoma.domain.models.User
import com.prosoma.domain.models.UserId
import com.prosoma.domain.models.UserName
import com.prosoma.domain.models.UserPicture

fun UserApiModel.toDomain() = User(
    id?.toDomain() as UserId,
    name?.toDomain() as UserName,
    picture?.toDomain() as UserPicture,
    gender as String
)