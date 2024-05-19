package com.jaennova.retrofit_examples.navigation

sealed class AppScreens(val route: String) {
    data object Menu : AppScreens("menu")
    data object JsonPlaceholder : AppScreens("json_placeholder")
}