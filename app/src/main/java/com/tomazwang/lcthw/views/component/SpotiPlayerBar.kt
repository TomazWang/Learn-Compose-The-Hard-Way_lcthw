package com.tomazwang.lcthw.views.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
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
import com.tomazwang.lcthw.ui.theme.SpotiColor

/**
 * Created by TomazWang on 2021/08/21.
 *
 *
 * @author Tomaz Wang
 * @since 2021/08/21
 **/

@Composable
fun SpotiPlayerBar(
    title: String,
    artist: String,
    @DrawableRes coverImg: Int, modifier: Modifier = Modifier) {
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = SpotiColor.DarkGray)
            .then(modifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        
        Image(
            painter = painterResource(coverImg),
            contentDescription = null,
            Modifier.fillMaxHeight(),
            contentScale = ContentScale.Inside,
        )
        
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 8.dp)
                .weight(1f),
            verticalArrangement = Arrangement.Center,
        ) {
            
            Text(
                text = title,
                color = Color.White,
                fontSize = 13.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier
            
            )
            Text(
                text = artist,
                color = SpotiColor.LightGray,
                fontSize = 8.sp,
                modifier = Modifier
            )
            
        }
        
        
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_important_devices_24),
            contentDescription = null,
            tint = SpotiColor.LightGray,
            modifier = Modifier
                .fillMaxHeight()
                .padding(vertical = 8.dp, horizontal = 4.dp)
        
        )
        
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .fillMaxHeight()
                .padding(vertical = 8.dp, horizontal = 8.dp)
        
        )
        
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_pause_24),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .fillMaxHeight()
                .padding(vertical = 8.dp, horizontal = 4.dp)
        
        )
        
        Spacer(modifier = Modifier.width(8.dp))
        
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
        artist = "Phum Viphurit",
        coverImg = R.drawable.cover1,
        modifier = Modifier.height(40.dp)
    )
}


