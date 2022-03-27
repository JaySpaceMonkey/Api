package com.example.apisample.service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitServiceBuilder {
    private const val baseURL = "https://api.spacemonk.io/test/"
    private val okHttp = OkHttpClient.Builder()

    private val builder = Retrofit.Builder().baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttp.build())
    private val retrofit = builder.build()

    fun <T> buildService(serviceType: Class<T>): T {
        return retrofit.create(serviceType)

    }
}