package com.practica.materialdesign.ui.componentes.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.practica.materialdesign.R

/*El elemento componible Card actúa como un contenedor de Material Design para
 tu IU. Por lo general, las tarjetas presentan un solo contenido coherente.
  Los siguientes son algunos ejemplos de casos en los que puedes usar una
  tarjeta:
Un producto en una app de compras
Una noticia en una app de noticias
Un mensaje en una app de comunicación.
*/

@Composable
fun FilledCard(

) {
    Card(
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        /*imagen que ocupe la mitad del alto */
        Column(

        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Aca va el titulo de la card",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Descripcion del articulo",
                    style = MaterialTheme.typography.titleMedium
                )
            }
            /*aca va los botones*/
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Box() {
                    Row {
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "perros")
                        }
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "gatos")
                        }
                    }

                }

                Box() {
                    Row {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.Delete, contentDescription = null)
                        }
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.Email, contentDescription = null)
                        }
                    }
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun FilledCarPreview(

) {
    FilledCard()
}