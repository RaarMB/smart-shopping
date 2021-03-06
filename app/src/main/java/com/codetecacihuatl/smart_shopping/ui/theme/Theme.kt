package com.codetecacihuatl.smart_shopping.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    background = Color.White,
    primary = primaryColor,
    primaryVariant = primaryDarkColor,
    secondary = secondaryColor,
    surface = Color.White
)

private val LightColorPalette = lightColors(
    background = Color.White,
    primary = primaryColor,
    primaryVariant = primaryDarkColor,
    secondary = secondaryColor,
    surface = Color.White
)

@Composable
fun SmartShoppingTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}