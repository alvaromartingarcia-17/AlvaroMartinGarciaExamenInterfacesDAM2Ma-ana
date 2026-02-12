package com.example.alvaromartingarciaexameninterfacesdam2maana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NombresYapellidos()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun NombresYapellidos() {
    var contadorlikes by rememberSaveable { mutableStateOf(0) }
    Column {

        Column {
            Text(text = "Alvaro")
            Text(text = "Martin Garcia")
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.pikachu),
                contentDescription = "Likes",
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .padding(12.dp)
                    .background(Color.LightGray)
                .clickable {
                contadorlikes++;
                },
                contentScale = ContentScale.Crop
            )
            Text(text = "Pikachu $contadorlikes", fontSize = 20.sp)
        }
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.patogafas),
                        contentDescription = "Foto",
                        modifier = Modifier
                            .size(200.dp)
                            .height(200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "PatoGafas", fontSize = 20.sp)
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gato),
                        contentDescription = "Foto",
                        modifier = Modifier
                            .size(200.dp)
                            .height(200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Gato Tonto", fontSize = 20.sp)
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hampster),
                        contentDescription = "Foto",
                        modifier = Modifier
                            .size(200.dp)
                            .height(200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Freaky Hampster", fontSize = 20.sp)
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hamster),
                        contentDescription = "Foto",
                        modifier = Modifier
                            .size(200.dp)
                            .height(200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Hamster Tonto", fontSize = 20.sp)
                }
            }
        }
        LazyRow(
            contentPadding = PaddingValues(16.dp),
        ) {
            item {
                Row(
                    modifier = Modifier
                        .height(120.dp)
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.inosaurio),
                        contentDescription = "Foto",
                        modifier = Modifier
                            .size(200.dp)
                            .height(200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Iñosaurio", fontSize = 20.sp, modifier = Modifier.size(100.dp))
                }
                Row(
                    modifier = Modifier
                        .height(120.dp)
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.motospablo),
                        contentDescription = "Foto",
                        modifier = Modifier
                            .size(200.dp)
                            .height(200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Motos Pablo", fontSize = 20.sp, modifier = Modifier.size(100.dp))
                }
                Row(
                    modifier = Modifier
                        .height(120.dp)
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pablomotos),
                        contentDescription = "Foto",
                        modifier = Modifier
                            .size(200.dp)
                            .height(200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Pablo Motos", fontSize = 20.sp, modifier = Modifier.size(100.dp))
                }
                Row(
                    modifier = Modifier
                        .height(120.dp)
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pinguino),
                        contentDescription = "Foto",
                        modifier = Modifier
                            .size(200.dp)
                            .height(200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(text = "Pinguino esperanzador", fontSize = 20.sp, modifier = Modifier.size(100.dp))
                }
            }
        }
    }
}