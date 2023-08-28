package com.example.kinniku.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinniku.R
import com.example.kinniku.screen.component.CenterProgressIndicator
import com.example.kinniku.ui.theme.SubRed

//画面番号：
//一番最初のロード中に表示される画面
@Composable
fun SplashScreen(
    modifier: Modifier = Modifier
) {
    Logo(
        isVisibleProgress = true
    )
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
        Image(
            painter = painterResource(id = R.drawable.logo_wht),
            contentDescription = "ロゴ画像",
            modifier = modifier
                .defaultMinSize(72.dp)
                .padding(bottom = 20.dp),
            contentScale = ContentScale.Inside,
        )

        if (isVisibleProgress) {
            CenterProgressIndicator(
                modifier = modifier
            )
        }
    }
}

@Preview
@Composable
fun PreviewLogo(
    modifier: Modifier = Modifier
) {
    Logo(
        modifier = modifier,
        isVisibleProgress = true
    )
}