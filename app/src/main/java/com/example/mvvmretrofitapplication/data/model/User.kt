package com.example.mvvmretrofitapplication.data.model

import com.google.gson.annotations.SerializedName

data class User(
        @SerializedName("avatar")
        val avatar: String,
        @SerializedName("email")
        val email: String,
        @SerializedName("id")
        val id: String,
        @SerializedName("name")
        val name: String
)
/*data class User(
    @SerializedName("comments")
    val comments: String,

    @SerializedName("content")
    val content: String,

    @SerializedName("id")
    val id: String,

    @SerializedName("likes")
    val likes: String,

    @SerializedName("media")
    val Media: Media
)*/
