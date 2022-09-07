package com.example.hypstuma2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class SignupActivity : AppCompatActivity() {
    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var rePassword: EditText
    private lateinit var signUpBtn: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        supportActionBar?.hide()
        name=findViewById(R.id.name)
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
        rePassword=findViewById(R.id.rePassword)
        signUpBtn=findViewById(R.id.signUpBtn)
        signUpBtn.setOnClickListener{
            if( password.getText().toString().equals(rePassword.getText().toString())){
                Toast.makeText(this,"Account Created!!", Toast.LENGTH_SHORT).show()
                val intent= Intent(this@SignupActivity,MainActivity2::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Password Did Not Match!! Try Again!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}