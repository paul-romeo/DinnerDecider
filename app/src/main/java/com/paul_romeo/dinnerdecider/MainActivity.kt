package com.paul_romeo.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonald's", "Barros Pizza")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // res/layout/activity_main.xml

        selectedFootTxt.text = "Burger King"

        decideButton.setOnClickListener() {
            val random = Random
            val randomFood = random.nextInt(foodList.count())
            selectedFootTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener() {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
            println(foodList)
        }
    }
}