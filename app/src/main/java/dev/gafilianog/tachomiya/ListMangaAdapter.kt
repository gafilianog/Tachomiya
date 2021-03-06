package dev.gafilianog.tachomiya

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMangaAdapter(private val listManga: ArrayList<Manga>) : RecyclerView.Adapter<ListMangaAdapter.ListMangaHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListMangaHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_manga, parent, false)
        return ListMangaHolder(view)
    }

    override fun onBindViewHolder(holder: ListMangaHolder, position: Int) {
        val manga = listManga[position]

        Glide.with(holder.itemView.context)
            .load(manga.mangaCover)
            .apply(RequestOptions())
            .into(holder.mangaCover)

        holder.tvTitle.text = manga.title
        holder.tvGenre.text = manga.genres

        val holderCtx = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(holderCtx, DetailActivity::class.java)
            moveDetail.putExtra("extra_cover", manga.mangaCover)
            moveDetail.putExtra("extra_title", manga.title)
            moveDetail.putExtra("extra_status", manga.status)
            moveDetail.putExtra("extra_author", manga.author)
            moveDetail.putExtra("extra_genres", manga.genres)
            moveDetail.putExtra("extra_synopsis", manga.synopsis)

            holderCtx.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listManga.size
    }

    inner class ListMangaHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_item_genre)
        var mangaCover: ImageView = itemView.findViewById(R.id.img_item_manga)
    }
}