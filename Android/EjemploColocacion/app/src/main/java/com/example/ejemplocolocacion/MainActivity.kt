package com.example.ejemplocolocacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejemplocolocacion.ui.theme.EjemploColocacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemploColocacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        text1 = "Android",
                        text2 = "Profeta",
                        text3 = "Mohammad"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(text1: String, text2: String, text3: String, modifier: Modifier = Modifier) {
    Row() {
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.weight(1.0F)

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .weight(2.0F)
                    .fillMaxWidth()
                    .background(color = Color.Green)
            ) {
                Text(
                    text = text1,
                    color = Color.Red,
                    textAlign = TextAlign.Center
                )
            }

            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .weight(1.0F)
                    .fillMaxWidth()
                    .background(color = Color.Red)
            ) {
                Text(
                    text = text2,
                    color = Color.Cyan,
                    textAlign = TextAlign.Center
                )
            }

            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1.0F)
                    .fillMaxWidth()
                    .background(color = Color.Cyan)
            ) {
                Text(
                    text = text3,
                    color = Color.Green,
                    textAlign = TextAlign.Center
                )
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1.0F)
        ) {
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .weight(1.0F)
                    .fillMaxWidth()
                    .background(color = Color.Magenta)
            ) {
                Text(
                    text = text2,
                    color = Color.DarkGray,
                    textAlign = TextAlign.Center
                )
            }

            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(1.0F)
                    .fillMaxWidth()
                    .background(color = Color.DarkGray)
            ) {
                Text(
                    text = text3,
                    color = Color.Yellow,
                    textAlign = TextAlign.Center
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .weight(2.0F)
                    .fillMaxWidth()
                    .background(color = Color.Yellow)
            ) {
                Text(
                    text = text1,
                    color = Color.Magenta,
                    textAlign = TextAlign.Center
                )

            }
        }

        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .weight(1.0F)
        ) {
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .weight(1.0F)
                    .fillMaxWidth()
                    .background(color = Color.Blue)
            ) {
                Text(
                    text = text3,
                    textAlign = TextAlign.Center
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .weight(2.0F)
                    .fillMaxWidth()
            ) {
                Text(
                    text = text1,
                    color = Color.Blue,
                    textAlign = TextAlign.Center
                )
            }

            Row(
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .weight(1.0F)
                    .fillMaxWidth()
                    .background(color = Color.Black)
            ) {
                Text(
                    text = text2,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjemploColocacionTheme {
        Greeting("Android", text2 = "Profeta", text3 = "Coche")
    }
}