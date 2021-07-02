package com.prosoma.domain.models

data class User(
    val id: UserId,
    val name: UserName,
    val picture: UserPicture,
    val gender: String
)