package com.gfdellatin.myfirstappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gfdellatin.myfirstappcompose.ui.theme.MyFirstAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstAppComposeTheme {
                FeedItem()
            }
        }
    }
}


