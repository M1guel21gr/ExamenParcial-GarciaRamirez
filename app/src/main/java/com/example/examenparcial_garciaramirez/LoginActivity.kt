package com.example.examenparcial_garciaramirez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.btnLogin)
        val etEmail: EditText = findViewById(R.id.etEmail)
        val etPassword: EditText = findViewById(R.id.etPassword)

        btnLogin.setOnClickListener {
            this.confirmar(etEmail.text.toString(), etPassword.text.toString())

        }
    }
    private fun confirmar(PasswordValue: String, emailValue: String)
    {
        val intent = Intent(this, MenuActivity::class.java)
        if (PasswordValue == "admin@smartapp.com" && emailValue == "admin123"){
            startActivity(intent)
        }

    }
}