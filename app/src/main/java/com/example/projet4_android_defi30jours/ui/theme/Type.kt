package com.example.projet4_android_defi30jours.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


val Typography = Typography(
    h1 = TextStyle(
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        color = CourageColor
    ),
    h2 = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        color = CourageColor
    ),
    body1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Black
    ),
    body2 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Gray
    )
)
