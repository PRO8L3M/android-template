package com.prosoma.domain.usecases

import com.prosoma.domain.models.None
import com.prosoma.domain.models.User
import com.prosoma.domain.repositories.UsersRepository
import com.prosoma.domain.usecases.base.UseCase
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val usersRepository: UsersRepository
) : UseCase<None, List<User>>() {

    override suspend fun run(params: None): List<User> = usersRepository.getUsers()
}