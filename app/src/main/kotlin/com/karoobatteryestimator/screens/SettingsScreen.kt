package com.karoobatteryestimator.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.karoobatteryestimator.theme.AppTheme

@Composable
fun SettingsScreenContent() {
    Text("Settings Screen Content")
}

@Preview(widthDp = 256, heightDp = 426)
@Composable
fun SettingsScreenPreview() {
    AppTheme {
        SettingsScreenContent()
    }
}
