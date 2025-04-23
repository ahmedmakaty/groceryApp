package com.example.grocerytraining.data.repository

import kotlinx.coroutines.flow.Flow

interface UserRepository {

    fun findUser(email: String, password: String): Flow<Boolean>
}