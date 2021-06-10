package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GreenMango : AppCompatActivity() {
    lateinit var btnPrevious4:Button
    lateinit var  btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green_mango)
        casrView3()
        ClickNow()
    }
    fun casrView3(){
        btnPrevious4=findViewById(R.id.btnPrevious4)
        btnNext4=findViewById(R.id.btnNext4)
    }
    fun ClickNow(){
        btnPrevious4.setOnClickListener {
            val next = Intent(baseContext, RipeApple::class.java)
            startActivity(next)
        }
        btnNext4.setOnClickListener {
            val sophia= Intent(baseContext,Vegetables::class.java)
            startActivity(sophia)
        }
    }
}