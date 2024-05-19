package com.jaennova.retrofit_examples.get.catapi.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.jaennova.retrofit_examples.R
import com.jaennova.retrofit_examples.get.catapi.network.Cats


@Composable
fun CatItem(cat: Cats) {
    val painter = rememberCoilPainter(request = cat.url)

    Image(
        painter = painter,
        contentDescription = "Cat Image",
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun rememberCoilPainter(request: String): Painter {
    return rememberImagePainter(
        data = request,
        builder = {
            crossfade(true)
            placeholder(R.drawable.ic_launcher_foreground)
            error(R.drawable.ic_launcher_foreground)
        }
    )

}
