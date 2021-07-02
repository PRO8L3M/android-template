package com.prosoma.data.mappers

import com.prosoma.data.networking.models.UserPictureApiModel
import com.prosoma.domain.models.UserPicture

fun UserPictureApiModel.toDomain() = UserPicture(
    large as String,
    medium as String,
    thumbnail as String
)