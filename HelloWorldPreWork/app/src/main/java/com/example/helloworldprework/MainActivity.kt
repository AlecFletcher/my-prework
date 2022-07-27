package com.example.helloworldprework

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Close Keyboard
        fun closeKeyboard(){
            val view = this.currentFocus
            if(view != null){
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)
            }
        }

        //Change text color
        findViewById<Button>(R.id.button).setOnClickListener{
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }


        //Change Text String
        findViewById<Button>(R.id.button2).setOnClickListener{
            var inputField = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
            //Checks to make sure input is not empty
            if(inputField != ""){
                findViewById<TextView>(R.id.textView).text = inputField
                closeKeyboard()
            }
            //If input is empty, use default text
            else{
                findViewById<TextView>(R.id.textView).text = "Please Enter Text Above!"
                closeKeyboard()
            }
        }


        //Change Background Color
        findViewById<Button>(R.id.button3).setOnClickListener{
            findViewById<View>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.secondary))
        }



        //Change textView text to say "Goodbye"
        findViewById<Button>(R.id.button4).setOnClickListener{
            findViewById<TextView>(R.id.textView).text = "Goodbye \uD83D\uDC4B"
        }


        //Reset View if Background is clicked
        findViewById<View>(R.id.backgroundView).setOnClickListener{
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
            findViewById<TextView>(R.id.textView).text = "Hello from Alec!"
            findViewById<View>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.main))
            findViewById<EditText>(R.id.editTextTextPersonName).setText("")
            findViewById<EditText>(R.id.editTextTextPersonName).hint = "Add Text to Change!"

        }


    }
}