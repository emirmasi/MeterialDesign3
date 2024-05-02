package com.practica.materialdesign.ui.componentes.AppBars

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BottomAppBar(

){
    ///en el componente el BottomBar esta creado desde el scafolding
    androidx.compose.material3.BottomAppBar(
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = null)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Edit, contentDescription = null )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Close, contentDescription = null)
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "agregar")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun BottomAppBarPreview(){
    Scaffold(
        bottomBar = { BottomAppBar()}
    ) { innerPadding->
        Text(text = "ejemplo de bottom bar",modifier = Modifier.padding(innerPadding))
    }
}
