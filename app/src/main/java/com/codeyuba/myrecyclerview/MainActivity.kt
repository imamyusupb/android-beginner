package com.codeyuba.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codeyuba.myrecyclerview.adapter.CardviewHeroAdapter
import com.codeyuba.myrecyclerview.adapter.GridHeroAdapter
import com.codeyuba.myrecyclerview.adapter.ListHeroAdapter
import com.codeyuba.myrecyclerview.model.HeroesModel
import com.codeyuba.myrecyclerview.utils.HeroesData

class MainActivity : AppCompatActivity() {

    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<HeroesModel> = arrayListOf()
    var titles = "default"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       setActionBarTitle(titles)
        rvHeroes = findViewById(R.id.rvHeroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(HeroesData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMenu: Int) {
        when (selectedMenu) {
            R.id.action_list -> {
                titles = "List Hero"
                showRecyclerList()
            }
            R.id.action_grid -> {
                titles= "Grid Hero"
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                titles = "Card Hero"
                showRecyclerCard()
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvHeroes.adapter = listHeroAdapter

    }

    private fun showRecyclerGrid() {
        rvHeroes.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridHeroAdapter(list)
        rvHeroes.adapter = gridHeroAdapter
    }

    private fun showRecyclerCard() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        rvHeroes.adapter = CardviewHeroAdapter(list)
    }
}