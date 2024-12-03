package com.example.a541231057_latihan2_activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val pindah = findViewById<Button>(R.id.btnpindah)
        pindah.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
    override fun onStart(){
        super.onStart()
        printState("Halaman satu On Start")
    }
    override fun onResume(){
        super.onResume()
        printState("Halaman satu On Resume")
    }
    override fun onPause(){
        super.onPause()
        printState("Halaman satu On Pause")
    }
    override fun onStop(){
        super.onStop()
        printState("Halaman satu On Stop")
    }
    override fun onRestart(){
        super.onRestart()
        printState("Halaman satu On Restart")
    }
    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman satu On Destroy")
    }
    fun printState(msg: String){
        Log.d("ActivityState",msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
    }
}