package com.ifpanpakr.androidkotlinbasics

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SampleActivity :AppCompatActivity() {

    private  val TAG = SampleActivity::class.java.simpleName
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: ")
    }

   /* override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG, "onConfigurationChanged: ")
    }

    */

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        Log.d(TAG, "onNewIntent: ")
    }
    
    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart: ")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

        Log.d(TAG, "onPostCreate: ")
    }
    
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.d(TAG, "onRestoreInstanceState: ")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume: ")
    }

    override fun onPostResume() {
        super.onPostResume()

        Log.d(TAG, "onPostResume: ")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause: ")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        Log.d(TAG, "onAttachedToWindow: ")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop: ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.d(TAG, "onSaveInstanceState: ")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "onRestart: ")
    }


    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy: ")
    }
}