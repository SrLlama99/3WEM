package com.example.p1_tarjetapresentacion_rodrigo_adrian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_rodrigo_adrian.ui.theme.P1_TarjetaPresentacion_Rodrigo_AdrianTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            P1_TarjetaPresentacion_Rodrigo_AdrianTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Presentation(
                        name = "Android",
                        title = "A",
                        phoneNumber = "00000000000",
                        socialMedia = "@Pito",
                        mail = "Pito@Pito.pito"
                    )
                }
            }
        }
    }
}

@Composable
fun Presentation(name: String, title: String, phoneNumber: String, socialMedia: String, mail: String, modifier: Modifier = Modifier) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(bottom = 20.dp)
    ) {
        Column() {

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 2.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.images),
                        contentDescription = null
                    )
                }
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 2.dp)
            ) {
                Text(
                    text = name,
                    fontSize = 36.sp
                )
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = title,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    P1_TarjetaPresentacion_Rodrigo_AdrianTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Presentation(
                name = "Android",
                title = "A",
                phoneNumber = "00000000000",
                socialMedia = "@Pito",
                mail = "Pito@Pito.pito"
            )
        }
    }
}