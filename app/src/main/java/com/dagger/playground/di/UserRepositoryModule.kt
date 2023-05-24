package com.dagger.playground.di

import com.dagger.playground.data.LocalRepository
import com.dagger.playground.data.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
abstract class UserRepositoryModule {

    @Binds
    abstract fun getLocalRepository(localRepository: LocalRepository): UserRepository

//    @Provides
//    fun getRemoteRepository(): UserRepository {
//        return RemoteRepository()
//    }
}