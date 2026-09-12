/*
Sources:
    https://developer.android.com/develop/ui/compose/layouts/basics
    https://www.geeksforgeeks.org/kotlin/spacer-in-android-jetpack-compose/
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment0Theme {

            }
        }
    }
}

@Composable
fun MakeDecision(){
    var numClicks by remember { mutableIntStateOf(0) }
    var decision by remember { mutableStateOf("") }

    // Column stacks horizontally
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
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

    }

}

