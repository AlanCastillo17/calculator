package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var Resultado: TextView?=null
    private var Numero1: EditText?=null
    private var Numero2: EditText?=null
    private var Salir: OnClickListener?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Numero1 = this.findViewById(R.id.edtDigito1)
        Numero2 = this.findViewById(R.id.edtDigito2)
        Resultado = this.findViewById(R.id.edtResultado)
    }

    fun onSuma(view: View){
        var num1:String = Numero1!!.text.toString()
        var num2:String = Numero2!!.text.toString()
        val resultadotempo = (num1.toFloat() +num2.toFloat())
        Resultado!!.setText(resultadotempo.toString())
    }

    fun onResta(view: View){
        var num1:String = Numero1!!.text.toString()
        var num2:String = Numero2!!.text.toString()
        val resultadotempo = (num1.toFloat() -num2.toFloat())
        Resultado!!.setText(resultadotempo.toString())
    }

    fun onProducto(view: View){
        var num1:String = Numero1!!.text.toString()
        var num2:String = Numero2!!.text.toString()
        val resultadotempo = (num1.toFloat() *num2.toFloat())
        Resultado!!.setText(resultadotempo.toString())
    }

    fun onDivision(view: View){
        var num1:String = Numero1!!.text.toString()
        var num2:String = Numero2!!.text.toString()
        val resultadotempo = (num1.toFloat() /num2.toFloat())
        Resultado!!.setText(resultadotempo.toString())
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Salir = this.findViewById(R.id.btnSalir)
        finish()
    }


}