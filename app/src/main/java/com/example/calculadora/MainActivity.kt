package com.example.calculadora

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var aux: String = ""
    var firstNumber: String = ""
    var secondNumber: String = ""
    var operationPressed: Boolean = false
    var operationType: Int = 0
    var equalsPressed: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewShow: TextView = findViewById<TextView>(R.id.textViewRespuesta)

        //Numeric buttons
        val bNum1: Button = findViewById<Button>(R.id.buttonN1)
        val bNum2: Button = findViewById<Button>(R.id.buttonN2)
        val bNum3: Button = findViewById<Button>(R.id.buttonN3)
        val bNum4: Button = findViewById<Button>(R.id.buttonN4)
        val bNum5: Button = findViewById<Button>(R.id.buttonN5)
        val bNum6: Button = findViewById<Button>(R.id.buttonN6)
        val bNum7: Button = findViewById<Button>(R.id.buttonN7)
        val bNum8: Button = findViewById<Button>(R.id.buttonN8)
        val bNum9: Button = findViewById<Button>(R.id.buttonN9)
        val bNum0: Button = findViewById<Button>(R.id.buttonN0)

        //Action buttons
        val bSum: Button = findViewById<Button>(R.id.buttonSum)
        val bSub: Button = findViewById<Button>(R.id.buttonSubtraction)
        val bMul: Button = findViewById<Button>(R.id.buttonMultiplication)
        val bDiv: Button = findViewById<Button>(R.id.buttonDivision)
        val bClean: Button = findViewById<Button>(R.id.buttonClean)
        val bEqual: Button = findViewById<Button>(R.id.buttonEquals)

        //Listeners for action buttons
        bSum.setOnClickListener{
            operationPressed = true
            operationType = 1
            textViewShow.text = ""
        }

        bSub.setOnClickListener{
            operationPressed = true
            operationType = 2
            textViewShow.text = ""
        }

        bMul.setOnClickListener{
            operationPressed = true
            operationType = 3
            textViewShow.text = ""
        }

        bDiv.setOnClickListener{
            operationPressed = true
            operationType = 4
            textViewShow.text = ""
        }

        bClean.setOnClickListener{
            if (operationPressed == false) {
                firstNumber = ""
                textViewShow.text = firstNumber
            }else {
                secondNumber = ""
                textViewShow.text = secondNumber
            }
        }

        bEqual.setOnClickListener{
            val result: Int
            if (operationPressed == true) {
                when (operationType) {
                    1 -> {
                        result = firstNumber.toInt() + secondNumber.toInt()
                        firstNumber = result.toString()
                        secondNumber = ""
                        textViewShow.text = result.toString()
                        operationPressed = false
                    }
                    2 -> {
                        result = firstNumber.toInt() - secondNumber.toInt()
                        firstNumber = result.toString()
                        secondNumber = ""
                        textViewShow.text = result.toString()
                        operationPressed = false
                    }
                    3 -> {
                        result = firstNumber.toInt() * secondNumber.toInt()
                        firstNumber = result.toString()
                        secondNumber = ""
                        textViewShow.text = result.toString()
                        operationPressed = false
                    }
                    4 -> {
                        result = firstNumber.toInt() / secondNumber.toInt()
                        firstNumber = result.toString()
                        secondNumber = ""
                        textViewShow.text = result.toString()
                        operationPressed = false
                    }
                    else -> { //Add message if necessary
                        print("Select an operation first")
                    }
                }
            }
        }

        //Listeners for numeric buttons
        bNum1.setOnClickListener {
            aux = bNum1.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewShow.text = firstNumber
            }else {
                secondNumber += aux
                textViewShow.text = secondNumber
            }
        }

        bNum2.setOnClickListener {
            aux = bNum2.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewShow.text = firstNumber
            }else {
                secondNumber += aux
                textViewShow.text = secondNumber
            }
        }

        bNum3.setOnClickListener {
            aux = bNum3.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewShow.text = firstNumber
            }else {
                secondNumber += aux
                textViewShow.text = secondNumber
            }
        }

        bNum4.setOnClickListener {
            aux = bNum4.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewShow.text = firstNumber
            }else {
                secondNumber += aux
                textViewShow.text = secondNumber
            }
        }

        bNum5.setOnClickListener {
            aux = bNum5.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewShow.text = firstNumber
            }else {
                secondNumber += aux
                textViewShow.text = secondNumber
            }
        }

        bNum6.setOnClickListener {
            aux = bNum6.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewShow.text = firstNumber
            }else {
                secondNumber += aux
                textViewShow.text = secondNumber
            }
        }

        bNum7.setOnClickListener {
            aux = bNum7.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewShow.text = firstNumber
            }else {
                secondNumber += aux
                textViewShow.text = secondNumber
            }
        }

        bNum8.setOnClickListener {
            aux = bNum8.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewShow.text = firstNumber
            }else {
                secondNumber += aux
                textViewShow.text = secondNumber
            }
        }

        bNum9.setOnClickListener {
            aux = bNum9.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewShow.text = firstNumber
            }else {
                secondNumber += aux
                textViewShow.text = secondNumber
            }
        }

        bNum0.setOnClickListener {
            aux = bNum0.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewShow.text = firstNumber
            }else {
                secondNumber += aux
                textViewShow.text = secondNumber
            }
        }

    }

    override fun onResume() {
        super.onResume()
        Log.d("Debug","onResume")
        if (operationPressed == false && firstNumber != "") {
            val text: TextView = findViewById(R.id.textViewRespuesta)
            firstNumber = text.text.toString()
        }
        if(operationPressed == true && secondNumber != "") {
            val text: TextView = findViewById(R.id.textViewRespuesta)
            secondNumber = text.toString()
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("Debug","onSaveInstanceState")
        Log.d("Debug",firstNumber)
    // Save the user's current game state.
        outState?.run {
            putString("result", firstNumber)
        }
    // Always call the superclass so it can save the view hierarchy.
        super.onSaveInstanceState(outState)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    // Always call the superclass so it can restore the view hierarchy.
        super.onRestoreInstanceState(savedInstanceState)
    // Restore state members from saved instance.
        savedInstanceState?.run {
            firstNumber = savedInstanceState.getString("result").toString()
            val textViewShow: TextView = findViewById<TextView>(R.id.textViewRespuesta)
            textViewShow.text=firstNumber
        }
    }

}