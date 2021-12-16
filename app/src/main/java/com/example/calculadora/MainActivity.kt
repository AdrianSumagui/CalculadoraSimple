package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clear.setOnClickListener {

            input.text = ""
            output.text = ""

        }

        bracketLeft.setOnClickListener {

                input.text = addInputText("(")

        }

        bracketRight.setOnClickListener {

            input.text = addInputText(")")

        }

        division.setOnClickListener {

            input.text = addInputText("÷")

        }

        number7.setOnClickListener {

            input.text = addInputText("7")

        }

        number8.setOnClickListener {

            input.text = addInputText("8")

        }

        number9.setOnClickListener {

            input.text = addInputText("9")

        }

        multiply.setOnClickListener {

            input.text = addInputText("×")

        }

        number4.setOnClickListener {

            input.text = addInputText("4")

        }

        number5.setOnClickListener {

            input.text = addInputText("5")

        }

        number6.setOnClickListener {

            input.text = addInputText("6")

        }

        subtraction.setOnClickListener {

            input.text = addInputText("-")

        }

        number1.setOnClickListener {

            input.text = addInputText("1")

        }

        number2.setOnClickListener {

            input.text = addInputText("2")

        }

        number3.setOnClickListener {

            input.text = addInputText("3")

        }

        addition.setOnClickListener {

            input.text = addInputText("+")

        }

        number0.setOnClickListener {

            input.text = addInputText("0")

        }

        dot.setOnClickListener {

            input.text = addInputText(".")

        }

        equals.setOnClickListener {

            // Función para calcular el resultado.

        }


    }

    fun addInputText(buttonValue : String) : String {

        return "${input.text}$buttonValue"

    }

}