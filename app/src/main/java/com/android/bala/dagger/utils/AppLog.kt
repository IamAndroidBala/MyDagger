package com.android.bala.dagger.utils

import android.util.Log
import javax.inject.Inject

class AppLog @Inject constructor() {

    fun d(message : String) {
        Log.d(AppLog::class.java.name,  "=> $message")
    }
}