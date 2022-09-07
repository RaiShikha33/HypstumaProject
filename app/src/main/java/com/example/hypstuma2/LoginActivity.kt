package com.example.hypstuma2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var signIn: MaterialButton
    private lateinit var signUp: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        email= findViewById(R.id.email)
        password= findViewById(R.id.password)
        signIn=findViewById(R.id.signInBtn)
        signUp=findViewById(R.id.signUp)
        signIn.setOnClickListener {
            if(email.text.toString() == "admin" && password.text.toString() == "admin"){
                Toast.makeText(this,"LOGIN SUCCESSFUL!!", Toast.LENGTH_SHORT).show()
                val intent= Intent(this@LoginActivity,MainActivity2::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"LOGIN NOT SUCCESSFUL!!", Toast.LENGTH_SHORT).show()
            }
        }
        signUp.setOnClickListener{
            val intent= Intent(this@LoginActivity,SignupActivity::class.java)
            startActivity(intent)
        }

    }
}