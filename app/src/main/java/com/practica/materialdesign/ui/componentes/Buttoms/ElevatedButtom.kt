package com.practica.materialdesign.ui.componentes.Buttoms

import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ElevatedButtomExample(
    text:String? = null,
    onClick:(()->Unit)? = null
){
    ElevatedButton(onClick = { onClick }) {
        Text(text = "$text")
    }
}

@Preview
@Composable
fun ElevatedButtomPreview(){
    ElevatedButtomExample(
        "Guardar"
    )
}