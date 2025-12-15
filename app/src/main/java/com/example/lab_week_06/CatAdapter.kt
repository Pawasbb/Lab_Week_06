package com.example.lab_week_06

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CatAdapter(private val catList: List<Cat>) :
    RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    class CatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgCat: ImageView = itemView.findViewById(R.id.imgCat)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvDesc: TextView = itemView.findViewById(R.id.tvDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return CatViewHolder(view)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val cat = catList[position]
        holder.tvName.text = cat.name
        holder.tvDesc.text = cat.description
        holder.imgCat.setImageResource(cat.image)
    }

    override fun getItemCount(): Int = catList.size
}
