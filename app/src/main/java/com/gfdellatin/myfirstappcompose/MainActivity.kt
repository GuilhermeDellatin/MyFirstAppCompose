package com.gfdellatin.myfirstappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    Column(
        modifier = Modifier
            .padding(all = 8.dp)
            .background(Color.DarkGray, RoundedCornerShape(16.dp))
            .clip(RoundedCornerShape(16.dp))
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.android_jetpack_header),
                contentDescription = stringResource(id = R.string.content_background)
            )
            Text(
                text = stringResource(id = R.string.video_total_time),
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(8.dp, 8.dp)
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp)
            ) {
                Image(
                    alignment = Alignment.CenterEnd,
                    painter = painterResource(id = R.drawable.ic_baseline_more),
                    contentDescription = stringResource(id = R.string.content_more_functions),
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.jetpack_compose_icon),
                contentDescription = stringResource(id = R.string.content_logo),
                modifier = Modifier
                    .clip(CircleShape)
                    .size(40.dp),
                )
            Column {
                Text(text = stringResource(id = R.string.jetpack_fundamentals), color = Color.White)
                Spacer(modifier = Modifier.size(8.dp))
                Row {
                    Text(
                        text = stringResource(id = R.string.jetpack_university),
                        fontSize = 12.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = stringResource(id = R.string.views),
                        fontSize = 12.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = stringResource(id = R.string.time_video_updload),
                        fontSize = 12.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Light
                    )
                }
            }

            Image(
                painter = painterResource(id = R.drawable.ic_baseline_play_arrow),
                contentDescription = stringResource(id = R.string.content_play_arrow),
                modifier = Modifier
                    .clip(CircleShape)
                    .size(40.dp),

                )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstAppComposeTheme {
        FeedItem()
    }
}