package com.example.mvvmretrofitapplication.data.model

import com.google.gson.annotations.SerializedName

data class Media(
    @SerializedName("id")
    val id:String,

    @SerializedName("title")
    val title : String,

    @SerializedName("image")
    val image : String
)
