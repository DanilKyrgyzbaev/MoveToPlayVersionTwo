package com.example.data.api

import com.example.data.model.Model
import retrofit2.http.GET

interface Api {
    @GET("/v1/coins")
    suspend fun getCoins(): List<Model>
}