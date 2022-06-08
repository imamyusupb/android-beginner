package com.codeyuba.myrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codeyuba.myrecyclerview.R
import com.codeyuba.myrecyclerview.model.HeroesModel

class CardviewHeroAdapter(var list: ArrayList<HeroesModel>) :
    RecyclerView.Adapter<CardviewHeroAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardview_heroes, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(list[position].photo)
            .apply { RequestOptions().override(350, 550) }
            .into(holder.imgPhoto)

        holder.tvName.text = list[position].name
        holder.tvDetail.text = list[position].detail

        holder.btnFavorite.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Favorite " + list[position].name,
                Toast.LENGTH_LONG
            ).show()
        }

        holder.btnShare.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Share " + list[position].name,
                Toast.LENGTH_LONG
            ).show()
        }

        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "you has clicked " + list[position].name,
                Toast.LENGTH_LONG
            ).show()
        }


    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class CardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }
}