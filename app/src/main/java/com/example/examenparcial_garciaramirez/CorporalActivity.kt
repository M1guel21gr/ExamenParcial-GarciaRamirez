package com.example.examenparcial_garciaramirez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CorporalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corporal)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val etPeso: EditText = findViewById(R.id.etPeso)
        val etEstatura: EditText = findViewById(R.id.etEstatura)
        val btnRegMenu: Button = findViewById(R.id.btnRegMenu)
        val ResIMC: TextView = findViewById(R.id.ResIMC)
        val Categoria: TextView = findViewById(R.id.Categ)



        btnRegMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        btnCalcular.setOnClickListener {
            val Peso = Integer.parseInt(etPeso.getText().toString())
            val Estatura = Integer.parseInt(etEstatura.getText().toString())
            val res = (Peso/(Estatura*2))
            val resString  = res

            ResIMC.setText(resString)
            if (res<18.5){
                Categoria.setText("Bajo Peso")
            }else if (res<24.9 && res>=18.5){
                Categoria.setText("Peso Saludable")
            }else if (res<29.9 && res>=24.9){
                Categoria.setText("Sobre Peso")
            }else{
                Categoria.setText("Obesidad")
            }

        }
        val intent = Intent(this, CorporalActivity::class.java)
        startActivity(intent)
    }
}