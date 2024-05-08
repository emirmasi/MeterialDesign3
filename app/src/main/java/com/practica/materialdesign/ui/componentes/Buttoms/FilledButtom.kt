package com.practica.materialdesign.ui.componentes.Buttoms

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/*Proposito = Botones de alto énfasis. Son para las acciones principales en una aplicación, como "enviar" y
"guardar". El efecto sombra enfatiza la importancia del botón.*/
@Composable
fun FilledButtom(
    text:String? = null,
    onClick:(()->Unit)? = null
){
    Button(onClick = { onClick }) {
        Text(text = "$text")
    }
}

@Preview(showBackground = true)
@Composable
fun ButtomFilledPreview(){
    FilledButtom(
        text = "Guardar"
    )
}