package com.example.myapplicationtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class adapter(val con: Context, val data:List<data_movie>): RecyclerView.Adapter<adapter.Link>(){
    class Link(itemView: View): RecyclerView.ViewHolder(itemView) {
        val img: ImageView =  itemView.findViewById(R.id.img)
        //val bio: TextView = itemView.findViewById(R.id.bio)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.item, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        Glide.with(con).load(data[position].imageurl).into(holder.img)
        //holder.bio.setText(data[position].bio)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}