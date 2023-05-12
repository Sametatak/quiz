package com.example.quizzzz

data class question(
    val id: Int,
    val questions: String,
    val image: Int,
    val op1 :String,
    val op2 :String,
    val op3 :String,
    val op4 :String,
    val correctanswr: Int
)
