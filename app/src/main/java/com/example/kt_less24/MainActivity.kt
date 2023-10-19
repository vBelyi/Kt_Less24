package com.example.kt_less24

import android.animation.ObjectAnimator
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        val buttonEmail: Button = findViewById(R.id.buttonEmail)
        val buttonPhone: Button = findViewById(R.id.buttonPhone)
        val textPhone: TextView = findViewById(R.id.phoneNumber)
        val textMail: TextView = findViewById(R.id.mailNumber)

        buttonPhone.setOnClickListener {
            val animatorPhone = ObjectAnimator.ofFloat(textPhone, View.ALPHA, 0.0f, 1.0f)
            animatorPhone.start()
        }

        buttonEmail.setOnClickListener {
            val animatorEmail = ObjectAnimator.ofFloat(textMail, View.ALPHA, 0.0f, 1.0f )
            animatorEmail.start()
        }
    }

}