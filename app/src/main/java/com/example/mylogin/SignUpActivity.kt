package com.example.mylogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    private lateinit var new_client:Button
    private lateinit var new_Email:EditText
    private lateinit var new_pass:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        new_client=findViewById(R.id.registerbtn)
        new_Email=findViewById(R.id.EmailAddress)
        new_pass=findViewById(R.id.TextPassword)

        new_client.setOnClickListener {
         var newuser= new_client.text.toString().trim()
         var newpass= new_pass.text.toString().trim()
         Toast.makeText(this,"Registration Successful", Toast.LENGTH_SHORT).show()
         var intent = Intent(this, MainActivity::class.java)
         startActivity(intent)
         finish()
        }
    }
}