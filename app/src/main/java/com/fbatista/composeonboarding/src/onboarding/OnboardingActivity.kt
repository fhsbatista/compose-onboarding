package com.fbatista.composeonboarding.src.onboarding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.MutableState
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.unit.dp
import java.lang.IndexOutOfBoundsException

class OnboardingActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val currentStep: MutableState<Int> = state { 0 }

            fun isAbleToIncrease() = currentStep.value < 3
            fun isAbleToDecrease() = currentStep.value > 0

            fun increaseStep() {
                if (currentStep.value < 3) currentStep.value++
            }

            fun decreaseStep() {
                if (currentStep.value > 0) currentStep.value--
            }

            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Bottom
            ) {
                OnboardingStepScreen(OnboardingStep.values().asList()[currentStep.value])
                Box(modifier = Modifier.height(100.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Button(
                        modifier = Modifier.padding(16.dp),
                        text = { Text("Anterior") },
                        enabled = isAbleToDecrease(),
                        onClick = {
                            decreaseStep()
                        }
                    )
                    Button(
                        modifier = Modifier.padding(16.dp),
                        text = { Text("Próximo") },
                        enabled = isAbleToIncrease(),
                        onClick = {
                            increaseStep()
                        }
                    )
                }
            }
        }
    }
}