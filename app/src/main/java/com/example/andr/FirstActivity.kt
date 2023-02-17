package com.example.andr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class FirstActivity : AppCompatActivity() {
    lateinit var textView: TextView
    private val numberText = "number"
    private val activityName = "FirstActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        textView = findViewById(R.id.number)
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

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(numberText, textView.text as String?)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        textView.text = ((savedInstanceState.getString(numberText, "0").toInt() + 1).toString())
        super.onRestoreInstanceState(savedInstanceState)
    }

    fun goToTheSecondFragment(view: View) {
        val go: Intent = Intent(this, SecondActivity::class.java)
            .apply {
                val bundle = Bundle()
                    .apply {putString(numberText, textView.text as String?) }
                putExtras(bundle) }
        startActivity(go)
    }
}