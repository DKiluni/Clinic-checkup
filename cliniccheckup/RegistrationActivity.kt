package com.example.cliniccheckup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)
        val etContact = findViewById<EditText>(R.id.etContact)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener {
            finish()
        }

        btnSubmit.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString()
            val contact = etContact.text.toString()

            if (name.isNotEmpty() && age.isNotEmpty() && contact.isNotEmpty()) {
                Toast.makeText(this, "Patient Registered: $name", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "All fields are required", Toast.LENGTH_LONG).show()
            }
        }
    }
}
