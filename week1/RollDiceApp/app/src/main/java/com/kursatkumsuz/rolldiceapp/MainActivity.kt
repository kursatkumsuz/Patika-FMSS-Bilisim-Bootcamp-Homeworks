package com.kursatkumsuz.rolldiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kursatkumsuz.rolldiceapp.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // if button clicked, run rollDice function
        binding.rollButton.setOnClickListener {
            rollDice()
        }
    }

    // this function rolls dice by a random number
    private fun rollDice() {
        val firstRandomNum = Random().nextInt(6) + 1
        val secondRandomNum = Random().nextInt(6) + 1
        // set ImageResource by random number
        when (firstRandomNum) {
            1 -> binding.firstDieImage.setImageResource(R.drawable.ic_dice_1)
            2 -> binding.firstDieImage.setImageResource(R.drawable.ic_dice_2)
            3 -> binding.firstDieImage.setImageResource(R.drawable.ic_dice_3)
            4 -> binding.firstDieImage.setImageResource(R.drawable.ic_dice_4)
            5 -> binding.firstDieImage.setImageResource(R.drawable.ic_dice_5)
            else -> binding.firstDieImage.setImageResource(R.drawable.ic_dice_6)

        }
        // set ImageResource by random number
        when (secondRandomNum) {
            1 -> binding.secondDieImage.setImageResource(R.drawable.ic_dice_1)
            2 -> binding.secondDieImage.setImageResource(R.drawable.ic_dice_2)
            3 -> binding.secondDieImage.setImageResource(R.drawable.ic_dice_3)
            4 -> binding.secondDieImage.setImageResource(R.drawable.ic_dice_4)
            5 -> binding.secondDieImage.setImageResource(R.drawable.ic_dice_5)
            else -> binding.secondDieImage.setImageResource(R.drawable.ic_dice_6)
        }
        checkValueOfDice(firstRandomNum, secondRandomNum)
    }

    // this function checks dice by their values
    private fun checkValueOfDice(firstDiceNum: Int, secondDiceNum: Int) {
        if (firstDiceNum == secondDiceNum) {
            showToastMessage("Dice are same!")
        } else if (firstDiceNum == 6 && secondDiceNum == 6) {
            showToastMessage("Double six!")
        } else if (firstDiceNum == 1 && secondDiceNum == 1) {
            showToastMessage("Snake eyes!")
        } else {
            showToastMessage("Dice are $firstDiceNum and $secondDiceNum")
        }
    }

    // this function show toast message by given string value
    private fun showToastMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}