package com.mukisasamuel.bbc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
   Handler().postDelayed({
    val b = Intent(this@SplashActivity,MainActivity::class.java)
       startActivity(b)
       finish()
   },4000)
    }
}