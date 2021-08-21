package com.tomazwang.lcthw.views.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
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
fun SpotiGenreBlock(
    title: String,
    @DrawableRes coverImgRes: Int,
    color: Color,
    modifier: Modifier = Modifier
) {
    
    ConstraintLayout(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(color = color)
            .then(modifier)
    ) {
        
        
        // 建立用來做關聯的 "id"
        val (titleRef, coverArtRef, blockSpaceRef) = createRefs()
        
        
        Text(
            text = title,
            // 使用 Modifier.constrainAs 定義每個元件的 id
            modifier = Modifier.constrainAs(titleRef) {
                // 在這裡定義這個元件與其他元件的關聯 (constraint)
                // parent 是內建的
                top.linkTo(parent.top, margin = 8.dp)
                start.linkTo(parent.start, margin = 8.dp)
            },
            color = Color.White, fontWeight = FontWeight.Black
        )
        
        Spacer(modifier = Modifier
            .constrainAs(blockSpaceRef) {
                // linkTo function 可以一次定義多個 constraint
                linkTo(top = parent.top, bottom = parent.bottom)
            }
            .defaultMinSize(minHeight = 100.dp))
        
        Image(
            painter = painterResource(id = coverImgRes),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(coverArtRef) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end, margin = (-10).dp)
                }
                .height(60.dp)
                .width(60.dp)
                .rotate(30f)
        )
        
        
    }
}


@Preview(
    showBackground = true,
    name = "SpotiGenereBlock",
    backgroundColor = 0xFF191414
)
@Composable
fun PreviewSpotiGenereBlock() {
    SpotiGenreBlock(
        "Folk", R.drawable.cover10, SpotiColor.coverColor1,
        modifier = Modifier
            .width(160.dp)
            .height(80.dp)
    )
}


