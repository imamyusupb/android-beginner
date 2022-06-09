package com.codeyuba.myrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codeyuba.myrecyclerview.R
import com.codeyuba.myrecyclerview.model.HeroesModel

class GridHeroAdapter(private var list :ArrayList<HeroesModel>):RecyclerView.Adapter<GridHeroAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback2


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback2) {
        this.onItemClickCallback = onItemClickCallback
    }


    interface OnItemClickCallback2 {
        fun onItemClicked(data:HeroesModel)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_heroes,parent,false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(list[position].photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(list[holder.adapterPosition]) }
    }


    override fun getItemCount(): Int {
     return  list.size
    }


    inner class GridViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imgPhoto :ImageView = view.findViewById(R.id.img_item_photo)
    }

}