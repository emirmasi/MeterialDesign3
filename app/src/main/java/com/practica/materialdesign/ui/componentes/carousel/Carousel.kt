package com.practica.materialdesign.ui.componentes.carousel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import kotlin.math.pow

/*es un componente */
@OptIn(ExperimentalPagerApi::class)
@Composable
fun <T> Carousel(
    list:List<T>,
    onItemSelected: (T)->Unit,
    imageContent: @Composable (T) ->Unit
){
    /*en caso de que la lista este vacia*/
    if(list.isEmpty()){
        Text(
            text = "no hay fotos para mostrar",
            textAlign = TextAlign.Center
        )
        return
    }
    val pagerState = rememberPagerState(initialPage = 0)
    /*hasta aca es una */
    com.google.accompanist.pager.HorizontalPager(
        count = list.size,
        state = pagerState,
        modifier = Modifier
            .height(350.dp)
    ) {pager->
        /*tengo que hacer una animacion con la escala*/
        val currentPage = pagerState.currentPage
        val scaleFact = 0.5.pow(currentPage-pager)
        Card(
            modifier = Modifier
                .fillMaxHeight()
                .graphicsLayer {
                    /*modificar la escala del ancho de la imagen */
                    scaleY = scaleFact.toFloat()
                    /*modificar la opacidad*/
                    alpha = if (scaleFact > 0.5f) 1f else 0.5f
                }
        ) {
           imageContent(list[pager])
        }
    }
}

@Preview
@Composable
fun CarouselPreview(){
    Carousel(
        list = listOf(
        "https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492_1280.jpg"
        ),
        onItemSelected ={}
    ) {data->
        Box(modifier = Modifier.fillMaxSize()){
            AsyncImage(model = ImageRequest
                .Builder(LocalContext.current)
                .data(data)
                .build(),
                contentDescription = null)
        }

    }
}