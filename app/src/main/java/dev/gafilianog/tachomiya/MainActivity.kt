package dev.gafilianog.tachomiya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMangas: RecyclerView
    private var list: ArrayList<Manga> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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