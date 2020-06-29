package com.rajaman.homework11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var value = 0
    var d = 0
    var Nvalue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        val checkbox2 = findViewById<CheckBox>(R.id.checkbox2)
        val checkbox3 = findViewById<CheckBox>(R.id.checkbox3)
        val checkbox4 = findViewById<CheckBox>(R.id.checkbox4)
        val checkbox5 = findViewById<CheckBox>(R.id.checkbox5)
        val checkbox6 = findViewById<CheckBox>(R.id.checkbox6)
        val TenGst = findViewById<CheckBox>(R.id.checkbox7)
        val SixteenGst = findViewById<CheckBox>(R.id.checkbox8)
        val billBtn = findViewById<Button>(R.id.btn_Total)
        val BillResult = findViewById<TextView>(R.id.billTextView)



        checkbox1.setOnClickListener(this)
        checkbox2.setOnClickListener(this)
        checkbox3.setOnClickListener(this)
        checkbox4.setOnClickListener(this)
        checkbox5.setOnClickListener(this)
        checkbox6.setOnClickListener(this)
        checkbox1.setOnClickListener(this)
        billBtn.setOnClickListener(this)

    }
    override fun onClick(v:View?){
        val id = v?.id
        when(id){
            R.id.checkbox1 ->{
                value +=36
                return
            }
            R.id.checkbox2 ->{ value +=90

            }
            R.id.checkbox3 ->{
                value +=20
            }
            R.id.checkbox4 ->{value +=20
            }
            R.id.checkbox5 ->{
                value+=20
            }
            R.id.checkbox6 ->{
                value +=40
            }
            R.id.checkbox7 ->{
                checkbox8.isChecked =false
                d += ((10/100)*value)


            }
            R.id.checkbox8 ->{
                checkbox7.isChecked =false
                d += ((16/100)*value)

            }
            R.id.btn_Total -> {
                checkbox1.isChecked = false
                checkbox2.isChecked = false
                checkbox3.isChecked = false
                checkbox4.isChecked = false
                checkbox5.isChecked = false
                checkbox6.isChecked = false
                checkbox7.isChecked = false
                checkbox8.isChecked = false
                Nvalue =(d + value)
                Toast.makeText(this,"Your total Bill is ${Nvalue.toString()}",Toast.LENGTH_LONG).show()
                billTextView.text = Nvalue.toString()
                value = 0
            }
        }


    }
}
