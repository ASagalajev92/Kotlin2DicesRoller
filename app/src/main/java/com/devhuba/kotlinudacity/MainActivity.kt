package com.devhuba.kotlinudacity

import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var firstDiceImage: ImageView
    lateinit var secondDiceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vRollButton = findViewById<Button>(R.id.button_roll)
        vRollButton.setOnClickListener {
            rollDice()
        }
        firstDiceImage = findViewById(R.id.image_view_dice)
        secondDiceImage = findViewById(R.id.image_view_dice2)
    }

    private fun rollDice() {

        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val drawableResource = when (randomInt1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (randomInt2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        firstDiceImage.setImageResource(drawableResource)
        secondDiceImage.setImageResource(drawableResource2)

    }
}
