package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class BaskaraActivity : AppCompatActivity() {
    private lateinit var etNumeroA: EditText
    private lateinit var etNumeroB: EditText
    private lateinit var etNumeroC: EditText
    private lateinit var buttonDelta: Button
    private lateinit var buttonRaiz1: Button
    private lateinit var buttonRaiz2: Button
    private lateinit var tvMostraResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.baskara)

        etNumeroA = findViewById(R.id.etNumeroA)
        etNumeroB = findViewById(R.id.etNumeroB)
        etNumeroC = findViewById(R.id.etNumeroC)
        buttonDelta = findViewById(R.id.buttonDelta)
        buttonRaiz1 = findViewById(R.id.buttonRaiz1)
        buttonRaiz2 = findViewById(R.id.buttonRaiz2)
        tvMostraResultado = findViewById(R.id.tvMostraResultado)

        buttonDelta.setOnClickListener {
            calcularDelta()
        }

        buttonRaiz1.setOnClickListener {
            calcularRaiz1()
        }

        buttonRaiz2.setOnClickListener {
            calcularRaiz2()
        }
    }

    private fun calcularDelta() {
        val a = etNumeroA.text.toString().toDouble()
        val b = etNumeroB.text.toString().toDouble()
        val c = etNumeroC.text.toString().toDouble()

        if (a == 0.0){
            "Não é uma equação de Segundo grau".also { tvMostraResultado.text = it }
            return
        }


        val delta = b * b - 4 * a * c
        "Delta: $delta".also { tvMostraResultado.text = it }
    }

    private fun calcularRaiz1() {
        val a = etNumeroA.text.toString().toDouble()
        val b = etNumeroB.text.toString().toDouble()
        val c = etNumeroC.text.toString().toDouble()

        if (a == 0.0){
            "Não é uma equação de Segundo grau".also { tvMostraResultado.text = it }
            return
        }

        val delta = b * b - 4 * a * c

        if (delta < 0) {
            "Não há raízes reais.".also { tvMostraResultado.text = it }
        } else {
            val x1 = (-b + sqrt(delta)) / (2 * a)
            "x1: $x1".also { tvMostraResultado.text = it }
        }
    }

    private fun calcularRaiz2() {
        val a = etNumeroA.text.toString().toDouble()
        val b = etNumeroB.text.toString().toDouble()
        val c = etNumeroC.text.toString().toDouble()

        if (a == 0.0){
            "Não é uma equação de Segundo grau".also { tvMostraResultado.text = it }
            return
        }

        val delta = b * b - 4 * a * c

        if (delta < 0) {
            "Não há raízes reais.".also { tvMostraResultado.text = it }
        } else {
            val x2 = (-b - sqrt(delta)) / (2 * a)
            "x2: $x2".also { tvMostraResultado.text = it }
        }
    }
}