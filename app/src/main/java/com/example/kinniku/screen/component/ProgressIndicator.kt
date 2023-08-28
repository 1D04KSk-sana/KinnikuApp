package com.example.kinniku.screen.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kinniku.ui.theme.MainRed

//モジュール番号：
//クルクル回るやつ　共通化
@Composable
fun CenterProgressIndicator(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            color = MainRed
        )
    }
}

@Preview
@Composable
fun PreviewCenterProgressIndicator() {
    CenterProgressIndicator()
}