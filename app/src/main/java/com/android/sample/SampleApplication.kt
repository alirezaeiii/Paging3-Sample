package com.android.sample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import timber.log.Timber.Forest.plant

@HiltAndroidApp
class SampleApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        initTimber()
    }
    /**
     * Initialize log library Timber only on debug build.
     */
    private fun initTimber() {
        if (BuildConfig.DEBUG) plant(Timber.DebugTree())
    }
}