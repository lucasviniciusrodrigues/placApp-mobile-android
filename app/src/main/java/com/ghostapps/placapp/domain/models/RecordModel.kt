package com.ghostapps.placapp.domain.models

data class RecordModel(
    var homeTeamName: String,
    var homeTeamSetScore: Int,

    var awayTeamName: String,
    var awayTeamSetScore: Int,
    var scoreModels: List<ScoreModel>,

    var date: Long
){
    constructor() : this("",0,"", 0, listOf<ScoreModel>(), 0) {}
}