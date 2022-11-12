package com.ifpanpakr.androidkotlinbasics

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class SampleBootReceiver : BroadcastReceiver() {

    private val TAG = SampleBootReceiver::class.java.simpleName ;

    override fun onReceive(mContext: Context?, mIntent : Intent?) {

        val mAction = mIntent?.action

        Log.d(TAG, "onReceive: $mAction")

        if (mAction.equals(Intent.ACTION_BOOT_COMPLETED)) {

            Log.d(TAG, "onReceive: ACTION_BOOT_COMPLETED ,$mIntent")
            Log.d(TAG, "onReceive:  Context :  $mContext")

            val launchIntent = Intent()
            launchIntent.action = ""

        }

    }
}