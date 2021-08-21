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
            MusicGenre("Pop", R.drawable.cover1, SpotiColor.coverColor1),
            MusicGenre("Top", R.drawable.cover2, SpotiColor.coverColor2),
            MusicGenre("Hip Hop", R.drawable.cover3, SpotiColor.coverColor3),
            MusicGenre("Indie", R.drawable.cover4, SpotiColor.coverColor4)
        )
    
    fun getAllGenreList() = listOf(
        MusicGenre(image = R.drawable.cover7, color = SpotiColor.coverColor1, title = "Made for you"),
        MusicGenre(image = R.drawable.cover6, color = SpotiColor.coverColor6, title = "Podcasts"),
        MusicGenre(
            image = R.drawable.cover5,
            color = SpotiColor.coverColor5,
            title = "Folk & Acoustic",
        ),
        MusicGenre(image = R.drawable.cover8, color = SpotiColor.coverColor2, title = "Concerts"),
        MusicGenre(image = R.drawable.cover4, color = SpotiColor.coverColor1, title = "At Home"),
        MusicGenre(image = R.drawable.cover3, color = SpotiColor.coverColor6, title = "Mandopop"),
        MusicGenre(image = R.drawable.cover5, color = SpotiColor.coverColor2, title = "K-Pop"),
        MusicGenre(image = R.drawable.cover1, color = SpotiColor.coverColor4, title = "Tokyo"),
        MusicGenre(image = R.drawable.cover7, color = SpotiColor.coverColor4, title = "Mood"),
        MusicGenre(image = R.drawable.cover9, color = SpotiColor.coverColor6, title = "Rap"),
        MusicGenre(image = R.drawable.cover9, color = SpotiColor.coverColor3, title = "Dance/Electronic"),
        MusicGenre(image = R.drawable.cover2, color = SpotiColor.coverColor5, title = "Workout"),
        MusicGenre(image = R.drawable.cover8, color = SpotiColor.coverColor5, title = "Trending"),
        MusicGenre(image = R.drawable.cover6, color = SpotiColor.coverColor3, title = "Meme"),
    )
}