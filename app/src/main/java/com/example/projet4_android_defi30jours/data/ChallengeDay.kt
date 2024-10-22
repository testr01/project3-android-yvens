package com.example.projet4_android_defi30jours.data


data class ChallengeDay(
    val id: Int,
    val number: Int,
    val date: String,
    val title: String,
    val imageRes: Int,
    val description: String,
    var isCompleted: Boolean
)
