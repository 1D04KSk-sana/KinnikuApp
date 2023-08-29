package com.example.kinniku.screen.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinniku.ui.theme.Gray
import com.example.kinniku.ui.theme.SubRed
import com.example.kinniku.ui.theme.TitleStyle
import com.example.kinniku.ui.theme.White

@Composable
fun MainButton(
    text: String, enabled: Boolean, onclick: () -> Unit
) {
    Button(
        onClick = onclick,
        modifier = Modifier
            .height(44.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = SubRed,
            disabledContainerColor = Gray
        ),
        enabled = enabled
    ) {
        Text(
            text = text,
            color = White,
            style = TitleStyle
        )
    }
}

@Preview
@Composable
fun PreviewMainButton() {
    MainButton(
        text = "preview",
        enabled = false
    ) {

    }
}