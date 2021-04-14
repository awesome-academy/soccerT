package com.example.soccert.data.model

import com.google.gson.annotations.SerializedName

data class HomeReplace(
    @SerializedName("substitution")
    val substitution: String,
    @SerializedName("time")
    val time: String
)
