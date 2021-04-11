package com.ghostapps.placapp.viewModel.gameScore

import com.ghostapps.placapp.viewModel.BaseViewModel

class GameScoreViewModel(
    val contract: GameScoreContract
): BaseViewModel() {

    var homeTeamName = ""
    var awayTeamName = ""

    var homeTeamScore = 0
    var homeTeamSetScore = 0

    var awayTeamScore = 0
    var awayTeamSetScore = 0

    var formattedHomeTeamScore = "00"
    var formattedAwayTeamScore = "00"
    var formattedHomeTeamSetScore = "00"
    var formattedAwayTeamSetScore = "00"

    fun onCreate(homeTeamName: String, awayTeamName: String) {
        this.homeTeamName = homeTeamName
        this.awayTeamName = awayTeamName
    }

    fun onHomeTeamIncrease() {
        homeTeamScore++
        if(checksetChange(homeTeamScore, awayTeamScore)){
            homeTeamSetScore++
            checkHomeWin()
        }
        updateScore()
    }

    fun onHomeTeamDecrease() {
        if (homeTeamScore > 0) homeTeamScore--
        updateScore()
    }

    fun onAwayTeamIncrease() {
        awayTeamScore++
        if(checksetChange(awayTeamScore, homeTeamScore)){
            awayTeamSetScore++
            checkAwayWin()
        }
        updateScore()
    }

    fun onAwayTeamDecrease() {
        if (awayTeamScore > 0) awayTeamScore--
        updateScore()
    }

    private fun checkifMatchEnd(winnerTeamSetScore: Int, anotherTeamSetScore: Int): Boolean{
        if(winnerTeamSetScore - anotherTeamSetScore > 2
            || winnerTeamSetScore + anotherTeamSetScore == 5){
            homeTeamSetScore = 0
            awayTeamSetScore = 0
            return true;
        }
        return false;
    }

    private fun checksetChange(newScore: Int, oldScore: Int): Boolean {

        if(homeTeamSetScore == 2 && awayTeamSetScore == 2
            && newScore >= 15 && newScore - oldScore > 1){
            homeTeamScore = 0;
            awayTeamScore = 0;
            return true;
        }

        if(newScore >= 25 && newScore - oldScore > 1){
            homeTeamScore = 0;
            awayTeamScore = 0;
            return true;
        }

        return false;
    }

    private fun checkHomeWin() {
        if(checkifMatchEnd(homeTeamSetScore, awayTeamSetScore))
            contract.declareWinner(homeTeamName)
    }

    private fun checkAwayWin() {
        if(checkifMatchEnd(awayTeamSetScore, homeTeamSetScore))
            contract.declareWinner(awayTeamName)
    }

    private fun updateScore() {
        formattedHomeTeamScore = String.format("%02d", homeTeamScore)
        formattedAwayTeamScore = String.format("%02d", awayTeamScore)
        formattedHomeTeamSetScore = String.format("%02d", homeTeamSetScore)
        formattedAwayTeamSetScore = String.format("%02d", awayTeamSetScore)

        notifyChange()
    }

    fun onExitPressed() {
        contract.onExitPressed()
    }
}