package br.ufg.akcit.smartglasses.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = AppColor.DeepBlue,
    onPrimary = Color.White,

    error = AppColor.Red,
    onError = Color.Black,
    errorContainer = Color(0xFF4A0010),
    onErrorContainer = Color(0xFFFFB3B3),

    background = Color(0xFF121212),
    onBackground = Color.White,
    surface = Color(0xFF1E1E1E),
    onSurface = Color.White,
    onSurfaceVariant = Color(0xFFAAAAAA),
)

private val LightColorScheme = lightColorScheme(
    primary = AppColor.DeepBlue,
    onPrimary = Color.White,

    error = AppColor.Red,
    onError = Color.White,
    errorContainer = AppColor.DestructiveBackground,
    onErrorContainer = AppColor.DestructiveForeground,

    background = Color(0xFFF8F9FA),
    onBackground = Color(0xFF1C1B1F),
    surface = Color.White,
    onSurface = Color(0xFF1C1B1F),
    onSurfaceVariant = Color(0xFF6B6B6B),

    /* Other default colors to override
    secondary = PurpleGrey40,
    tertiary = Pink40
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    */
)

@Composable
fun SmartGlassesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
