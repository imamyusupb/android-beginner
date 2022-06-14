package com.codeyuba.submisionbmaap.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codeyuba.submisionbmaap.R

class MotorDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motor_detail)
        val actionBar  = supportActionBar
        actionBar?.title = "Detail Motor"
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val tvDetailName :TextView = findViewById(R.id.tvDetailName)
        val tvTitleName :TextView = findViewById(R.id.tvNameTitle)
        val imgPhoto : ImageView = findViewById(R.id.imgDetailMotorcycle)

        val tName =intent.getStringExtra(EXTRA_NAME)
        val timg = intent.getStringExtra(EXTRA_PHOTO)


        tvDetailName.text = tName

        Glide.with(this)
            .load(timg)
            .apply(RequestOptions.overrideOf(220,220))
            .into(imgPhoto)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESC  = "extra_desc"
    }
}