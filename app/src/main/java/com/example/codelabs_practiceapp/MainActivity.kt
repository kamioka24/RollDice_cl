package com.example.RollDice_cl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1 : ImageView // nullable を宣言する必要がないようにしている？(コードラボに書いてあった)
    lateinit var diceImage2 : ImageView // 初期化のタイミングをonCreateまで遅らせる。必ず var で宣言しなくてはならない


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton) // main.xmlのButtonView(id/rollButton)を呼び出す
        rollButton.setOnClickListener { rollDaice() } // rollButtonを押した際にrollDice関数が走る

        diceImage1 = findViewById(R.id.diceImage1)
        diceImage2 = findViewById(R.id.diceImage2)

//        val countUpButton: Button = findViewById(R.id.countUpButton)
//        countUpButton.setOnClickListener { plusOne() }

//        val resetButton: Button = findViewById(R.id.resetButton)
//        resetButton.setOnClickListener { reset() }
    }

    private fun rollDaice() {
        diceImage1.setImageResource(getRandomDiceImage()) // diceImage1の更新
        diceImage2.setImageResource(getRandomDiceImage()) // diceImage2の更新
    }

    private fun getRandomDiceImage(): Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

//        Toast.makeText(this, "サイコロを振ります！", // ボタンを押すと指定したテキストが出る
//            Toast.LENGTH_SHORT).show() // 短い間の表示
    }

// --------------------【カウントアップで使ったコード】--------------------//

//    private fun plusOne() {
//        val resultText: TextView = findViewById(R.id.resultText)
////        Toast.makeText(this, "1を足します！",  Toast.LENGTH_SHORT).show()
//
//        if (resultText.text == "Hello EveryOne!!") {
//            resultText.text = "1"
//        } else {
//            var plusOneResult = resultText.text.toString().toInt() // 下のif文を使うために結果を一旦数字にする
//
//            if (plusOneResult < 6) {
//                plusOneResult++
//                resultText.text = plusOneResult.toString() // 再び結果を文字列に戻す
//            } else {
//                resultText.text = "0" // 6のときは0にする
//            }
//        }
//    }

// --------------------【カウントアップで使ったコード】--------------------//

// --------------------【リセットで使ったコード】--------------------//

//    private fun reset() {
//        val resultText: TextView = findViewById(R.id.resultText)
//        resultText.text = "0"
//        Toast.makeText(this, "リセットされました。", Toast.LENGTH_SHORT).show()
//    }

// --------------------【リセットで使ったコード】--------------------//
}