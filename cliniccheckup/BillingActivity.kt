package com.example.cliniccheckup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class BillingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_billing)

        val etConsultationFee = findViewById<EditText>(R.id.etConsultationFee)
        val etAdditionalCharges = findViewById<EditText>(R.id.etAdditionalCharges)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvBillSummary = findViewById<TextView>(R.id.tvBillSummary)

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener {
            finish()
        }
        btnCalculate.setOnClickListener {
            val consultationFee = etConsultationFee.text.toString().toDoubleOrNull()
            val additionalCharges = etAdditionalCharges.text.toString().toDoubleOrNull()


            if (consultationFee != null && additionalCharges != null) {
                val total = consultationFee + additionalCharges
                val billSummary = "Consultation Fee: KES $consultationFee\n" +
                        "Additional Charges: KES $additionalCharges\n" +
                        "Total Bill: KES $total"
                tvBillSummary.text = billSummary
            } else {
                Toast.makeText(this, "Please enter valid amounts", Toast.LENGTH_LONG).show()
            }
        }
    }
}
