package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carPrice = editTextCarPrice
        val textDown =editTextDownPayment
        val year = editTextLoanPeriod
        val rate = editTextInterestRate

        val textIntt = rInt
        val textMonth = rMon
        val textLoan = rLoan
        val cal = findViewById( R.id.buttonCalculate) as Button
        val reset = findViewById( R.id.buttonReset) as Button

        cal.setOnClickListener{

//            val a= (carPrice.toInt()-textDown.toInt())*rate.toInt()*year.toInt()

//            val c = (a+b)/year.toInt()/12
            val cp = carPrice.text.toString().toInt()
            val td = textDown.text.toString().toInt()
            val y = year.text.toString().toInt()
            val Ir = rate.text.toString().toDouble()/100
            textLoan.setText((cp-td).toString())
            textIntt.setText(((cp-td)*Ir*y).toString())
            textMonth.setText(((((cp-td)+((cp-td)*Ir*y))/y)/12).toString())

        }
        reset.setOnClickListener{
            carPrice.setText("")
            textDown.setText("")
            rate.setText("")
            year.setText("")
            textIntt.setText("")
            textMonth.setText("")
            textLoan.setText("")

        }

    }
}
