package com.ktl1.kotlinrecyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(
    private val fruits: List<Fruit>,
    private val clickListener: (Fruit) -> Unit // Unit mean this function have not return like Void
) :
    RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(fruits[position], clickListener)
    }

    override fun getItemCount(): Int {
        return fruits.size
    }

}

class MyViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(fruit: Fruit, clickListener: (Fruit) -> Unit) {
        val myTextView = view.findViewById<TextView>(R.id.textView)!!
        myTextView.text = fruit.name

        view.setOnClickListener {
            clickListener(fruit)
        }
    }
}