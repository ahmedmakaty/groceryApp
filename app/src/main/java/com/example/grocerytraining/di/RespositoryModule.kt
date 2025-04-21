package com.example.grocerytraining.di

import com.example.grocerytraining.data.repository.UserRepository
import com.example.grocerytraining.data.repository.UserRespositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn (ViewModelComponent::class)
object RepositoryModule {

    @Provides
    fun providesUserRepository(): UserRepository {
        return UserRespositoryImpl()
    }
}