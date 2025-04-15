package com.tecsup.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
fun Boton() {
    var selectedIndex by remember { mutableIntStateOf(0) }
    val items = listOf("Inicio", "Buscar", "Perfil")

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(Icons.Default.Home, contentDescription = null) },
                label = { Text(item) },
                selected = selectedIndex == index,
                onClick = { selectedIndex = index }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab04Theme {
        Boton()
    }
}
