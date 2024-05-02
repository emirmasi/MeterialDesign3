package com.practica.materialdesign.ui.componentes.Badges

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Badge(
    value: Int,
    icon: ImageVector,
    iconDescription: String?=null,
) {
    BadgedBox(
        badge = {
            androidx.compose.material3.Badge(

            ) {
                Text(
                    text = "$value",
                    modifier = Modifier.semantics {
                        contentDescription = "$value new notification"
                    }
                )
            }
        }
    ) {
        Icon(imageVector = icon, contentDescription = iconDescription)
    }

}

@Preview
@Composable
fun BadgePreview(

) {
    Surface {
        NavigationBar {
            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Badge(
                        value = 800,
                        icon = Icons.Default.Email,
                        iconDescription = ""
                    )
                },
                label = { Text(text = "email")}
            )
            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Badge(
                        value = 8000,
                        icon = Icons.Default.Email,
                        iconDescription = ""
                    )
                },
                label = { Text(text = "email")}
            )
            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Badge(
                        value = 0,
                        icon = Icons.Default.Email,
                        iconDescription = ""
                    )
                },
                label = { Text(text = "email")}
            )
            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Badge(
                        value = 8,
                        icon = Icons.Default.Email,
                        iconDescription = ""
                    )
                },
                label = { Text(text = "email")}
            )
        }

    }
}