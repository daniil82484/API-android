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
        val name: TextView = itemView.findViewById(R.id.name)
        val realname: TextView = itemView.findViewById(R.id.realname)
        val team: TextView = itemView.findViewById(R.id.team)
        val firstappearance: TextView = itemView.findViewById(R.id.firstappearance)
        val createdby: TextView = itemView.findViewById(R.id.createdby)
        val publisher: TextView = itemView.findViewById(R.id.publisher)
        val bio: TextView = itemView.findViewById(R.id.bio)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Link {
        val root = LayoutInflater.from(con).inflate(R.layout.item2, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        Glide.with(con).load(data[position].imageurl).into(holder.img)
        holder.name.setText(data[position].name)
        holder.realname.setText(data[position].realname)
        holder.team.setText(data[position].team)
        holder.firstappearance.setText(data[position].firstappearance)
        holder.createdby.setText(data[position].createdby)
        holder.publisher.setText(data[position].publisher)
        holder.bio.setText(data[position].bio)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}