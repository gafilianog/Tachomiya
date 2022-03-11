package dev.gafilianog.tachomiya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMangas: RecyclerView
    private var list: ArrayList<Manga> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Tachomiya)
        setContentView(R.layout.activity_main)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_nav)
        bottomNavigationView.selectedItemId = R.id.main_activity
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.main_activity -> true
                R.id.fragment_about -> {
                    startActivity(Intent(this, AboutActivity::class.java))
                    overridePendingTransition(0, 0)
                    finish()
                    true
                }
                else -> false
            }
        }

        rvMangas = findViewById(R.id.rv_mangas)
        rvMangas.setHasFixedSize(true)

        list.addAll(MangasData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvMangas.layoutManager = LinearLayoutManager(this)
        val listMangaAdapter = ListMangaAdapter(list)
        rvMangas.adapter = listMangaAdapter
    }
}