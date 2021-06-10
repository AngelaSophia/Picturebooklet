package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Vegetables : AppCompatActivity() {
    lateinit var btnPrevious5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetables)
        casrView3()
        ClickNow()
    }

    fun casrView3() {
        btnPrevious5 = findViewById(R.id.btnPrevious5)

    }

    fun ClickNow() {
        btnPrevious5.setOnClickListener {
            val next = Intent(baseContext, GreenMango::class.java)
            startActivity(next)
        }
    }
}