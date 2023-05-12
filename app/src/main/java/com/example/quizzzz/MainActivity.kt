package com.example.quizzzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnn : Button = findViewById<Button>(R.id.btn1)
        val name : EditText = findViewById(R.id.etname)
        btnn.setOnClickListener{

            if(name.text.isEmpty()){
                Toast.makeText(this , "enter your name",Toast.LENGTH_LONG).show()



            }
            else {
                val intent = Intent(this , quizzsayfa1 :: class.java)
                startActivity(intent)
                finish()

            }
        }
    }
}