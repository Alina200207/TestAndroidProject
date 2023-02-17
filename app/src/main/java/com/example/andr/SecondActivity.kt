package com.example.andr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private val numberText = "number"
    private val activityName = "SecondFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        val bundle = intent.extras

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView: TextView = findViewById(R.id.squareNumber)
        if (bundle != null) {
            val number = bundle.getString(numberText)?.toInt() ?: 0
            textView.text = (number*number).toString()
        }
        LogObject.logInfo("onCreate", activityName)
    }

    override fun onStart() {
        super.onStart()
        LogObject.logInfo("onStart", activityName)
    }

    override fun onRestart(){
        super.onRestart()
        LogObject.logInfo("onRestart", activityName)
    }

    override fun onResume() {
        super.onResume()
        LogObject.logInfo("onResume", activityName)
    }

    override fun onPause() {
        super.onPause()
        LogObject.logInfo("onPause", activityName)
    }

    override fun onStop() {
        super.onStop()
        LogObject.logInfo("onStop", activityName)
    }

    override fun onDestroy() {
        super.onDestroy()
        LogObject.logInfo("onDestroy", activityName)
    }


}