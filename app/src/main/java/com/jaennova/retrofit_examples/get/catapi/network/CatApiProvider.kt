package com.jaennova.retrofit_examples.get.catapi.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CatApiProvider {
    private const val BASE_URL = "https://api.thecatapi.com/v1/images/"

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun catApiService(): ApiService {
        return getRetrofit().create(ApiService::class.java)
    }
}
