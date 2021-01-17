package com.example.mvvmretrofitapplication.data.repository

import com.example.mvvmretrofitapplication.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
   // suspend fun getUsers() = apiHelper.getUsers()
    suspend fun getMyData() = apiHelper.getMyData()
}