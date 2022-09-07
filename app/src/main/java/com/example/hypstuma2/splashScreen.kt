package com.example.hypstuma2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splashScreen : AppCompatActivity() {
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        handler= Handler()
        handler.postDelayed({
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        },4400) //delaying 3 seconds to open main activity
    }
}