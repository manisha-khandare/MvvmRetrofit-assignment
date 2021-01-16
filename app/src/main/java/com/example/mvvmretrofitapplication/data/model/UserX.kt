package com.example.mvvmretrofitapplication.data.model


import com.google.gson.annotations.SerializedName

data class UserX(
    @SerializedName("about")
    val about: String,
    @SerializedName("avatar")
    val avatar: String,
    @SerializedName("blogId")
    val blogId: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("designation")
    val designation: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("lastname")
    val lastname: String,
    @SerializedName("name")
    val name: String
)