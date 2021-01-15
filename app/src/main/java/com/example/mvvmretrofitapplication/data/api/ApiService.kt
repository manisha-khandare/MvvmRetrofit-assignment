package com.example.mvvmretrofitapplication.data.api

import com.example.mvvmretrofitapplication.data.model.Media
import com.example.mvvmretrofitapplication.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
 /*   @GET("media")
    suspend fun getMedia(): List<Media>*/

}