package com.ramarai.p5rcompendium

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ramarai.p5rcompendium.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvPersonas: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(1500)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvPersonas.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
        rvPersonas = binding.rvPersonas
        showRecyclerList()

    }

    private fun showRecyclerList() {
        val allPersonas = personaByUsers.flatMap {it.value}
        val listPersonaAdapter = ListPersonaAdapter(allPersonas)
        rvPersonas.adapter = listPersonaAdapter
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_list -> {
                rvPersonas.layoutManager = LinearLayoutManager(this)
            }
            R.id.action_grid -> {
                rvPersonas.layoutManager = GridLayoutManager(this, 2)
            }
            R.id.about_activity -> {
                val intentAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intentAbout)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}