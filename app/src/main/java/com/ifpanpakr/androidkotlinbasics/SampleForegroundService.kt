package com.ifpanpakr.androidkotlinbasics

import android.app.Service
import android.content.Intent
import android.os.IBinder

class SampleForegroundService : Service () {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onStart(intent: Intent?, startId: Int) {
        super.onStart(intent, startId)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}