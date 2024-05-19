package com.jaennova.retrofit_examples.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jaennova.retrofit_examples.get.jsonplaceholder.DataApiScreen
import com.jaennova.retrofit_examples.menu.MenuScreen
import com.jaennova.retrofit_examples.menu.listApps

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.Menu.route) {
        composable(AppScreens.Menu.route) { MenuScreen(listApps, navController) }
        composable(AppScreens.JsonPlaceholder.route) { DataApiScreen() }
    }
}