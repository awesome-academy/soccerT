package com.example.soccert.data.model

import com.google.gson.annotations.SerializedName

data class Away(
    @SerializedName("coach")
    val coach: List<Coach>,
    @SerializedName("missing_players")
    val missing_players: List<MissingPlayer>,
    @SerializedName("starting_lineups")
    val starting_lineups: List<StartingLineup>,
    @SerializedName("substitutes")
    val substitutes: List<Substitute>
)
