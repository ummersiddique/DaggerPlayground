package com.dagger.playground.data

import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@Singleton
class LocalRepository @Inject constructor() : UserRepository {

    override fun saveUser(email: String, password: String) {
        android.util.Log.i("TAG", "Save user in local db $email and $password")
    }
}

class RemoteRepository : UserRepository {

    override fun saveUser(email: String, password: String) {
        android.util.Log.i("TAG", "Save user in remote db $email and $password")
    }
}