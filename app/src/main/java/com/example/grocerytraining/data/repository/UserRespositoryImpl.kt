package com.example.grocerytraining.data.repository

import kotlinx.coroutines.flow.Flow

class UserRespositoryImpl: UserRepository {

    override fun findUser(email: String, password: String): Flow<Boolean> {
        TODO("Not yet implemented")
    }
}