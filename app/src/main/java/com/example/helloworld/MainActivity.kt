package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.introButton)
        button.setOnClickListener(){
            Log.v("Hello world","button clicked")
            Toast.makeText(this, "Its me Peter", Toast.LENGTH_SHORT).show()
        }
    }
}