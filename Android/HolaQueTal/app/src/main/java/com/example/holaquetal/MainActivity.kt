package com.example.holaquetal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.holaquetal.ui.theme.HolaQueTalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HolaQueTalTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    Greeting(text1 = stringResource(R.string.hola),
                        text2 = stringResource(R.string.que),
                        text3 = stringResource(R.string.tal)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(text1: String, text2: String, text3: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .border(BorderStroke(width = 3.dp, Color.Black))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .weight(1.0F)
                .fillMaxWidth()
                .padding(top = 5.dp)
                .padding(bottom = 1.dp)
                .padding(horizontal = 5.dp)
                .border(BorderStroke(2.dp, Color.Cyan))
        ) {
            Text(
                text = text1,
                color = Color.Blue,
                textAlign = TextAlign.Center
            )
        }

        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .weight(1.0F)
                .fillMaxWidth()
                .padding(top = 1.dp)
                .padding(bottom = 1.dp)
                .padding(horizontal = 5.dp)
                .border(BorderStroke(2.dp, Color.Cyan))
        ) {
            Text(
                text = text2,
                color = Color.Blue,
                modifier = Modifier
                    .padding(horizontal = 12.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .weight(1.0F)
                .fillMaxWidth()
                .padding(top = 1.dp)
                .padding(bottom = 5.dp)
                .padding(horizontal = 5.dp)
                .border(BorderStroke(2.dp, Color.Cyan))
        ) {
            Text(
                text = text3,
                color = Color.Blue,
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .padding(bottom = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HolaQueTalTheme {
        Greeting("HOLA", text2 = "QUE", text3 = "TAL?")
    }
}