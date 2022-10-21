package com.example.mylogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.TextureView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.tasks.Task
import com.google.firebase.database.FirebaseDatabase
import java.util.Calendar.getInstance

class MainActivity : AppCompatActivity() {

    private lateinit var Username_input: EditText
    private lateinit var password_input: EditText
    private lateinit var UserLogin:Button
    private lateinit var create_user:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var firebaseDatabase = FirebaseDatabase.getInstance()
        var databaseReference = firebaseDatabase.reference

        Username_input = findViewById(R.id.Username)
        password_input = findViewById(R.id.password)
        UserLogin= findViewById(R.id.loginbtn)
        create_user=findViewById(R.id.newsignup)

        UserLogin.setOnClickListener {
var Username = Username_input.text.toString().trim()
var newperson = create_user.text.toString().trim()
            Toast.makeText(this, "LOGIN SUCCESS", Toast.LENGTH_SHORT).show()
            var intent= Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
                    }
create_user.setOnClickListener {
    var intent= Intent(this, SignUpActivity::class.java)
    startActivity(intent)
    finish()
}

        }
    }

