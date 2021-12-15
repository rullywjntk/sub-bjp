package com.rully.moovie.utils

import com.rully.moovie.R
import com.rully.moovie.data.FilmEntity

object DataDummy {

    fun generateDummyMovie(): List<FilmEntity> {

        val movies = ArrayList<FilmEntity>()

        movies.add(
            FilmEntity(
                "1",
                "A Star Is Born",
                "19 Oktober 2018",
                R.drawable.poster_a_start_is_born,
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons."
            )
        )
        movies.add(
            FilmEntity(
                "2",
                "Alita",
                "5 Februari 2019",
                R.drawable.poster_alita,
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past."
            )
        )
        movies.add(
            FilmEntity(
                "3",
                "Aquaman",
                "26 Desember 2018",
                R.drawable.poster_aquaman,
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne."
            )
        )
        movies.add(
            FilmEntity(
                "4", "Bohemian Rhapsody",
                "30 Oktober 2018",
                R.drawable.poster_bohemian,
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."
            )
        )
        movies.add(
            FilmEntity(
                "5",
                "Cold Pursuit",
                "08 Februari 2019",
                R.drawable.poster_cold_persuit,
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution."
            )
        )
        movies.add(
            FilmEntity(
                "6",
                "Creed",
                "25 November 2015",
                R.drawable.poster_creed,
                "The former World Heavyweight Champion Rocky Balboa serves as a trainer and mentor to Adonis Johnson, the son of his late friend and former rival Apollo Creed."
            )
        )
        movies.add(
            FilmEntity(
                "7",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "16 November 2018",
                R.drawable.poster_crimes,
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world."
            )
        )
        movies.add(
            FilmEntity(
                "8",
                "Glass",
                "18 Januari 2019",
                R.drawable.poster_glass,
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men."
            )
        )
        movies.add(
            FilmEntity(
                "9",
                "How to Train Your Dragon: The Hidden World",
                "09 Januari 2019",
                R.drawable.poster_how_to_train,
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind."
            )
        )
        movies.add(
            FilmEntity(
                "10",
                "Avengers: Infinity War",
                "27 April 2018",
                R.drawable.poster_infinity_war,
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."
            )
        )

        return movies
    }

    fun generateDummyTvShow(): List<FilmEntity> {

        val tvShow = ArrayList<FilmEntity>()

        tvShow.add(
            FilmEntity(
                "1",
                "Arrow",
                "Season 8 | 10 Episodes",
                R.drawable.poster_arrow,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow."
            )
        )
        tvShow.add(
            FilmEntity(
                "2",
                "Hanna",
                "Season 3 | 6 Episodes",
                R.drawable.poster_hanna,
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film."
            )
        )
        tvShow.add(
            FilmEntity(
                "3",
                "Doom Patrol",
                "Season 3 | 10 Episodes",
                R.drawable.poster_doom_patrol,
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find."
            )
        )
        tvShow.add(
            FilmEntity(
                "4",
                "Dragon Ball",
                "Kid Buu Saga | 38 Episodes",
                R.drawable.poster_dragon_ball,
                "After learning that he is from another planet, a warrior named Goku and his friends are prompted to defend it from an onslaught of extraterrestrial enemies."
            )
        )
        tvShow.add(
            FilmEntity(
                "5",
                "Fairy Tail",
                "Season 8 | 51 Episodes",
                R.drawable.poster_fairytail,
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail."
            )
        )
        tvShow.add(
            FilmEntity(
                "6",
                "Family Guy",
                "Season 20 | 20 Episodes",
                R.drawable.poster_family_guy,
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues."
            )
        )
        tvShow.add(
            FilmEntity(
                "7",
                "Flash",
                "Season 8 | 6 Episodes",
                R.drawable.poster_flash,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash."
            )
        )
        tvShow.add(
            FilmEntity(
                "8",
                "Game of Thrones",
                "Season 8 | 6 Episodes",
                R.drawable.poster_god,
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond."
            )
        )
        tvShow.add(
            FilmEntity(
                "9",
                "Gotham",
                "Season 5 | 12 Episodes",
                R.drawable.poster_gotham,
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?"
            )
        )
        tvShow.add(
            FilmEntity(
                "10",
                "Grey Anatomy",
                "Season 18 | 8 Episodes",
                R.drawable.poster_grey_anatomy,
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital."
            )
        )

        return tvShow
    }

}