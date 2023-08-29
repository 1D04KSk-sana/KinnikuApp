package com.example.kinniku.data

import kotlinx.serialization.Serializable

@Serializable
data class MonthDayList(
    val monthNum: Int,
    val dayNum: Int
)
