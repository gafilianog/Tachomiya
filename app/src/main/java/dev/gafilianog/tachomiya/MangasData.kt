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

    private val mangaStatus = arrayOf(
        "Ongoing",
        "Completed",
        "Ongoing",
        "Completed",
        "Ongoing",
        "Ongoing",
        "Ongoing",
        "Ongoing",
        "Ongoing",
        "Ongoing",
    )

    private val mangaAuthor = arrayOf(
        "Sunsunsun",
        "Isayama Hajime",
        "Miyajima Reiji",
        "Wataru Watari",
        "Mikawa Ghost",
        "Kinugasa Shougo",
        "Oda Tomohito",
        "Kuze Ran",
        "Fukuda Shinichi",
        "Asato Asato"
    )

    private val mangaSynopsis = arrayOf(
        "Alisa Mikhailovna Kujo, who attends a private school, Seirei Gakuen, is a high school girl with silver hair who looks so beautiful that anyone can turn around if she walks. The main character, Masachika Kuze, who sits next to Alisa, is an unmotivated student who just sleeps at school, and she always complains. For some reason, such Alisa sometimes speaks in Russian. However, Alisa did not know that Masachika could understand Russian as well in the native level.",
        "Several hundred years ago, humans were nearly exterminated by Titans. Titans are typically several stories tall, seem to have no intelligence, devour human beings and, worst of all, seem to do it for pleasure rather than as a food source. A small percentage of humanity survived by walling themselves in a city protected by extremely high walls, even taller than the biggest of Titans. Flash forward to the present and the southern district of Shinganshina has not seen a Titan in over 100 years.\n\nTeenage boy Eren and his foster sister Mikasa witness something horrific as one of the outer district walls is damaged by a 60 meter (196.85 feet) Titan causing a breach in the wall. As the smaller Titans flood the city, the two kids watch in horror the tragic events that follow, as the Titans devour people unimpeded.\n\nEren vows that he will wipe out every single Titan and take revenge for all of mankind.",
        "Kazuya Kinoshita is a 20-year-old college student who has a wonderful girlfriend: the bright and sunny Mami Nanami. But suddenly, he doesn't. Without warning, Mami breaks up with him, leaving him utterly heartbroken and lonely. Seeking to soothe the pain, he hires a rental girlfriend through an online app. His partner is Chizuru Mizuhara, who through her unparalleled beauty and cute demeanor, manages to gain Kazuya's affection.\n\nBut after reading similar experiences other customers had had with Chizuru, Kazuya believes her warm smile and caring personality were all just an act to toy with his heart, and he rates her poorly. Aggravated, Chizuru lambastes him for his shameless hypocrisy, revealing her true pert and hot-tempered self. This one-sided exchange is cut short, however, when Kazuya finds out that his grandmother has collapsed.\n\nThey dash toward the hospital and find Kazuya's grandmother already in good condition. Baffled by Chizuru's presence, she asks who this girl might be. On impulse, Kazuya promptly declares that they are lovers, forcing Chizuru to play the part. But with Kazuya still hung up on his previous relationship with Mami, how long can this difficult client and reluctant rental girlfriend keep up their act?",
        "Hachiman Hikigaya is an apathetic high school student with narcissistic and semi-nihilistic tendencies. He firmly believes that joyful youth is nothing but a farce, and everyone who says otherwise is just lying to themselves.\n\nIn a novel punishment for writing an essay mocking modern social relationships, Hachiman's teacher forces him to join the Volunteer Service Club, a club that aims to extend a helping hand to any student who seeks their support in achieving their goals. With the only other club member being the beautiful ice queen Yukino Yukinoshita, Hachiman finds himself on the front line of other people's problems—a place he never dreamed he would be. As Hachiman and Yukino use their wits to solve many students' problems, will Hachiman's rotten view of society prove to be a hindrance or a tool he can use to his advantage?",
        "From classmates to brother and sister, living under the same roof.\n\nAfter his father’s remarriage, Asamura Yuuta ends up getting a new stepsister, coincidentally the number one beauty of the school year, Ayase Saki. Having learned important values when it comes to man-woman relationships through the previous ones of their parents, they promise each other not to be too close, not to be too opposing, and to merely keep a vague and comfortable distance.\n\nOn one hand, Saki, who has worked in solitude for the sake of her family, doesn’t know how to properly rely on others, whereas Yuta is unsure of how to really treat her. Standing on fairly equal ground, these two slowly learn the comfortable sensation of living together.\n\nTheir relationship slowly evolves from being strangers the more the days pass. Eventually, this could end up in a story about love for all we know.",
        "On the surface, Koudo Ikusei Senior High School is a utopia. The students enjoy an unparalleled amount of freedom, and it is ranked highly in Japan. However, the reality is less than ideal. Four classes, A through D, are ranked in order of merit, and only the top classes receive favorable treatment.\n\nKiyotaka Ayanokouji is a student of Class D, where the school dumps its worst. There he meets the unsociable Suzune Horikita, who believes she was placed in Class D by mistake and desires to climb all the way to Class A, and the seemingly amicable class idol Kikyou Kushida, whose aim is to make as many friends as possible.\n\nWhile class membership is permanent, class rankings are not; students in lower ranked classes can rise in rankings if they score better than those in the top ones. Additionally, in Class D, there are no bars on what methods can be used to get ahead. In this cutthroat school, can they prevail against the odds and reach the top?",
        "Hitohito Tadano is an ordinary boy who heads into his first day of high school with a clear plan: to avoid trouble and do his best to blend in with others. Unfortunately, he fails right away when he takes the seat beside the school's madonna—Shouko Komi. His peers now recognize him as someone to eliminate for a chance to sit next to the most beautiful girl in class.\n\nGorgeous and graceful with long, dark hair, Komi is universally adored and immensely popular despite her mysterious persona. However, unbeknownst to everyone, she has crippling anxiety and a communication disorder which prevents her from wholeheartedly socializing with her classmates.\n\nWhen left alone in the classroom, a chain of events forces Komi to interact with Tadano through writing on the blackboard, as if in a one-way conversation. Being the first person to realize she cannot communicate properly, Tadano picks up the chalk and begins to write as well. He eventually discovers that Komi's goal is to make one hundred friends during her time in high school. To this end, he decides to lend her a helping hand, thus also becoming her first-ever friend.",
        "To say that Mona Kawai is cute would be an understatement; she is breathtaking in every single way, and she knows it. At school, she is fawned over by boys and girls alike, and she graciously welcomes it all as a natural reaction to her irresistible charm. That is, until she comes across Medaka Kuroiwa, the boy who is seemingly immune to her overwhelming charisma. She goes out of her way to talk to him and even dials her cuteness up a notch, but no matter what she tries, Mona cannot wipe the scowl off Kuroiwa's face.\n\nBacked into a corner, Mona is forced to use the most devastating weapon in her arsenal: her physical allure. Such drastic measures would leave other boys foaming at their mouths, but Kuroiwa remains unfazed by her attempts. Little does Mona know that the only reason Kuroiwa just barely abstains from succumbing to her charms is because he is training to be a monk and thus trying his best not to be held down by worldly pleasures. As Mona goes all out to entice Kuroiwa, she fails to realize that his unintentional chivalry might just make her fall for him instead.",
        "High school student Wakana Gojou spends his days perfecting the art of making hina dolls, hoping to eventually reach his grandfather's level of expertise. While his fellow teenagers busy themselves with pop culture, Gojou finds bliss in sewing clothes for his dolls. Nonetheless, he goes to great lengths to keep his unique hobby a secret, as he believes that he would be ridiculed were it revealed.\n\nEnter Marin Kitagawa, an extraordinarily pretty girl whose confidence and poise are in stark contrast to Gojou's meekness. It would defy common sense for the friendless Gojou to mix with the likes of Kitagawa, who is always surrounded by her peers. However, the unimaginable happens when Kitagawa discovers Gojou's prowess with a sewing machine and brightly confesses to him about her own hobby: cosplay. Because her sewing skills are pitiable, she decides to enlist his help.\n\nAs Gojou and Kitagawa work together on one cosplay outfit after another, they cannot help but grow close—even though their lives are worlds apart.",
        "According to the Republic of San Magnolia, their ongoing war against the Giadian Empire has no casualties—however, that is mere propaganda. While the silver-haired Alba of the Republic's eighty-five sectors live safely behind protective walls, those of different appearances are interned in a secret eighty-sixth faction. Known within the military as the Eighty-Six, they are forced to fight against the Empire's autonomous Legion under the command of the Republican \"Handlers.\"\n\nVladilena Milizé is assigned to the Spearhead squadron to replace their previous Handler. Shunned by her peers for being a fellow Eighty-Six supporter, she continues to fight against their inhumane discrimination. Shinei Nouzen is the captain of the Spearhead squadron. Infamous for being the sole survivor of every squadron he's been in, he insists on shouldering the names and wishes of his fallen comrades. When the fates of these young souls from two different worlds collide, will it ignite the spark that lights their path to salvation, or will they burn themselves in the flames of despair?"
    )

    val listData: ArrayList<Manga> get() {
        val list = arrayListOf<Manga>()
        for (pos in mangaTitles.indices) {
            val manga = Manga()
            manga.title = mangaTitles[pos]
            manga.genres = mangaGenres[pos]
            manga.mangaCover = mangaCover[pos]
            manga.status = mangaStatus[pos]
            manga.author = mangaAuthor[pos]
            manga.synopsis = mangaSynopsis[pos]
            list.add(manga)
        }
        return list
    }
}