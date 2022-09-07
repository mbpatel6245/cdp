package com.mbp.cdp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalConfiguration

@Composable
fun ProvideDimens(
    dimensions: ComposableDimens,
    content: @Composable () -> Unit
) {
    val dimensionSet = remember { dimensions }
    CompositionLocalProvider(LocalAppDimens provides dimensionSet, content = content)
}

private val LocalAppDimens = staticCompositionLocalOf {
    ComposableDimens()
}

@Composable
fun getDimensType(): ComposableDimens {
    val screenWidthDp = LocalConfiguration.current.screenWidthDp
    return when {
        screenWidthDp <= 300 -> {
            sw300dp
        }
        screenWidthDp <= 330 -> {
            sw330dp
        }
        screenWidthDp <= 360 -> {
            sw360dp
        }
        screenWidthDp <= 390 -> {
            sw390dp
        }
        screenWidthDp <= 420 -> {
            sw420dp
        }
        screenWidthDp <= 450 -> {
            sw450dp
        }
        screenWidthDp <= 480 -> {
            sw480dp
        }
        screenWidthDp <= 510 -> {
            sw510dp
        }
        screenWidthDp <= 540 -> {
            sw540dp
        }
        screenWidthDp <= 570 -> {
            sw570dp
        }
        screenWidthDp <= 600 -> {
            sw600dp
        }
        screenWidthDp <= 630 -> {
            sw630dp
        }
        screenWidthDp <= 660 -> {
            sw660dp
        }
        screenWidthDp <= 690 -> {
            sw690dp
        }
        screenWidthDp <= 720 -> {
            sw720dp
        }
        screenWidthDp <= 750 -> {
            sw750dp
        }
        screenWidthDp <= 780 -> {
            sw780dp
        }
        screenWidthDp <= 810 -> {
            sw810dp
        }
        screenWidthDp <= 840 -> {
            sw840dp
        }
        screenWidthDp <= 870 -> {
            sw870dp
        }
        screenWidthDp <= 900 -> {
            sw900dp
        }
        screenWidthDp <= 930 -> {
            sw930dp
        }
        screenWidthDp <= 960 -> {
            sw960dp
        }
        screenWidthDp <= 990 -> {
            sw990dp
        }
        screenWidthDp <= 1020 -> {
            sw1020dp
        }
        screenWidthDp <= 1050 -> {
            sw1050dp
        }
        screenWidthDp <= 1080 -> {
            sw1080dp
        }
        else -> ComposableDimens()
    }
}

object CDP {
    val dimens: ComposableDimens
        @Composable
        get() = LocalAppDimens.current
}

val Dimens: ComposableDimens
    @Composable
    get() = CDP.dimens