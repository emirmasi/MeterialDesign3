package com.practica.materialdesign.ui.componentes.AppBars

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SmallTopAppBar(

){
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        ),
        title = {
                Text(text = "Small top App bar")
        },
    )
}

@Preview(showBackground = true)
@Composable
fun SmallTopAppBarPreview(){

    Scaffold(
        topBar = { SmallTopAppBar()}
    ) {innerPadding->
        Text(text = "Small Top App Bars",modifier = Modifier.padding(innerPadding))
    }
}