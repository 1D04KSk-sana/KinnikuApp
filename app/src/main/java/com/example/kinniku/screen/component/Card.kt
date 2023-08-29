package com.example.kinniku.screen.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinniku.ui.theme.Black
import com.example.kinniku.ui.theme.MiniStyle
import com.example.kinniku.ui.theme.SubRed

//モジュール番号：
//カレンダーの日のカード
@Composable
fun CardDay(
    dayNumber: Int,
    onClicked: () -> Unit
) {
    Card(
        modifier = Modifier
            .clickable(onClick = onClicked)
            .width(35.dp)
    ) {
        Column {
            Text(
                text = dayNumber.toString(),
                style = MiniStyle,
                color = Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Canvas(
                modifier = Modifier
                    .size(35.dp)
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
    CardDay(1, { })
}