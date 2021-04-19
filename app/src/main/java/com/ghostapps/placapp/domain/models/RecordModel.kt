package com.ghostapps.placapp.domain.models

class RecordModel(
    val homeTeamName: String,
    val homeTeamSetScore: Int,

    val awayTeamName: String,
    val awayTeamSetScore: Int,
    val scoreModels: List<ScoreModel>,

    val date: Long
)