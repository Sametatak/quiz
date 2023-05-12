package com.example.quizzzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Intent
import android.widget.TextView

class quizzsayfa1 : AppCompatActivity() {
    var gösterge : TextView? = null
    var classf = flag1()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizzsayfa1)
        val btn = findViewById<Button>(R.id.btnid)

        gösterge = findViewById(R.id.ksr)



        btn.setOnClickListener{
            val inter = Intent(this , flag1 :: class.java)
            startActivity(inter)

        }
    }
    fun yaz(view : View){
        Toast.makeText(this , "henüz quiz yüklenmedi" , Toast.LENGTH_LONG).show()
        var c1 = classf.c1
        gösterge?.text = "correct answer: $c1"
    }


}