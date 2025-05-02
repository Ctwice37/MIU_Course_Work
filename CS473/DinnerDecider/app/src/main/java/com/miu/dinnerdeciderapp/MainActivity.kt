package com.miu.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var food: MutableList<String> = mutableListOf<String>("Grapes", "tomatoes", "Cheese", "Pasta");


        addFood.setOnClickListener {

            var foodInput = findViewById<EditText>(R.id.inputFood).text

            if(foodInput.isNotEmpty()){
            food.add(foodInput.toString())
            val toast = Toast.makeText(applicationContext, "${foodInput.toString()} has been added to list", Toast.LENGTH_SHORT)
            toast.show()
            foodInput.clear()
                }
        }

        decide.setOnClickListener{
            var s = food.size-1
            var ind : Int = (0..s).random()
            foodText.text = "${food[ind]}"
        }
    }
}