package com.ifpanpakr.androidkotlinbasics

import android.app.Application
import android.util.Log

class SampleApplication : Application() {

    private val TAG = SampleApplication::class.java.simpleName

    override fun onCreate() {
        super.onCreate()

        Log.d(TAG, "onCreate: ")
    }


    override fun onTerminate() {
        super.onTerminate()

        Log.d(TAG, "onTerminate: ")
    }
}