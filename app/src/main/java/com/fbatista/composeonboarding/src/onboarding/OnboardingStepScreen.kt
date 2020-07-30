package com.fbatista.composeonboarding.src.onboarding

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.material.Typography
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

@Composable
fun OnboardingStepScreen(step: OnboardingStep) {
    Content(
        title = step.title,
        subtitle = step.subtitle,
        image = step.imageRes
    )
}

@Composable
private fun Content(
    title: String,
    subtitle: String,
    @DrawableRes image: Int
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalGravity = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
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
fun DisplayContent() {
    OnboardingStepScreen(OnboardingStep.STEP_1)
}
