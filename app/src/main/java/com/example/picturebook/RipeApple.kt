package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RipeApple : AppCompatActivity() {
    lateinit var btnPrevious2:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ripe_apple)
        castView2()
        ClickNow()
    }
   fun castView2(){
       btnPrevious2=findViewById(R.id.btnPrevious2)
       btnNext2=findViewById(R.id.btnNext2)
   }
   fun ClickNow(){
       btnPrevious2.setOnClickListener {
           val next = Intent(baseContext, AppleActivity::class.java)
           startActivity(next)
       }
           btnNext2.setOnClickListener {
           val sophia=Intent(baseContext,GreenMango::class.java)
           startActivity(sophia)
       }
   }
}