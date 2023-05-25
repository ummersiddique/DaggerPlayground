package com.dagger.playground.data

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {

    fun send(to: String, from: String, body: String?)
}

@Singleton
class EmailService @Inject constructor() : NotificationService {

    override fun send(to: String, from: String, body: String?) {
        android.util.Log.i("TAG", "Email sent : $to")
    }
}

class MessageService(private val retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.i("TAG", "Sending message to : $to, with retry count : $retryCount")
    }
}