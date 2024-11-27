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

        
        paymentMethodsGroup = findViewById(R.id.paymentMethodsGroup)
        confirmPaymentButton = findViewById(R.id.confirmPaymentButton)

        val btnBack = findViewById<Button>(R.id.btnBack)

        
        btnBack.setOnClickListener {
            finish() 
        }

        
        confirmPaymentButton.setOnClickListener {
            val selectedId = paymentMethodsGroup.checkedRadioButtonId

            if (selectedId == -1) {
                
                Toast.makeText(this, "Please select a payment method", Toast.LENGTH_SHORT).show()
            } else {
                
                val selectedPaymentMethod: RadioButton = findViewById(selectedId)
                val paymentMethod = selectedPaymentMethod.text.toString()

                
                Toast.makeText(this, "You selected: $paymentMethod", Toast.LENGTH_SHORT).show()

                
                handlePayment(paymentMethod)
            }
        }
    }

    
    private fun handlePayment(paymentMethod: String) {
        when (paymentMethod) {
            "Credit Card" -> {
                
                Toast.makeText(this, "Processing Credit Card Payment", Toast.LENGTH_SHORT).show()
            }
            "PayPal" -> {
            
                Toast.makeText(this, "Processing PayPal Payment", Toast.LENGTH_SHORT).show()
            }
            "M-Pesa" -> {
                
                Toast.makeText(this, "Processing M-Pesa Payment", Toast.LENGTH_SHORT).show()
            }
            "Cash" -> {
                
                Toast.makeText(this, "Processing Cash Payment", Toast.LENGTH_SHORT).show()
            }
            else -> {
                
                Toast.makeText(this, "Unknown Payment Method", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
