package com.dagger.playground.di

import com.dagger.playground.data.EmailService
import com.dagger.playground.data.MessageService
import com.dagger.playground.data.NotificationService
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class NotificationServiceModule(private val retryCount: Int) {

    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }

    @MessageQualifier
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService(retryCount)
    }
}