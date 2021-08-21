package com.tomazwang.lcthw.data.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.toLowerCase
import com.tomazwang.lcthw.R
import java.util.Locale

/**
 * Created by TomazWang on 2021/08/21.
 *
 *
 * @author Tomaz Wang
 * @since 2021/08/21
 **/

data class MusicGenre(
    val id: Int = 0,
    val title: String,
    val subTitle: String = "${title.lowercase(Locale.getDefault())} music",
    @DrawableRes val image: Int,
    val color: Color
) {
    companion object {
        val EmptyGenre = MusicGenre(
            title = "---",
            subTitle = "",
            image = R.drawable.cover_empty,
            color = Color.LightGray
        )
    }
}
