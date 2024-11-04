package com.novastudio.timebox.core.utils.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.novastudio.timebox.R

// Set of Material typography styles to start with
val poppinsFont = FontFamily(
    Font(R.font.poppins_extrabold),
    Font(R.font.poppins_bold),
    Font(R.font.poppins_semibold),
    Font(R.font.poppins_medium),
    Font(R.font.poppins_regular),
    Font(R.font.poppins_light)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 57.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 64.sp
    ),
    displayMedium = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 45.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 52.sp
    ),
    displaySmall = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 36.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 44.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 40.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 36.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 32.sp
    ),
    titleLarge = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 22.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 28.sp
    ),
    titleMedium = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 24.sp
    ),
    titleSmall = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 24.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 16.sp
    ),
    labelLarge = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 20.sp
    ),
    labelMedium = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 16.sp
    ),
    labelSmall = TextStyle(
        fontFamily = poppinsFont,
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 12.sp
    )
)

