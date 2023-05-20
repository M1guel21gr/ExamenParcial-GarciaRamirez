package com.example.examenparcial_garciaramirez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnIMC: Button = findViewById(R.id.btnIMC)
        val btnSZ: Button = findViewById(R.id.btnSZ)
        val btnGen: Button = findViewById(R.id.btnGen)

        val btnRegresar: Button = findViewById(R.id.btnRegresar)

        btnRegresar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnIMC.setOnClickListener {
            val intent = Intent(this, CorporalActivity::class.java)
            startActivity(intent)
        }
        btnSZ.setOnClickListener {
            val intent = Intent(this, ZodiacoActivity::class.java)
            startActivity(intent)
        }
        btnGen.setOnClickListener {
            val intent = Intent(this, CorporalActivity::class.java)
            startActivity(intent)
        }
    }
}