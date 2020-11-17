package com.example.androidrandomuser.service

import com.example.androidrandomuser.model.ModelData
import retrofit2.Call
import retrofit2.http.GET

interface UserServices {
    @GET("products")
    fun getAllProduct(): Call<List<ModelData>>}
