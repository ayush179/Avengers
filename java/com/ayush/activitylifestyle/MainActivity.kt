package com.ayush.activitylifestyle

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


   var titleName:String?="Avengers"
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences=getSharedPreferences(getString(R.string.preferences_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.scroll_view_example)
        titleName=sharedPreferences.getString("Title","The Avengers")
        title=titleName
        println("on create called")

    }

    override fun onStart() {
        super.onStart()
        println("on start called")
    }

    override fun onResume() {
        super.onResume()
        println("on resume called")
    }

    override fun onPause() {
        super.onPause()
        println("on pause called")
    }

    override fun onStop() {
        super.onStop()
        println("on stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("on stop called")
    }

    override fun onRestart() {
        super.onRestart()
        println("on restart called")
    }
}
