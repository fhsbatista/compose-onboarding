package com.fbatista.composeonboarding.src.onboarding

import androidx.annotation.DrawableRes
import com.fbatista.composeonboarding.R

enum class OnboardingStep (
    val title: String,
    val subtitle: String,
    @DrawableRes val imageRes: Int
) {
    STEP_1(
        title = "PASSO 1",
        subtitle = "Melhor já pensar em um texto legal para por aqui",
        imageRes = R.drawable.ic_launcher_foreground
    ),
    STEP_2(
        title = "PASSO 2",
        subtitle = "Melhor começar logo em, você já está no passo 2 e ainda não pensou em um texto",
        imageRes = R.drawable.ic_launcher_foreground
    ),
    STEP_3(
        title = "PASSO 3",
        subtitle = "Poxa, passo 3 e ainda está sem ideias?",
        imageRes = R.drawable.ic_launcher_foreground
    ),
    STEP_4(
        title = "PASSO 4",
        subtitle = "Se não pensou em um texto legal ainda, então esquece, pois esse é o último passo",
        imageRes = R.drawable.ic_launcher_foreground
    )
}
