package com.practica.materialdesign.ui.componentes.Buttoms

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
/*Botones de énfasis medio que contienen acciones que son importantes, pero no principales. Se vinculan bien con otros botones para indicar acciones
 secundarias alternativas, como "Cancelar" o "Atrás".*/
@Composable
fun OutlineButtomExample(
    text:String? = null,
    onClick:(()->Unit)? = null
){
    OutlinedButton(onClick = { onClick }) {
        Text(text = "$text")
    }
}

@Preview
@Composable
fun OutlineButtomPreview(){
    OutlineButtomExample(
        "Outlined"
    )
}