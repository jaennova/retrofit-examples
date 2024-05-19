package com.jaennova.retrofit_examples.get.catapi.network

// ApiService.kt
import retrofit2.http.GET

interface ApiService {
    @GET("search?limit=10")
    suspend fun getCats(): List<Cats>
}
