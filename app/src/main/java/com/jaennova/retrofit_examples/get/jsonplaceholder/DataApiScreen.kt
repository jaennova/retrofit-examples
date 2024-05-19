package com.jaennova.retrofit_examples.get.jsonplaceholder

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import com.jaennova.retrofit_examples.get.jsonplaceholder.network.Post
import com.jaennova.retrofit_examples.get.jsonplaceholder.network.RetrofitProvider
import com.jaennova.retrofit_examples.get.jsonplaceholder.ui.PostItem

private val apiService by lazy { RetrofitProvider.getApiService() }
private val postsState = mutableStateOf(emptyList<Post>())

@Composable
fun FetchAndDisplayPosts() {
    LaunchedEffect(Unit) {
        try {
            val posts = apiService.getPosts()
            postsState.value = posts
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

@Composable
fun DataApiScreen() {
    FetchAndDisplayPosts()
    LazyColumn {
        items(postsState.value) { post ->
            PostItem(post)
        }
    }
}

