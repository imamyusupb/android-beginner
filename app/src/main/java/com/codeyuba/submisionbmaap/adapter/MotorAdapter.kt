package com.codeyuba.submisionbmaap.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codeyuba.submisionbmaap.R
import com.codeyuba.submisionbmaap.model.Motor
import com.codeyuba.submisionbmaap.ui.MotorDetailActivity

class MotorAdapter(var list: ArrayList<Motor>) :
    RecyclerView.Adapter<MotorAdapter.MotorViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MotorAdapter.MotorViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_motorcycle_list, parent, false)
        return MotorViewHolder(view)
    }

    override fun onBindViewHolder(holder: MotorAdapter.MotorViewHolder, position: Int) {
        val (name,photo,series,fuel,machine,transmision,copling,description)= list[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgMotor)

        holder.tvName.text = name
        holder.tvDesciprtion.text = description

        val mcontext =  holder.itemView.context
        holder.itemView.setOnClickListener {
            val intentDetail = Intent(mcontext,MotorDetailActivity::class.java)
            intentDetail.putExtra(MotorDetailActivity.EXTRA_NAME,name)
            intentDetail.putExtra(MotorDetailActivity.EXTRA_PHOTO,photo)
            mcontext.startActivity(intentDetail)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MotorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tvName)
        var tvDesciprtion: TextView = itemView.findViewById(R.id.tvDescription)
        var imgMotor: ImageView = itemView.findViewById(R.id.imgMotorcycle)

    }
}