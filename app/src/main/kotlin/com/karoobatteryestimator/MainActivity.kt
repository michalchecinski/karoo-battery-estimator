package com.karoobatteryestimator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.karoobatteryestimator.screens.AppNavigation
import com.karoobatteryestimator.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                AppNavigation()
            }
        }
    }
}
