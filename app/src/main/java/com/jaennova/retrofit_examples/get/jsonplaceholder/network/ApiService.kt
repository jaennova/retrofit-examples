package com.jaennova.retrofit_examples.get.jsonplaceholder.network

// ApiService.kt
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
