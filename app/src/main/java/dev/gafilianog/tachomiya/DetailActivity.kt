package dev.gafilianog.tachomiya

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgCover: ImageView = findViewById(R.id.manga_cover_detail)
        val tvTitle: TextView = findViewById(R.id.tv_detail_title)
        val tvStatus: TextView = findViewById(R.id.tv_detail_status)
        val tvAuthor: TextView = findViewById(R.id.tv_detail_author)
        val tvGenres: TextView = findViewById(R.id.tv_detail_genre)
        val tvSynopsis: TextView = findViewById(R.id.tv_detail_synopsis)

        val mangaCover = intent.getIntExtra("extra_cover", 0)
        val mangaTitle = intent.getStringExtra("extra_title")
        val mangaStatus = intent.getStringExtra("extra_status")
        val mangaAuthor = intent.getStringExtra("extra_author")
        val mangaGenres = intent.getStringExtra("extra_genres")
        val mangaSynopsis = intent.getStringExtra("extra_synopsis")

        Glide.with(this)
            .load(mangaCover)
            .apply(RequestOptions())
            .into(imgCover)

        tvTitle.text = mangaTitle
        tvStatus.text = "Status: $mangaStatus"
        tvAuthor.text = "Author: $mangaAuthor"
        tvGenres.text = "Genres: $mangaGenres"
        tvSynopsis.text = mangaSynopsis

        val detailAppBar: androidx.appcompat.widget.Toolbar = findViewById(R.id.detail_app_bar)
        setSupportActionBar(detailAppBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}