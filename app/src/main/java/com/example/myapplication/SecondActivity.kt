package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    private lateinit var num1_text: TextView
    private lateinit var num2_text: TextView
    private lateinit var result_text: TextView
    private lateinit var butt: Button
    private lateinit var check4: CheckBox
    private lateinit var check3: CheckBox
    private lateinit var check2: CheckBox
    private lateinit var check1: CheckBox


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
//инициализаиция кнопки
        butt = findViewById(R.id.butt)
//инициализаиция текст вью 1
        num1_text = findViewById(R.id.num1ID)
//инициализаиция текст вью 2
        num2_text = findViewById(R.id.num2ID)
//инициализаиция текст вью 3
        result_text = findViewById(R.id.result)
//инициализаиция чек бокса 4
        check4 = findViewById(R.id.checkBoxmultiplication)
//инициализаиция чек бокса 3
        check3 = findViewById(R.id.checkBoxDivision)
//инициализаиция чек бокса 2
        check2 = findViewById(R.id.checkBoxMinus)
//инициализаиция чек бокса 1
        check1 = findViewById(R.id.checkBoxPlus)


//получение данных по ключу
        val num1=intent.getStringExtra("key_num1")
        val num2=intent.getStringExtra("key_num2")
//передача данных в текст вью
        num1_text.text= num1
        num2_text.text= num2
        butt.setOnClickListener {
            try {
                val numConvert1:Int= num1!!.toInt()
                val numConvert2:Int= num2!!.toInt()
            }
            catch(e: Exception){
                Toast.makeText(this,
                    "no correct input", Toast.LENGTH_LONG).show();
            }
            val numConvert1:Int= num1!!.toInt()
            val numConvert2:Int= num2!!.toInt()
            var resultFinal:Float= 0.1F

            if (check4.isChecked) {
                resultFinal= (numConvert1*numConvert2).toFloat()
                result_text.text= resultFinal.toString()
            }
            if (check3.isChecked) {
                try {
                    resultFinal= (numConvert1/numConvert2).toFloat()
                    result_text.text= resultFinal.toString()
                }
                catch(e: Exception){
                    Toast.makeText(this,
                        "you can't divide by zero", Toast.LENGTH_LONG).show();
                }

            }
            if (check2.isChecked) {
                resultFinal= (numConvert1-numConvert2).toFloat()
                result_text.text= resultFinal.toString()
            }

            if (check1.isChecked) {
                resultFinal= (numConvert1+numConvert2).toFloat()
                result_text.text= resultFinal.toString()
            }



        }

    }
}
