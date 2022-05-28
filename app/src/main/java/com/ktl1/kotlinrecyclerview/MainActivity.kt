package com.ktl1.kotlinrecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    private val fruits = listOf<String>("Mango","Orange","Papaya","Apple","Grapes","Banana","Guava","Pear")

    private val fruits = listOf<Fruit>(
        Fruit("Mango", "Roshel"),
        Fruit("Orange", "Sunil"),
        Fruit("Papaya", "Vikum"),
        Fruit("Apple", "Sadun"),
        Fruit("Grapes", "Ruwan"),
        Fruit("Banana", "Ajith"),
        Fruit("Guava", "Kamal"),
        Fruit("Pear", "Roshel"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setBackgroundColor(Color.BLUE)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter =
            MyRecyclerViewAdapter(fruits) { selectedItem: Fruit -> // function pass using the lambda expression
                listItemClick(selectedItem)
            }
    }


    private fun listItemClick(fruit: Fruit) {
        Toast.makeText(
            this@MainActivity,
            "Selected fruit name is : ${fruit.name}",
            Toast.LENGTH_LONG
        ).show()
    }


}