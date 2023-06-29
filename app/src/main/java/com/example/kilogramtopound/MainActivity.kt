package com.example.kilogramtopound

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edKilo = findViewById<EditText>(R.id.ed_kilo)
        val btnConvert = findViewById<Button>(R.id.btn)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        btnConvert.setOnClickListener()
        {

            if(edKilo.text.toString().isEmpty()|| edKilo.text.toString().toDouble()<0.0)
            {
                edKilo.setError("")
                Toast.makeText(this,"Field cannot be empty!",Toast.LENGTH_SHORT).show()
            }
            else{
                var kilo = edKilo.text.toString().toDouble()
                tvResult.setText(""+kiloToPound(kilo)+"\n Pounds")
            }

        }
    }
    //This function converts kilogram into pound
    fun kiloToPound(kilo:Double):Double{
        var pounds = kilo * 2.20462
        return pounds
    }
}