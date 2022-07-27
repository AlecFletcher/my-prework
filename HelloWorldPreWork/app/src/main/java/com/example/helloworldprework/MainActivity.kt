package com.example.helloworldprework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Change text color
        findViewById<Button>(R.id.button).setOnClickListener{
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

        findViewById<Button>(R.id.button2).setOnClickListener{
            var inputField = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
            findViewById<TextView>(R.id.textView).text = inputField
        }
        findViewById<Button>(R.id.button3).setOnClickListener{
            findViewById<View>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.secondary))
        }

    }
}