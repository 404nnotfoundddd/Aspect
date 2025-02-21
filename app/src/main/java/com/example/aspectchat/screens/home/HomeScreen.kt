package com.example.aspectchat.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aspectchat.R
import com.example.aspectchat.core.presentation.ui.theme.colorsA
import com.example.aspectchat.core.presentation.ui.theme.isDarkTheme
import com.example.aspectchat.navigation.navigationDrawer.domain.model.IsDrawerOpenState

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    drawerState: IsDrawerOpenState,
    onDrawerOpen: () -> Unit,
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(if (isDarkTheme) MaterialTheme.colorsA.Gray900 else MaterialTheme.colorsA.White2000),
        ) {

            val paddingValues = WindowInsets.systemBars.asPaddingValues()

            Column(
                modifier = Modifier
                    .background(Color(0xff272a31))
            ) {
                Spacer(modifier = Modifier.height(paddingValues.calculateTopPadding()))
                Row(
                    modifier = Modifier

                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 20.dp),

                    verticalAlignment = Alignment.CenterVertically,
                ) {

                    Image(
                        painter = painterResource(R.drawable.menu),
                        contentDescription = null,
                        modifier = Modifier
                            .size(25.dp)
                            .clickable { onDrawerOpen() }
                    )

                    Spacer(modifier = Modifier.width(15.dp))

                    Row(
                        modifier = Modifier.weight(1f),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Image(
                            painter = painterResource(R.drawable.image3),
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "404nnotfoundd",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorsA.White2000,
                            maxLines = 1
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(15.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.video),
                            contentDescription = null,
                            modifier = Modifier
                                .size(28.dp)
                                .alpha(0.5f)
                        )


                        Image(
                            painter = painterResource(R.drawable.call),
                            contentDescription = null,
                            modifier = Modifier
                                .size(26.dp)
                                .alpha(0.5f)
                        )


                        Image(
                            painter = painterResource(R.drawable.options),
                            contentDescription = null,
                            modifier = Modifier
                                .size(23.dp)
                        )
                    }
                }
            }

            Box(
                modifier = Modifier.fillMaxSize(),
            ) {

            }
        }


    }

}