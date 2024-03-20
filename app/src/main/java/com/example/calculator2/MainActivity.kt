package com.example.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var etNumber1 : EditText?  = null
    private var etNumber2 : EditText? = null
    private var tvDisplay: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById<EditText>(R.id.etNum1)
        etNumber2 = findViewById<EditText>(R.id.etNum2)
        tvDisplay = findViewById<TextView>(R.id.tvDisp)

        val btnAddition  = findViewById<Button>(R.id.btnAdd)
        btnAddition.setOnClickListener{
            add()
        }

        val btnSubtraction  = findViewById<Button>(R.id.btnSub)
        btnSubtraction.setOnClickListener{
            sub()
        }
        val btnMultiplication   = findViewById<Button>(R.id.btnMul)
        btnMultiplication.setOnClickListener{
            mul()
        }
        val btnDivision  = findViewById<Button>(R.id.btnDivision)
        btnDivision.setOnClickListener{
            div()
        }
    }

    private fun add(){
        var intNum1 : Int = 0
        var intNum2 : Int = 0
        var intAns : Int = 0

        intNum1 = etNumber1.text.toString().toInt()
        intNum2 = etNumber2.text.toString().toInt()

        intAns = intNum1 + intNum2

        tvDisplay?.text =  "+ intNum1 +" "+" + intNum2 + "=" + intAns

    }
}