package com.example.mvvmretrofitapplication.data.model


import com.google.gson.annotations.SerializedName

data class MediaX(
    @SerializedName("blogId")
    val blogId: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String
)