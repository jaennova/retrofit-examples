package com.jaennova.retrofit_examples.get.catapi.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import com.jaennova.retrofit_examples.get.catapi.network.CatApiProvider
import com.jaennova.retrofit_examples.get.catapi.network.Cats
import com.jaennova.retrofit_examples.get.jsonplaceholder.network.Post
import com.jaennova.retrofit_examples.get.jsonplaceholder.ui.PostItem


private val apiService by lazy { CatApiProvider.catApiService() }
private val postsState = mutableStateOf(emptyList<Cats>())

@Composable
fun FetchAndDisplayPosts() {
    LaunchedEffect(Unit) {
        try {
            val cats = apiService.getCats()
            postsState.value = cats
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

@Composable
fun CatApiScreen() {
    FetchAndDisplayPosts()
    LazyColumn {
        items(postsState.value) { cat ->
            CatItem(cat)
        }
    }
}