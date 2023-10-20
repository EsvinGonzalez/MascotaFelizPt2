package com.example.mascotafeliz2.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mascotafeliz2.R

// Set of Material typography styles to start with
private val nosifer = FontFamily(
    Font(R.font.nosifer_regular, FontWeight.Normal),
    Font(R.font.nosifer_black, FontWeight.Medium),
    Font(R.font.nosifer_kaushan, FontWeight.Bold)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = nosifer,
        fontWeight = FontWeight.Medium,
        fontSize = 40.sp,

    ),
    bodyMedium = TextStyle(
        fontFamily = nosifer,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 30.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = nosifer,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)