package com.codeyuba.submisionbmaap.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codeyuba.submisionbmaap.R

class MotorDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motor_detail)
        val actionBar = supportActionBar
        actionBar?.title = "Detail Motor"
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val tvDetailName    : TextView = findViewById(R.id.tvDetailName)
        val tvTitleName     : TextView = findViewById(R.id.tvNameTitle)
        val imgPhoto        : ImageView= findViewById(R.id.imgDetailMotorcycle)
        val tvDesc          : TextView = findViewById(R.id.tvDetailDescription)
        val tvMach          : TextView = findViewById(R.id.tvDetailMachine)
        val tvTransm        : TextView = findViewById(R.id.tvDetailTransmision)
        val tvSeris         : TextView = findViewById(R.id.tvDetailSeries)
        val tvfuel          : TextView = findViewById(R.id.tvDetailFuel)
        val tvCopling       : TextView = findViewById(R.id.tvDetailCopling)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val timg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tDescription = intent.getStringExtra(EXTRA_DESCRIPTION)
        val tFuel = intent.getStringExtra(EXTRA_FUEL)
        val tMachine = intent.getStringExtra(EXTRA_MACHINE)
        val tTransmision = intent.getStringExtra(EXTRA_TRANSMISION)
        val tSeries = intent.getStringExtra(EXTRA_SERIES)
        val tCopling = intent.getStringExtra(EXTRA_COPLING)

        Glide.with(this)
            .load(timg)
            .apply(RequestOptions.overrideOf(220, 220))
            .into(imgPhoto)

        tvTitleName.text = tName
        tvDetailName.text = tName
        tvSeris.text = tSeries
        tvfuel.text = tFuel
        tvMach.text = tMachine
        tvTransm.text = tTransmision
        tvCopling.text = tCopling
        tvDesc.text = tDescription


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        const val EXTRA_NAME = "extra_data"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_MACHINE = "extra_machine"
        const val EXTRA_FUEL = "extra_fuel"
        const val EXTRA_TRANSMISION = "extra_transmision"
        const val EXTRA_SERIES = "extra_series"
        const val EXTRA_COPLING = "extra_copling"
        const val EXTRA_DESCRIPTION = "extra_description"

    }
}