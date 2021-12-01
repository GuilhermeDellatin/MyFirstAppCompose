package com.gfdellatin.myfirstappcompose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gfdellatin.myfirstappcompose.ui.theme.BackgroundJetPackLogoColor

@ExperimentalAnimationApi
@Composable
fun IntroScreen() {

    Card(
        modifier = Modifier.padding(16.dp, 16.dp),
        backgroundColor = BackgroundJetPackLogoColor,
        elevation = 4.dp,
        shape = RoundedCornerShape(16.dp)
    ) {
        var expanded by remember { mutableStateOf(false) }

        Column(Modifier.clickable { expanded = !expanded }) {
            Image(
                painter = painterResource(id = R.drawable.jetpack_logo),
                contentDescription = stringResource(id = R.string.content_logo)
            )
            AnimatedVisibility(expanded) {
                Text(
                    text = stringResource(R.string.jetpack_university),
                    fontSize = 24.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }

}

@ExperimentalAnimationApi
@Preview(showBackground = true)
@Composable
fun IntroScreenPreview() {
    IntroScreen()
}