package com.tomazwang.lcthw.data.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

/**
 * Created by TomazWang on 2021/08/21.
 *
 *
 * @author Tomaz Wang
 * @since 2021/08/21
 **/

data class MusicGenre(val title: String, @DrawableRes val image: Int, val color: Color)
