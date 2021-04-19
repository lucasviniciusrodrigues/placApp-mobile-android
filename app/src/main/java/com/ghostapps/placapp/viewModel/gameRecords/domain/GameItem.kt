package com.ghostapps.placapp.viewModel.gameRecords.domain

sealed class GameItem() {

    data class Record(
        val homeTeamName: String,
        val homeTeamSetScore: Int,
        val awayTeamName: String,
        val awayTeamSetScore: Int,
        val date: Long
    ): GameItem()

    data class Score(
        val awayTeamScore: Int,
        val homeTeamScore: Int,
        val setIdentifier: Int
    ): GameItem()

}