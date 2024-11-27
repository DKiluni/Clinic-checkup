package com.example.cliniccheckup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val btnAppointment = findViewById<Button>(R.id.btnAppointment)
        val btnConsultation = findViewById<Button>(R.id.btnConsultation)
        val btnBilling = findViewById<Button>(R.id.btnBilling)

        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }

        btnAppointment.setOnClickListener {
            startActivity(Intent(this, AppointmentActivity::class.java))
        }

        btnConsultation.setOnClickListener {
            startActivity(Intent(this, ConsultationActivity::class.java))
        }

        btnBilling.setOnClickListener {
            startActivity(Intent(this, BillingActivity::class.java))
        }
    }
}