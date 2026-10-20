package com.example.p1_tarjetapresentacion_rodrigo_adrian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_rodrigo_adrian.ui.theme.P1_TarjetaPresentacion_Rodrigo_AdrianTheme
import java.nio.file.WatchEvent
import kotlin.math.ulp

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
        verticalAlignment = Alignment.CenterVertically
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
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            Spacer(modifier = Modifier.weight(0.35f))

            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.weight(0.65f)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "Teléfono",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        text = phoneNumber,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Red Social",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        text = socialMedia,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.Mail,
                        contentDescription = "Correo",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        text = mail,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }
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