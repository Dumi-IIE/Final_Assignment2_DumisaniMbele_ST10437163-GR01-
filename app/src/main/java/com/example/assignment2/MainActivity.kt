package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeScreen = findViewById<Button>(R.id.link)

        changeScreen.setOnClickListener {

            val intent = Intent(this, UI_link::class.java)
            startActivity(intent)

        }
    }
}