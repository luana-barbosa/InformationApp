package com.example.information.ui

import android.app.Application
import com.example.home.di.homeModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class InformationApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@InformationApp)
            modules(listOf(homeModule))
        }
    }
}