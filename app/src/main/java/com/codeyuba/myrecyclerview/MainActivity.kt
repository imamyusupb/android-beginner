package com.codeyuba.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    private fun showSelectedHero(hero:HeroesModel){
        Toast.makeText(this,"Kamu memilih " + hero.name, Toast.LENGTH_LONG).show()
    }

    private fun setMode(selectedMenu: Int) {
        when (selectedMenu) {
            R.id.action_list -> {
                supportActionBar?.title = "List Hero"
                showRecyclerList()
            }
            R.id.action_grid -> {
                supportActionBar?.title = "Grid Hero"
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                supportActionBar?.title = "Card Hero"
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

        listHeroAdapter.setOnItemClickCallback(object :ListHeroAdapter.OnItemClickCallback{
            override fun onItemClicked(data: HeroesModel) {
                showSelectedHero(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvHeroes.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridHeroAdapter(list)
        rvHeroes.adapter = gridHeroAdapter

        gridHeroAdapter.setOnItemClickCallback(object : GridHeroAdapter.OnItemClickCallback2 {
            override fun onItemClicked(data: HeroesModel) {
                showSelectedHero(data)
            }
        })
    }

    private fun showRecyclerCard() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        rvHeroes.adapter = CardviewHeroAdapter(list)
    }
}