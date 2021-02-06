package com.example.codelabs_practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton) // main.xmlのButtonView(id/rollButton)を呼び出す
        rollButton.setOnClickListener { rollDaice() } // rollButtonを押した際にrollDice関数が走る

        val countUpButton: Button = findViewById(R.id.countUpButton) // main.xmlのButton(id/countUpButton)を呼び出す
        countUpButton.setOnClickListener { plusOne() } // countUpButtonを押した際にplusOne関数が走る
    }

    private fun rollDaice() {
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.resultText)

        resultText.text = randomInt.toString()
//        Toast.makeText(this, "ボタンを押しました！", // ボタンを押すと指定したテキストが出る
//            Toast.LENGTH_SHORT).show() // 短い間の表示
    }

    private fun plusOne() {
        val resultText: TextView = findViewById(R.id.resultText)

        if (resultText.text == "Hello EveryOne!!") {
            resultText.text = "1"
        } else {
            var plusOneResult = resultText.text.toString().toInt() // 下のif文を使うために結果を一旦数字にする

            if (plusOneResult < 6) {
                plusOneResult++
                resultText.text = plusOneResult.toString() // 再び結果を文字列に戻す
            }
        }
    }
}