package com.muscode.rxdialogdemo.di.modules

import android.app.Application
import android.content.Context
import com.muscode.rxdialogdemo.di.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideApp(application: App): Application = application

    @Singleton
    @Provides
    fun provideContext(application: App): Context = application.applicationContext
}