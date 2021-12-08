package com.jetpack.timelineview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.jetpack.timelineview.timeline.TimeLine
import com.jetpack.timelineview.timeline.TimeLineItem
import com.jetpack.timelineview.timeline.TimeLineOption
import com.jetpack.timelineview.ui.theme.TimeLineViewTheme

class MainActivity : ComponentActivity() {
    private data class Item(override val key: Int) : TimeLineItem<Int>

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimeLineViewTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(
                                        text = "TimeLine View",
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            )
                        }
                    ) {
                        TimeLine(
                            items = listOf(
                                Item(1),
                                Item(2),
                                Item(3),
                                Item(4),
                                Item(5)
                            ),
                            header = { key ->
                                Text(text = "Make it Easy $key.")
                            },
                            content = { item ->
                                Text(text = "Welcome ${item.key}")
                            },
                            timeLineOption = TimeLineOption(contentHeight = 50.dp),
                            modifier = Modifier.background(Color.White)
                        )
                    }
                }
            }
        }
    }
}












