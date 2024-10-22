package com.example.projet4_android_defi30jours.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography


val DarkGray = Color(0xFF121212)
val Gold = Color(0xFFFFD700)
val White = Color(0xFFFFFFFF)


private val DarkColorPalette = darkColors(
    primary = Gold,
    primaryVariant = Gold,
    secondary = Gold,
    background = DarkGray,
    surface = DarkGray,
    onPrimary = White,
    onSecondary = White,
    onBackground = White,
    onSurface = White
)


@Composable
fun Projet4AndroidDefi30JoursTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        DarkColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
