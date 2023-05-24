package com.dagger.playground.di

import com.dagger.playground.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }
}