package com.example.basicjetpacknavigation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.basicjetpacknavigation.ui.common.DefaultButton
import com.example.basicjetpacknavigation.ui.theme.BasicJetPackNavigationTheme


@Composable
fun LoginScreen(
    navigateToHome: () -> Unit
) {
    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Login Screen", fontSize = 40.sp)

        DefaultButton(
            text = "Log In",
            onClick = navigateToHome
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    BasicJetPackNavigationTheme(dynamicColor = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            LoginScreen(
                navigateToHome = {}
            )
        }
    }
}
