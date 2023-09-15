package com.example.calculadora

import android.media.VolumeShaper.Operation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

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

        val textViewMuestra: TextView = findViewById<TextView>(R.id.textViewRespuesta)

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
            textViewMuestra.text = ""
        }

        bSub.setOnClickListener{
            operationPressed = true
            operationType = 2
            textViewMuestra.text = ""
        }

        bMul.setOnClickListener{
            operationPressed = true
            operationType = 3
            textViewMuestra.text = ""
        }

        bDiv.setOnClickListener{
            operationPressed = true
            operationType = 4
            textViewMuestra.text = ""
        }

        bClean.setOnClickListener{
            if (operationPressed == false) {
                firstNumber = ""
                textViewMuestra.text = firstNumber
            }else {
                secondNumber = ""
                textViewMuestra.text = secondNumber
            }
        }

        bEqual.setOnClickListener{
            var result: Int = 0
            if (operationPressed == true) {
                when (operationType) {
                    1 -> {
                        result = firstNumber.toInt() + secondNumber.toInt()
                        firstNumber = result.toString()
                        secondNumber = ""
                        textViewMuestra.text = result.toString()
                        operationPressed = false
                    }
                    2 -> {
                        result = firstNumber.toInt() - secondNumber.toInt()
                        firstNumber = result.toString()
                        secondNumber = ""
                        textViewMuestra.text = result.toString()
                        operationPressed = false
                    }
                    3 -> {
                        result = firstNumber.toInt() * secondNumber.toInt()
                        firstNumber = result.toString()
                        secondNumber = ""
                        textViewMuestra.text = result.toString()
                        operationPressed = false
                    }
                    4 -> {
                        result = firstNumber.toInt() / secondNumber.toInt()
                        firstNumber = result.toString()
                        secondNumber = ""
                        textViewMuestra.text = result.toString()
                        operationPressed = false
                    }
                    else -> { //Add message if necessary
                    }
                }
            }
        }

        //Listeners for numeric buttons
        bNum1.setOnClickListener {
            aux = bNum1.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewMuestra.text = firstNumber
            }else {
                secondNumber += aux
                textViewMuestra.text = secondNumber
            }
        }

        bNum2.setOnClickListener {
            aux = bNum2.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewMuestra.text = firstNumber
            }else {
                secondNumber += aux
                textViewMuestra.text = secondNumber
            }
        }

        bNum3.setOnClickListener {
            aux = bNum3.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewMuestra.text = firstNumber
            }else {
                secondNumber += aux
                textViewMuestra.text = secondNumber
            }
        }

        bNum4.setOnClickListener {
            aux = bNum4.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewMuestra.text = firstNumber
            }else {
                secondNumber += aux
                textViewMuestra.text = secondNumber
            }
        }

        bNum5.setOnClickListener {
            aux = bNum5.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewMuestra.text = firstNumber
            }else {
                secondNumber += aux
                textViewMuestra.text = secondNumber
            }
        }

        bNum6.setOnClickListener {
            aux = bNum6.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewMuestra.text = firstNumber
            }else {
                secondNumber += aux
                textViewMuestra.text = secondNumber
            }
        }

        bNum7.setOnClickListener {
            aux = bNum7.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewMuestra.text = firstNumber
            }else {
                secondNumber += aux
                textViewMuestra.text = secondNumber
            }
        }

        bNum8.setOnClickListener {
            aux = bNum8.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewMuestra.text = firstNumber
            }else {
                secondNumber += aux
                textViewMuestra.text = secondNumber
            }
        }

        bNum9.setOnClickListener {
            aux = bNum9.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewMuestra.text = firstNumber
            }else {
                secondNumber += aux
                textViewMuestra.text = secondNumber
            }
        }

        bNum0.setOnClickListener {
            aux = bNum0.text.toString()

            if (operationPressed == false) {
                firstNumber += aux
                textViewMuestra.text = firstNumber
            }else {
                secondNumber += aux
                textViewMuestra.text = secondNumber
            }
        }

    }

    override fun onResume() {
        super.onResume()
      //  if (operationPressed == false) {
      //      val text: TextView = findViewById(R.id.textViewRespuesta)
      //      firstNumber = text.toString()
      //  }else {
      //      val text: TextView = findViewById(R.id.textViewRespuesta)
      //      secondNumber = text.toString()
      //  }
    }
}