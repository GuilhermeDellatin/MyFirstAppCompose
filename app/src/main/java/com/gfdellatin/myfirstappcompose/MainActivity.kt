package com.gfdellatin.myfirstappcompose

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gfdellatin.myfirstappcompose.ui.theme.BackgroundJetPackLogoColor
import com.gfdellatin.myfirstappcompose.ui.theme.LatoFamily
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

@Composable
fun FeedItem() {
    Column {
        Box {
            Image(
                painter = painterResource(id = R.drawable.android_jetpack_header),
                contentDescription = "Background Image"
            )
            Text(
                text = "26:15",
                fontSize = 12.sp,
                color = Color.White,
               modifier = Modifier
                   .align(Alignment.BottomEnd)
                   .padding(8.dp, 8.dp)
            )
        }

        Row(horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.jetpack_compose_icon),
                contentDescription = "Android Image",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(40.dp),

            )
            Column {
                Text(text = "Jetpack Compose - Fundamentos")
                Spacer(modifier = Modifier.size(8.dp))
                Row {
                    Text(
                        text = "Jetpack Compose",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = " 247 views ",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = " - two weeks ago ",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Light
                    )
                }
            }
        }
    }
}

@Composable
fun CustomText(@StringRes textResId: Int) {
    Text(
        text = stringResource(id = textResId),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable {
                Log.d("Welcome", "Clicked")
            },
        color = Color.Green,
        //fontSize = 18.sp,
        //fontWeight = FontWeight.Bold,
        //fontFamily = LatoFamily,
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.body1
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstAppComposeTheme {
        //CustomText(textResId = R.string.app_name)
        FeedItem()
    }
}