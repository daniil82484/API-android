package com.example.myapplicationtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class adapter2(val con:Context, val data: List<data_product>):RecyclerView.Adapter<adapter2.Link>(){
    class Link(itemView:View):RecyclerView.ViewHolder(itemView) {
        val title:TextView=itemView.findViewById(R.id.name)
        val description:TextView=itemView.findViewById(R.id.description)
        val brand:TextView=itemView.findViewById(R.id.brand)
        val price:TextView=itemView.findViewById(R.id.price)
        val category:TextView=itemView.findViewById(R.id.category)
        val thumbnail:ImageView=itemView.findViewById(R.id.thumbnail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.item2,parent,false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.title.setText(data[position].title)
        holder.description.setText(data[position].description)
        holder.brand.setText(data[position].brand)
        holder.price.setText(data[position].price + " $")
        holder.category.setText(data[position].category)
        Glide.with(con).load(data[position].thumbnail).into(holder.thumbnail)
    }

    override fun getItemCount(): Int {
        return 7 //data.size
    }
}