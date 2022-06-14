package com.codeyuba.submisionbmaap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codeyuba.submisionbmaap.adapter.MotorAdapter
import com.codeyuba.submisionbmaap.model.Motor
import com.codeyuba.submisionbmaap.ui.AboutActivity
import com.codeyuba.submisionbmaap.utils.MotorcycleData

class MainActivity : AppCompatActivity() {

    private lateinit var rvMotor: RecyclerView
    private var list: ArrayList<Motor> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "Honda Motor"

        rvMotor = findViewById(R.id.rv_motor)
        rvMotor.setHasFixedSize(true)

        list.addAll(MotorcycleData.listData)
        showRecyclerList()

    }


    private fun showRecyclerList() {
        rvMotor.layoutManager = LinearLayoutManager(this)
        val motorAdapter = MotorAdapter(list)
        rvMotor.adapter = motorAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_app,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode:Int){
        when(selectedMode) {
            R.id.action_about -> {
                val intent = Intent(this,AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}