package com.example.spardha

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val startAct = Intent(this@SplashActivity,MainActivity::class.java)
            startActivity(startAct)
            this.finish()
        },1000)
    }
}
