package com.prosoma.livingwell.presentation

import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import com.prosoma.livingwell.BuildConfig
import com.prosoma.livingwell.di.InjectorApplication
import timber.log.Timber

class MainApplication : InjectorApplication() {

    override fun onCreate() {
        super.onCreate()
        initAppCenter()
        initTimber()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }

    private fun initAppCenter() {
        AppCenter.start(
            this,
            BuildConfig.APP_CENTER_APP_ID,
            Analytics::class.java,
            Crashes::class.java
        )
    }
}