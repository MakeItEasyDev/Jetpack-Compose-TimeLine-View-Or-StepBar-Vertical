package com.jetpack.timelineview.timeline

import androidx.annotation.DrawableRes
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.jetpack.timelineview.R

interface TimeLineOption {
    val circleIcon: Int
    val circleSize: Dp
    val circleColor: Color
    val lineColor: Color
    val lineWidth: Dp
    val contentHeight: Dp
}

private class TimeLineOptionImpl(
    override val circleIcon: Int,
    override val circleSize: Dp,
    override val circleColor: Color,
    override val lineColor: Color,
    override val lineWidth: Dp,
    override val contentHeight: Dp
): TimeLineOption

fun TimeLineOption(
    @DrawableRes circleIcon: Int = R.drawable.ic_baseline_check_circle_outline_24,
    circleSize: Dp = Dp.Unspecified,
    circleColor: Color = Color.Black,
    lineColor: Color = Color(0xFF6200EE),
    lineWidth: Dp = 2.dp,
    contentHeight: Dp = 100.dp
): TimeLineOption = TimeLineOptionImpl(circleIcon, circleSize, circleColor, lineColor, lineWidth, contentHeight)



















