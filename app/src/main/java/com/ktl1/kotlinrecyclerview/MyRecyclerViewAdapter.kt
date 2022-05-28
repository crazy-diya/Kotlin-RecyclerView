package com.ktl1.kotlinrecyclerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(private val fruits:List<String>) : RecyclerView.Adapter<MyViewHolder>() {

//    val fruits = listOf<String>("Mango","Orange","Papaya","Apple","Grapes","Banana","Guava","Pear")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item, parent, false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.myTextView.setTextColor(Color.CYAN)
        holder.myTextView.text = fruits[position]
    }

    override fun getItemCount(): Int {
        return fruits.size
    }

}

class MyViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    val myTextView = view.findViewById<TextView>(R.id.textView)!!

}