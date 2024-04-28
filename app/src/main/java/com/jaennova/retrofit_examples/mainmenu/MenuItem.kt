package com.jaennova.retrofit_examples.mainmenu

import com.jaennova.retrofit_examples.R

data class MenuItem(
    val appName: String,
    val description: String,
    val icon: Int,
)

val menuItems = listOf(
    MenuItem(
        appName = "Retrofit Example",
        description = "Retrofit Example",
        icon = R.drawable.ic_launcher_foreground
    )
)