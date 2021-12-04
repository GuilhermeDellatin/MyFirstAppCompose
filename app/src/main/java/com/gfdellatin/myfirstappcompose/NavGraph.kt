package com.gfdellatin.myfirstappcompose

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@ExperimentalAnimationApi
@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = NavControllerScreen.Intro.route
    ) {
        composable(
            route = NavControllerScreen.Intro.route
        ) {
            IntroScreen(navController = navController)
        }
        composable(
            route = NavControllerScreen.PlayList.route
        ) {
            FeedItem(navController = navController)
        }

    }
}