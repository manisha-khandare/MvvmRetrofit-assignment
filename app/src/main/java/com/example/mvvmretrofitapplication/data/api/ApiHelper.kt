package com.example.mvvmretrofitapplication.data.api

class ApiHelper(private val apiService: ApiService) {

    //suspend fun getUsers() = apiService.getUsers()
    suspend fun getMyData() = apiService.getMyData()
}