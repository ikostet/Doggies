package com.example.doggies.di

import com.example.doggies.data.local.Storage
import com.example.doggies.data.repository.OnboardRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideOnboardRepository(
        storage: Storage
    ) : OnboardRepository {
        return OnboardRepository(storage)
    }
}