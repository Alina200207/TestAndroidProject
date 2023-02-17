package com.example.andr

import android.util.Log

object LogObject {
    private const val stringForLog = "method was called"

    fun logInfo(info: String, activityName: String) {
        Log.i(activityName, "$info $stringForLog")
    }
}