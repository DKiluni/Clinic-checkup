package com.example.cliniccheckup

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cliniccheckup.R

class PaymentActivity : AppCompatActivity() {

    private lateinit var paymentMethodsGroup: RadioGroup
    private lateinit var confirmPaymentButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        // Find views by ID
        paymentMethodsGroup = findViewById(R.id.paymentMethodsGroup)
        confirmPaymentButton = findViewById(R.id.confirmPaymentButton)

        val btnBack = findViewById<Button>(R.id.btnBack)

        // Back button click listener
        btnBack.setOnClickListener {
            finish() // Close the current activity and go back to the previous one
        }

        // Set up confirm payment button click listener
        confirmPaymentButton.setOnClickListener {
            val selectedId = paymentMethodsGroup.checkedRadioButtonId

            if (selectedId == -1) {
                // No payment method selected
                Toast.makeText(this, "Please select a payment method", Toast.LENGTH_SHORT).show()
            } else {
                // Get the selected RadioButton
                val selectedPaymentMethod: RadioButton = findViewById(selectedId)
                val paymentMethod = selectedPaymentMethod.text.toString()

                // Show a confirmation message
                Toast.makeText(this, "You selected: $paymentMethod", Toast.LENGTH_SHORT).show()

                // Handle the payment method selection
                handlePayment(paymentMethod)
            }
        }
    }

    // Function to handle different payment methods
    private fun handlePayment(paymentMethod: String) {
        when (paymentMethod) {
            "Credit Card" -> {
                // Trigger credit card payment logic
                Toast.makeText(this, "Processing Credit Card Payment", Toast.LENGTH_SHORT).show()
            }
            "PayPal" -> {
                // Trigger PayPal payment logic
                Toast.makeText(this, "Processing PayPal Payment", Toast.LENGTH_SHORT).show()
            }
            "M-Pesa" -> {
                // Trigger M-Pesa payment logic
                Toast.makeText(this, "Processing M-Pesa Payment", Toast.LENGTH_SHORT).show()
            }
            "Cash" -> {
                // Trigger M-Pesa payment logic
                Toast.makeText(this, "Processing Cash Payment", Toast.LENGTH_SHORT).show()
            }
            else -> {
                // Handle unknown payment method
                Toast.makeText(this, "Unknown Payment Method", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
