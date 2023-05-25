package com.dagger.playground.di

import com.dagger.playground.data.LocalRepository
import com.dagger.playground.data.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton

@Module
@DisableInstallInCheck
abstract class UserRepositoryModule {

    @Binds
    @Singleton
    abstract fun getLocalRepository(localRepository: LocalRepository): UserRepository

//    @Provides
//    fun getRemoteRepository(): UserRepository {
//        return RemoteRepository()
//    }
}