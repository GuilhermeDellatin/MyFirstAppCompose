package com.gfdellatin.myfirstappcompose

sealed class NavControllerScreen(val route: String) {
    object PlayList: NavControllerScreen(route = "play_list_screen")
    object Intro: NavControllerScreen(route = "intro_screen")
}