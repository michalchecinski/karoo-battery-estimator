package com.karoobatteryestimator.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main_tabs") {
        composable("main_tabs") {
            MainTabScreen(navController = navController)
        }
        composable("about") {
            AboutScreen(navController = navController)
        }
    }
}
