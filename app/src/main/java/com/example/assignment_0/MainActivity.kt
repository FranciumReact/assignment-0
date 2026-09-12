/*
Sources:
    https://developer.android.com/develop/ui/compose/layouts/basics
    https://www.geeksforgeeks.org/kotlin/spacer-in-android-jetpack-compose/
    https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.random/-random/
    Claude assisted with importing everything
 */


package com.example.assignment_0

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random
import androidx.activity.enableEdgeToEdge
import com.example.assignment_0.ui.theme.Assignment0Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment0Theme {
                MakeDecision()

            }
        }
    }
}

@Composable
fun MakeDecision() {
    // Remembers number of clicks
    var numClicks by remember { mutableStateOf(0) }
    var decision by remember { mutableStateOf("Press a button") }

    // Column stacks vertically
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        // Vertically and horizontally aligns
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Should we go?",
            fontSize = 30.sp
        )

        Spacer(Modifier.height(24.dp))

        Text(
            text = decision,
            fontSize = 30.sp
        )

        Spacer(Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            // Evenly spaces out the buttons
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Button(
                onClick = {
                    numClicks += 1

                    if (Random.nextDouble() < 0.5) {
                        decision = "Yes"
                    } else {
                        decision = "No"
                    }
                }
            ) {
                Text("50%")
            }

            Button(
                onClick = {
                    numClicks += 1

                    if (Random.nextDouble() < 0.25) {
                        decision = "Yes"
                    } else {
                        decision = "No"
                    }
                }
            ) {
                Text("25%")
            }
            Button(
                onClick = {
                    numClicks += 1

                    if (Random.nextDouble() < 0.1) {
                        decision = "Yes"
                    } else {
                        decision = "No"
                    }
                }
            ) {
                Text("10%")
            }
        }
        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Clicks: $numClicks",
            fontSize = 20.sp
        )

        Text(
            text = "Student ID: 1871467",
            fontSize = 20.sp
        )

        Text(
            text = "CCID: hsb2",
            fontSize = 20.sp
        )
    }
}

