package com.example.mvvmretrofitapplication.data.model


import com.google.gson.annotations.SerializedName

data class MyClasItem(
    @SerializedName("comments")
    val comments: Int,
    @SerializedName("content")
    val content: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("likes")
    val likes: Int,
    @SerializedName("media")
    val media: List<MediaX>,
    @SerializedName("user")
    val user: List<UserX>
)