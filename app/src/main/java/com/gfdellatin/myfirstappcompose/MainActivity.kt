package com.gfdellatin.myfirstappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.gfdellatin.myfirstappcompose.ui.theme.MyFirstAppComposeTheme

@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {
    
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstAppComposeTheme {
                
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
                
            }
        }
    }
}


