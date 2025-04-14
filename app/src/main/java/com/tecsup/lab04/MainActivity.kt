package com.tecsup.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tecsup.lab04.ui.theme.Lab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = { Boton() }
                ) { innerPadding ->
                    Text(
                        text = "Contenido principal",
                        modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWith()  // ERROR: fillMaxWith no existe
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
            fontWeight = FontWeigh.Bold  // ERROR: FontWeigh -> FontWeight
        )
        Spacer(modifier = Modifier.heigh(16.dp))  // ERROR: heigh -> height
        Text(
            text = "Hello, Student!",
            fontSize = 20.xD  // ERROR: 20.xD no es válido
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab04Theme {
        ViewHolaCurso()
    }
}
