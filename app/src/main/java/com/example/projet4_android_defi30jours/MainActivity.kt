package com.example.projet4_android_defi30jours

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projet4_android_defi30jours.ui.home.HomeScreen
import com.example.projet4_android_defi30jours.ui.progress.ProgressScreen
import com.example.projet4_android_defi30jours.ui.theme.Projet4AndroidDefi30JoursTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Projet4AndroidDefi30JoursTheme {
                val navController = rememberNavController()

                Scaffold(
                    topBar = {

                        TopAppBar(
                            backgroundColor = MaterialTheme.colors.surface,
                            elevation = 0.dp
                        ) {
                            Text(
                                text = "Business Mindset",
                                fontSize = 20.sp,
                                color = Color(0xFFFFFFFF),
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .align(Alignment.CenterVertically)
                            )
                        }
                    },
                    bottomBar = {
                        BottomNavigation {
                            BottomNavigationItem(
                                icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                                label = { Text("Home", color =Color(0xFFFFFFFF)) },
                                selected = navController.currentDestination?.route == "home",
                                onClick = { navController.navigate("home") }
                            )
                            BottomNavigationItem(
                                icon = { Icon(Icons.Default.CheckCircle, contentDescription = "Progress", ) },
                                label = { Text("Progress", color =Color(0xFFFFFFFF)) },
                                selected = navController.currentDestination?.route == "progress",
                                onClick = { navController.navigate("progress") }
                            )
                        }
                    }
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "home",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("home") { HomeScreen() }
                        composable("progress") { ProgressScreen() }
                    }
                }
            }
        }
    }
}
