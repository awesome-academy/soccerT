package com.example.soccert.data.model

import com.google.gson.annotations.SerializedName

data class StartingLineup(
    @SerializedName("lineup_number")
    val lineupNumber: String,
    @SerializedName("lineup_player")
    val lineupPlayer: String,
    @SerializedName("lineup_position")
    val lineupPosition: String
)
