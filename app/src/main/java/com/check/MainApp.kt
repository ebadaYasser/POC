package com.check

import android.app.Application
import com.check.fullcycklepoc.di.appModule
import com.check.fullcycklepoc.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApp)
            modules(appModule, viewModelModule)
        }
    }

}