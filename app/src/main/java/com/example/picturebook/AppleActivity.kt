package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AppleActivity : AppCompatActivity() {
    lateinit var btnPrevious1:Button
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apple)
        castView1()
        clickNow1()

    }
    fun castView1(){
        btnPrevious1=findViewById(R.id.btnprevious1)
        btnNext1=findViewById(R.id.btnNext1)
    }
    fun clickNow1(){
        btnPrevious1.setOnClickListener {
            val next= Intent(baseContext,MainActivity::class.java)
            startActivity(next)

        }
        btnNext1.setOnClickListener {
            val sophia=Intent(baseContext,RipeApple::class.java)
            startActivity(sophia)
        }
    }
}