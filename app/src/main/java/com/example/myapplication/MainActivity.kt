package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var mainbutton: Button
    private lateinit var numebr1: EditText
    private lateinit var number2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//инициализаиция едит текста 1
        numebr1 = findViewById(R.id.number1ID)
//инициализаиция едит текста 2
        number2 = findViewById(R.id.numeer2ID)
//инициализаиция кнопки
        mainbutton = findViewById(R.id.mainbutton)
//обработчик нажатия кнопки
        mainbutton.setOnClickListener {
//принятие данных эдит текста 1
            val num1: String = numebr1.text.toString()
//принятие данных эдит текста 2
            val num2: String = number2.text.toString()
// скорее всего создание обьекта класса интент
            val intent = Intent(this, SecondActivity::class.java)
//отправка данных
            try {
                val numConvert1:Int= num1!!.toInt()
                val numConvert2:Int= num2!!.toInt()
                if(num1!=""&&num2!=""){
                    intent.putExtra("key_num1", num1);
                    intent.putExtra("key_num2", num2);
//открытие второго активити
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this,"repeat the input ", Toast.LENGTH_LONG).show();

                }
            }
            catch(e: Exception){
                Toast.makeText(this,"repeat the input ", Toast.LENGTH_LONG).show();

            }


        }
    }



}