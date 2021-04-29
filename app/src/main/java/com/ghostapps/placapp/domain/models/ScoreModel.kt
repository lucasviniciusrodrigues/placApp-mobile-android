package com.ghostapps.placapp.domain.models

data class ScoreModel (
    var awayTeamScore: Int,
    var homeTeamScore: Int,
    var setIdentifier: Int
){
    constructor(): this(0,0,0)
}