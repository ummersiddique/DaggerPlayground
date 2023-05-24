package com.dagger.playground.data

import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

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