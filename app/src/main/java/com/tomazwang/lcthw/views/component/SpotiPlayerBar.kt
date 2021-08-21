package com.tomazwang.lcthw.views.component

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tomazwang.lcthw.R
import com.tomazwang.lcthw.data.model.MusicGenre
import com.tomazwang.lcthw.ui.theme.SpotiColor

/**
 * Created by TomazWang on 2021/08/21.
 *
 *
 * @author Tomaz Wang
 * @since 2021/08/21
 **/

private const val TAG = "SpotiPlayerBar"

data class PlayerState(val info: MusicGenre, val isFav: Boolean)


@Composable
fun SpotiPlayerBar(
    genre: MusicGenre,
    isFav: Boolean,
    modifier: Modifier = Modifier,
    onFav: (genre: MusicGenre) -> Unit = {},
) {
    SpotiPlayerBar(
        title = genre.title,
        subTitle = genre.subTitle,
        image = genre.image,
        isFav = isFav,
        modifier = modifier,
        onFav = { onFav(genre) }
    )
}


@Composable
private fun SpotiPlayerBar(
    title: String,
    subTitle: String,
    @DrawableRes image: Int,
    isFav: Boolean,
    modifier: Modifier = Modifier,
    onFav: () -> Unit = {},
) {
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = SpotiColor.DarkGray)
            .then(modifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        
        Image(
            painter = painterResource(image),
            contentDescription = null,
            Modifier.fillMaxHeight(),
            contentScale = ContentScale.Inside,
        )
        
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 16.dp)
                .weight(1f),
            verticalArrangement = Arrangement.Center,
        ) {
            
            Text(
                text = title,
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
            
            )
            Text(
                text = subTitle,
                color = SpotiColor.LightGray,
                fontWeight = FontWeight.Light,
                fontSize = 14.sp,
                modifier = Modifier
            )
            
        }
        
        
        val iconSize = 24.dp
        
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_important_devices_24),
            contentDescription = null,
            tint = SpotiColor.LightGray,
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .size(iconSize)
        
        )
        
        
        Icon(
            imageVector = if (isFav) {
                Log.d(TAG, "SpotiPlayerBar: $isFav")
                Icons.Default.Favorite
            } else {
                Log.d(TAG, "SpotiPlayerBar: $isFav")
                Icons.Outlined.FavoriteBorder
            },
            contentDescription = null,
            tint = if (isFav) SpotiColor.Green else Color.White,
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .size(iconSize)
                .clickable { onFav() }
        )
        
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_pause_24),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .size(iconSize)
        
        )
        
        Spacer(modifier = Modifier.width(16.dp))
        
    }
}


@Preview(
    showBackground = true,
    name = "SpotiPlayer",
    backgroundColor = 0xFF191414
)
@Composable
fun PreviewSpotiPlayer() {
    SpotiPlayerBar(
        title = "Lover Boy",
        subTitle = "Phum Viphurit",
        image = R.drawable.cover1,
        isFav = false,
        modifier = Modifier.height(60.dp)
    )
}


