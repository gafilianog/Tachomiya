package dev.gafilianog.tachomiya

object MangasData {
    private val mangaTitles = arrayOf(
        "The Neighboring Alya-san who Sometimes Acts Affectionate and Murmuring in Russian",
        "Attack on Titan",
        "Rent-A-Girlfriend",
        "My Youth Romantic Comedy Is Wrong, As I Expected",
        "Days with my Step Sister",
        "Classroom of the Elite",
        "Komi Can't Communicate",
        "Medaka Kuroiwa is Impervious to My Charms",
        "My Dress-Up Darling",
        "Eighty Six"
    )

    private val mangaGenres = arrayOf(
        "Genres: Romance, Comedy, School Life, Slice of Life",
        "Genres: Action, Drama, Fantasy, Mystery",
        "Genres: Romance, Comedy, Harem, Drama, School life, Slice of Life",
        "Genres: Comedy, Drama, Romance, Slice of Life",
        "Genres: Drama, Romance, School Life, Slice of Life",
        "Genres: Drama, Psychological, School Life, Slice of Life",
        "Genres: Romance, Comedy, School Life, Slice of Life",
        "Genres: Romance, Comedy, Harem, School Life, Slice of Life",
        "Genres: Romance, Comedy, Cross-dressing, School Life, Slice of Life, Gyaru",
        "Genres: Action, Drama, Sci-Fi"
    )

    private val mangaCover = intArrayOf(
        R.drawable.blyat_san,
        R.drawable.kang_rumbling,
        R.drawable.kanokari,
        R.drawable.yahahallost,
        R.drawable.saki_saki,
        R.drawable.rooftop_legend,
        R.drawable.komi_san,
        R.drawable.kuroiwa_medaka,
        R.drawable.marin_chwan,
        R.drawable.lena_wangy
    )

    val listData: ArrayList<Manga> get() {
        val list = arrayListOf<Manga>()
        for (pos in mangaTitles.indices) {
            val manga = Manga()
            manga.title = mangaTitles[pos]
            manga.genres = mangaGenres[pos]
            manga.mangaCover = mangaCover[pos]
            list.add(manga)
        }
        return list
    }
}