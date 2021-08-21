package com.tomazwang.lcthw.data.repo

import com.tomazwang.lcthw.R
import com.tomazwang.lcthw.data.model.MusicGenre
import com.tomazwang.lcthw.ui.theme.SpotiColor

/**
 * Created by TomazWang on 2021/08/17.
 *
 *
 * @author Tomaz Wang
 * @since 2021/08/17
 **/

class SpotiSearchRepo {
    fun getTopGenreList() =
        listOf(
            MusicGenre(
                id = 0,
                title = "Pop",
                subTitle = "pop music",
                image = R.drawable.cover1,
                color = SpotiColor.coverColor1
            ),
            MusicGenre(
                id = 1,
                title = "Top",
                subTitle = "top rated",
                image = R.drawable.cover2,
                color = SpotiColor.coverColor2
            ),
            MusicGenre(
                id = 2,
                title = "Hip Hop",
                subTitle = "hip hop genre",
                image = R.drawable.cover3,
                color = SpotiColor.coverColor3
            ),
            MusicGenre(
                id = 3,
                title = "Indie",
                subTitle = "indie & funky",
                image = R.drawable.cover4,
                color = SpotiColor.coverColor4
            )
        )
    
    fun getAllGenreList() = listOf(
        MusicGenre(
            id = 4,
            title = "Made for you",
            subTitle = "",
            image = R.drawable.cover7,
            color = SpotiColor.coverColor1
        ),
        MusicGenre(
            id = 5,
            title = "Podcasts",
            subTitle = "just like broadcast",
            image = R.drawable.cover6,
            color = SpotiColor.coverColor6,
        ),
        MusicGenre(
            id = 6,
            title = "Folk & Acoustic",
            image = R.drawable.cover5,
            color = SpotiColor.coverColor5,
        ),
        MusicGenre(
            id = 7,
            title = "Concerts",
            subTitle = "live rocks",
            image = R.drawable.cover8,
            color = SpotiColor.coverColor2,
        ),
        MusicGenre(
            id = 8,
            title = "At Home",
            subTitle = "chill flow",
            image = R.drawable.cover4,
            color = SpotiColor.coverColor1,
        ),
        MusicGenre(
            id = 9,
            title = "Mandopop",
            subTitle = "taiwan no.1",
            image = R.drawable.cover3,
            color = SpotiColor.coverColor6,
        ),
        MusicGenre(
            id = 10,
            title = "K-Pop",
            image = R.drawable.cover5,
            color = SpotiColor.coverColor2,
        ),
        MusicGenre(
            id = 11,
            title = "Tokyo",
            subTitle = "is hot",
            image = R.drawable.cover1,
            color = SpotiColor.coverColor4,
        ),
        MusicGenre(
            id = 12,
            title = "Mood",
            image = R.drawable.cover7,
            color = SpotiColor.coverColor4,
        ),
        MusicGenre(
            id = 13,
            title = "Rap",
            image = R.drawable.cover9,
            color = SpotiColor.coverColor6,
        ),
        MusicGenre(
            id = 14,
            title = "Dance/Electronic",
            subTitle = "EDM",
            image = R.drawable.cover9,
            color = SpotiColor.coverColor3,
        ),
        MusicGenre(
            id = 15,
            title = "Workout",
            subTitle = "1234 2234",
            image = R.drawable.cover2,
            color = SpotiColor.coverColor5,
        ),
        MusicGenre(
            id = 16,
            title = "Trending",
            image = R.drawable.cover8,
            color = SpotiColor.coverColor5,
        ),
        MusicGenre(
            id = 17,
            title = "Meme",
            image = R.drawable.cover6,
            color = SpotiColor.coverColor3,
        ),
    )
}