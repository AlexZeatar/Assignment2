package com.example.assignment2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Another way of handling the click event, didn't know which one to use to I did them both
/*        getDinnerBtn.setOnClickListener{
            val randomIndex = Random.nextInt(listOfDinners.size);
            val randomDinner = listOfDinners[randomIndex]
            dinner.text = randomDinner
            confirmation.text = ""
        }
        addDinner.setOnClickListener {
            if(newDinner.text.toString() == "") {
                confirmation.text = "New Dinner Field Can't Be Empty, Please Write Your Food Type In The Text Box Below"
            } else {
                listOfDinners.add(newDinner.text.toString())
                dinner.text = newDinner.text
                confirmation.text = "Your New Food Has Been Added To Your Options:) !"
                newDinner.text.clear()
            }
        }*/
    }
    private var listOfDinners = mutableListOf( "Hamburger", "Pizza","Mexican", "American", "Chinese")

    fun getDinner(view: View){
        val randomIndex = Random.nextInt(listOfDinners.size);
        val randomDinner = listOfDinners[randomIndex]
        dinner.text = randomDinner
        confirmation.text = ""
    }

    fun addDinner(view: View){
        if(newDinner.text.toString() == "") {
            confirmation.text = "New Dinner Field Can't Be Empty, Please Write Your Food Type In The Text Box Below"
        } else {
            listOfDinners.add(newDinner.text.toString())
            dinner.text = newDinner.text
            confirmation.text = "Your New Food Has Been Added To Your Options:) !"
            newDinner.text.clear()
        }
    }
}