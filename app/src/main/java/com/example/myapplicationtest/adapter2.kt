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
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.item3,parent,false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.title.setText(data[position].title)
    }

    override fun getItemCount(): Int {
        return 3 //data.size
    }
}