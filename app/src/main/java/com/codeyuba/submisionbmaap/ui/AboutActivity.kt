package com.codeyuba.submisionbmaap.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codeyuba.submisionbmaap.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionBar = supportActionBar
        actionBar!!.title = "About"
        actionBar?.setDisplayHomeAsUpEnabled(true)


        val image :ImageView = findViewById(R.id.img_photo)
        val photoMe  = R.drawable.foto_ijazah_removebg_preview

        Glide.with(this)
            .load(photoMe)
            .apply(RequestOptions().override(120,120))
            .into(image)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}