package com.jaennova.retrofit_examples.menu

import com.jaennova.retrofit_examples.R
import com.jaennova.retrofit_examples.navigation.AppScreens

val listApps = listOf(
    MenuItem(
        appName = "JsonPlaceholder",
        description = "JsonPlaceholder API",
        icon = R.drawable.ic_launcher_foreground,
        route = AppScreens.JsonPlaceholder.route,
    )
)