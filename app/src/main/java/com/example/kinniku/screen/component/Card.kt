package com.example.kinniku.screen.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinniku.ui.theme.Black
import com.example.kinniku.ui.theme.MiniStyle
import com.example.kinniku.ui.theme.SubRed
import com.example.kinniku.ui.theme.WhiteGray

//モジュール番号：
//カレンダーの日のカード
@Composable
fun CardDay(
    dayNumber: String,
    onClicked: () -> Unit
) {
    Card(
        modifier = Modifier
            .clickable(onClick = onClicked)
    ) {
        Column {
            Text(
                text = dayNumber,
                style = MiniStyle,
                color = Black
            )
            Canvas(
                modifier = Modifier.size(35.dp)
            ) {
                scale(
                    scaleX = 5f,
                    scaleY = 5f
                ) {
                    drawCircle(
                        color = SubRed,
                        radius = 1.dp.toPx()
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewCardDay() {
    CardDay("1", { })
}