package com.example.mycardapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint)

        findViewById<Button>(R.id.petDogButton).setOnClickListener {
            //Log.d("MainActivity", "button clicked")
            Toast.makeText(this, "on button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
