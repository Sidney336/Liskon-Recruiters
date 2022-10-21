package com.example.mylogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class DashboardActivity : AppCompatActivity() {
    private lateinit var Painter_input: Button
    private lateinit var Carpenter_input: Button
    private lateinit var Paytv_input: Button
    private lateinit var Electrician_input: Button
    private lateinit var Plumber_input: Button
    private lateinit var fridge_input: Button
    private lateinit var Employer_input: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        Painter_input = findViewById(R.id.cvplumber)
        Carpenter_input = findViewById(R.id.cvcarpenter)
        Paytv_input = findViewById(R.id.cvpaytv)
        Electrician_input = findViewById(R.id.cvelectrician)
        Plumber_input = findViewById(R.id.cvplumber)
        fridge_input = findViewById(R.id.cvfridge)
        Employer_input = findViewById(R.id.cvemployer)

        Painter_input.setOnClickListener {
            Toast.makeText(this, "CV Uploaded Successfully", Toast.LENGTH_SHORT).show()
        }
        Carpenter_input.setOnClickListener {
            Toast.makeText(this, "CV Uploaded Successfully", Toast.LENGTH_SHORT).show()
        }
        Paytv_input.setOnClickListener {
            Toast.makeText(this, "CV Uploaded Successfully", Toast.LENGTH_SHORT).show()
        }
        Electrician_input.setOnClickListener {
            Toast.makeText(this, "CV Uploaded Successfully", Toast.LENGTH_SHORT).show()
        }
        Plumber_input.setOnClickListener {
            Toast.makeText(this, "CV Uploaded Successfully", Toast.LENGTH_SHORT).show()
        }
        fridge_input.setOnClickListener {
            Toast.makeText(this, "CV Uploaded Successfully", Toast.LENGTH_SHORT).show()
        }
        Employer_input.setOnClickListener {
            var intent = Intent(this, EmployerActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}