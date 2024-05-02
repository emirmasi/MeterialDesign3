package com.practica.materialdesign.ui.componentes.Buttoms

import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
/*También para acciones principales o importantes. Los botones rellenos proporcionan
 más peso visual y funciones de traje como “agregar al carrito” y “Acceder”.*/
@Composable
fun TonalExample(
    text: String? = null,
    onClick:(()->Unit)? = null
){
    FilledTonalButton(onClick = { onClick }) {
        Text(text = "$text")
    }
}

@Preview
@Composable
fun TonalButtomPreview(){
    TonalExample(
        "Guardar"
    )
}