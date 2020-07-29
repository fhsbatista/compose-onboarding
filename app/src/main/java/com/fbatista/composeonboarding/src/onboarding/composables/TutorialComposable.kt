package com.fbatista.composeonboarding.src.onboarding.composables

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Typography
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.fbatista.composeonboarding.R

@Composable
fun Tutorial(
    backgroundColor: Color,
    title: String,
    subtitle: String,
    @DrawableRes image: Int
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalGravity = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Image(imageResource(image))
        Text(
            text = title,
            style = Typography().h6,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = subtitle,
            style = Typography().subtitle2,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview
@Composable
fun DisplayTutorial() {
    Tutorial(
        backgroundColor = Color.Cyan,
        title = "Get more support",
        subtitle = "With us you don't have to worry, we'll always be available and ready to help you whenever you need",
        image = R.drawable.ic_launcher_foreground
    )
}