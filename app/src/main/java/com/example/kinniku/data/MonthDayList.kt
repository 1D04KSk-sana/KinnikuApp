package com.example.kinniku.data

import com.google.firebase.firestore.DocumentId
import kotlinx.serialization.Serializable

@Serializable
data class MonthDayList(
    @DocumentId
    val monthNum: Int,
    val lastDayNum: Int
)
