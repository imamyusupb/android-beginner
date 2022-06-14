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
        val motor = list[position]

        Glide.with(holder.itemView.context)
            .load(motor.photo)
            .apply(RequestOptions())
            .into(holder.imgMotor)

        holder.tvName.text = motor.name
        holder.tvDesciprtion.text = motor.description

        val mcontext =  holder.itemView.context
        holder.itemView.setOnClickListener {
            val intentDetail = Intent(mcontext,MotorDetailActivity::class.java)
            intentDetail.putExtra(MotorDetailActivity.EXTRA_NAME,motor.name)
            intentDetail.putExtra(MotorDetailActivity.EXTRA_PHOTO,motor.photo)
            intentDetail.putExtra(MotorDetailActivity.EXTRA_DESCRIPTION,motor.description)
            intentDetail.putExtra(MotorDetailActivity.EXTRA_FUEL,motor.fuel)
            intentDetail.putExtra(MotorDetailActivity.EXTRA_MACHINE,motor.machine)
            intentDetail.putExtra(MotorDetailActivity.EXTRA_TRANSMISION,motor.transmision)
            intentDetail.putExtra(MotorDetailActivity.EXTRA_SERIES,motor.series)
            intentDetail.putExtra(MotorDetailActivity.EXTRA_COPLING,motor.coplingType)


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

