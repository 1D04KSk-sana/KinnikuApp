package com.example.kinniku.screen.calendar

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.kinniku.screen.component.CardDay

//画面番号：
//メイン画面
@Composable
fun CalendarScreen() {
    CalendarScreenContent()
}

@Composable
fun CalendarScreenContent() {
    CardDay(dayNumber = "22",{ })
}

@Preview
@Composable
fun PreviewCalendarScreenContent() {
    CalendarScreenContent()
}