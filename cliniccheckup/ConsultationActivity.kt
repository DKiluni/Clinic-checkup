package com.example.cliniccheckup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ConsultationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultation)

        val etDoctor = findViewById<EditText>(R.id.etDoctor)
        val etDiagnosis = findViewById<EditText>(R.id.etDiagnosis)
        val etPrescription = findViewById<EditText>(R.id.etPrescription)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvDetails = findViewById<TextView>(R.id.tvDetails)

        btnSubmit.setOnClickListener {
            val doctor = etDoctor.text.toString()
            val diagnosis = etDiagnosis.text.toString()
            val prescription = etPrescription.text.toString()

            if (doctor.isNotEmpty() && diagnosis.isNotEmpty() && prescription.isNotEmpty()) {
                val details = "Doctor: $doctor\nDiagnosis: $diagnosis\nPrescription: $prescription"
                tvDetails.text = details
            } else {
                Toast.makeText(this, "All fields are required", Toast.LENGTH_LONG).show()
            }
        }
    }
}