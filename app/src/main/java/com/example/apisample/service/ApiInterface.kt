package com.example.apisample.service

import com.example.apisample.model.ApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

internal interface ApiInterface {
    @GET("error")
    fun getSomething(
        @Query ("something") user:String
    ): Call<ApiModel>
}

//https://api.spacemonk.io/test/error?something=JP