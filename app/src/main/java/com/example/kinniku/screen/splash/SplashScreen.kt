package com.example.kinniku.screen.splash

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.kinniku.ui.theme.SubRed

//画面番号：
//一番最初のロード中に表示される画面
@Composable
fun SplashScreen(
    modifier: Modifier = Modifier
) {

}

@Composable
private fun Logo(
    modifier: Modifier = Modifier,
    isVisibleProgress: Boolean
) {
    Surface(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        color = SubRed
    ) {

    }
}