package com.example.basicjetpacknavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable


import androidx.navigation.compose.rememberNavController
import com.example.basicjetpacknavigation.ui.navigation.NavGraph
import com.example.basicjetpacknavigation.ui.theme.BasicJetPackNavigationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
private fun MainScreen() {
    BasicJetPackNavigationTheme {
        val navController = rememberNavController()
        NavGraph(navController)
    }
}
