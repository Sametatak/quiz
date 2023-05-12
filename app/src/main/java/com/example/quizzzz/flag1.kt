package com.example.quizzzz

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Size
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class flag1 : AppCompatActivity(), View.OnClickListener {
    private var mcurrentpos: Int = 1

    private var quelistt: ArrayList<question>? = null
    private var selextedpos: Int = 0
    private var progressBar: ProgressBar? = null
    private var tvprogress: TextView? = null
    private var tvque: TextView? = null
    private var img: ImageView? = null
    private var tvop1: TextView? = null
    private var tvop2: TextView? = null
    private var tvop3: TextView? = null
    private var tvop4: TextView? = null
    private var btnsubmit: Button? = null
    private var dnm : Int = 0
    var canwr: TextView? = null
    var wansr: TextView? = null
    var c1 : Int = 0
    var c2 : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag1)
        progressBar = findViewById(R.id.pb)
        tvprogress = findViewById(R.id.ps)
        tvque = findViewById(R.id.yazı)
        img = findViewById(R.id.img)
        tvop1 = findViewById(R.id.op1)
        tvop2 = findViewById(R.id.op2)
        tvop3 = findViewById(R.id.op3)
        tvop4 = findViewById(R.id.op4)
        quelistt = const.getquestions()
        btnsubmit = findViewById(R.id.btn12) //sdads
        canwr = findViewById(R.id.yaz15)
        wansr = findViewById(R.id.yazı13)

        setque()
        tvop2?.setOnClickListener(this)
        tvop1?.setOnClickListener(this)
        tvop3?.setOnClickListener(this)
        tvop4?.setOnClickListener(this)
        btnsubmit?.setOnClickListener(this)


    }

    private fun setque() {


        val ques: question = quelistt!![mcurrentpos - 1]
        img?.setImageResource(ques.image)
        progressBar?.progress = mcurrentpos
        tvprogress?.text = "$mcurrentpos / ${progressBar?.max}"
        tvque?.text = ques.questions
        tvop1?.text = ques.op1
        tvop2?.text = ques.op2
        tvop3?.text = ques.op3
        tvop4?.text = ques.op4
        mcurrentpos++

        if (mcurrentpos > quelistt!!.size) {
            btnsubmit?.text = "finish"

        } else {
            btnsubmit?.text = "submit"
        }
    }

    private fun defopview() {
        val options = ArrayList<TextView>()
        options.add(tvop1!!)
        tvop2?.let {
            options.add(1, it)
        }
        tvop3?.let {
            options.add(2, it)
        }
        tvop4?.let {
            options.add(3, it)
        }
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.def_bg)
        }
    }

    private fun opview(tv: TextView, selectednum: Int) {
        defopview()
        selextedpos = selectednum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.def_bg2)

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.op1 -> tvop1?.let {
                opview(it, 1)

            }
            R.id.op2 -> tvop2?.let {
                opview(it, 2)

            }
            R.id.op3 -> tvop3?.let {
                opview(it, 3)

            }
            R.id.op4 -> tvop4?.let {
                opview(it, 4)

            }
            R.id.btn12 -> {


                if (dnm == 0) {
                    if (selextedpos == 0) {
                        Toast.makeText(this , "seçenek seç", Toast.LENGTH_LONG).show()
                    } else  {
                        btnsubmit?.text = "go to the next question"
                        val question = quelistt?.get(mcurrentpos - 2)
                        if (question!!.correctanswr != selextedpos) {
                            answerview(selextedpos, R.drawable.wrong)
                            c2++
                            wansr?.text = "Wrong answer: $c2"
                        }else if(question!!.correctanswr == selextedpos){
                        answerview(question.correctanswr, R.drawable.correct)
                        c1++
                        canwr?.text = "Correct answer: $c1"
                    }
                    }
                    dnm++

                }else if (dnm == 1){
                    setque()
                    selextedpos = 0
                    defopview()
                    dnm--

                }
            }
        }
    }
    private fun answerview(answer: Int, drawableViw : Int){
        when(answer){
            1 -> tvop1?.background = ContextCompat.getDrawable(this,drawableViw)
            2 -> tvop2?.background = ContextCompat.getDrawable(this,drawableViw)
            3 -> tvop3?.background = ContextCompat.getDrawable(this,drawableViw)
            4 -> tvop4?.background = ContextCompat.getDrawable(this,drawableViw)
        }
    }
}