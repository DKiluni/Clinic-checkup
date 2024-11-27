package com.example.cliniccheckup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AppointmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment)

        val etDate = findViewById<EditText>(R.id.etDate)
        val etTime = findViewById<EditText>(R.id.etTime)
        val btnBook = findViewById<Button>(R.id.btnBook)

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener {
            finish()
        }

        btnBook.setOnClickListener {
            val date = etDate.text.toString()
            val time = etTime.text.toString()

            if (date.isNotEmpty() && time.isNotEmpty()) {
                Toast.makeText(this, "Appointment Booked: $date at $time", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "All fields are required", Toast.LENGTH_LONG).show()
            }
        }
    }
}
