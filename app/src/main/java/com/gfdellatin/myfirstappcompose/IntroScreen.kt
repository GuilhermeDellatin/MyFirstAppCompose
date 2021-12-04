package com.gfdellatin.myfirstappcompose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gfdellatin.myfirstappcompose.ui.theme.BackgroundJetPackLogoColor

@ExperimentalAnimationApi
@Composable
fun IntroScreen(
    navController: NavController
) {

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
                Column {
                    Spacer(modifier = Modifier.size(8.dp))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            modifier = Modifier.clickable {
                                navController.navigate(route = NavControllerScreen.PlayList.route)
                            },
                            text = stringResource(R.string.jetpack_university),
                            fontSize = 24.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Light,
                            textAlign = TextAlign.Justify
                        )
                        Image(
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(route = NavControllerScreen.PlayList.route)
                                }
                                .size(30.dp),
                            painter = painterResource(id = R.drawable.ic_arrow_forward),
                            contentDescription = stringResource(id = R.string.content_forward_playlist),
                            alignment = Alignment.TopEnd
                        )
                    }
                }
            }
        }
    }

}

@ExperimentalAnimationApi
@Preview(showBackground = true)
@Composable
fun IntroScreenPreview() {
    IntroScreen(
        navController = rememberNavController()
    )
}