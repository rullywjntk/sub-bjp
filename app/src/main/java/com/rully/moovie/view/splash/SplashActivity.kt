package com.rully.moovie.view.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.rully.moovie.R
import com.rully.moovie.view.main.MainActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper())
            .postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, 1500)
    }
}