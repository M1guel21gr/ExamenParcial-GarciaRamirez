package com.example.examenparcial_garciaramirez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ZodiacoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zodiaco)

        val btnRegmenuZo: Button = findViewById(R.id.btnRegmenuZo)
        val btncalZod: Button = findViewById(R.id.btncalZod)

        btnRegmenuZo.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        btncalZod.setOnClickListener {

        }
    }
}