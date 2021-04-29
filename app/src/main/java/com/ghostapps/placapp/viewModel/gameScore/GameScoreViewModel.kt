package com.ghostapps.placapp.viewModel.gameScore

import com.ghostapps.placapp.data.records.remote.useCases.InsertFirestoreRegister
import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.models.ScoreModel
import com.ghostapps.placapp.domain.useCases.InsertRegister
import com.ghostapps.placapp.ui.home.HomeActivity
import com.ghostapps.placapp.viewModel.BaseViewModel
import java.util.*

class GameScoreViewModel(
    private val contract: GameScoreContract,
    private val insertRegister: InsertRegister
): BaseViewModel() {

    var homeTeamName = ""
    var awayTeamName = ""

    var formattedHomeTeamScore = "00"
    var formattedAwayTeamScore = "00"
    var formattedHomeTeamSetScore = "00"
    var formattedAwayTeamSetScore = "00"

    private var homeTeamSetScore = 0
    private var endMatchHomeTeamSetScore = 0
    private var homeTeamScore = 0

    private var awayTeamSetScore = 0
    private var endMatchAwayTeamSetScore = 0
    private var awayTeamScore = 0

    private var scores = mutableListOf<ScoreModel>()

    fun onCreate(homeTeamName: String, awayTeamName: String) {
        this.homeTeamName = homeTeamName
        this.awayTeamName = awayTeamName
    }

    fun onHomeTeamIncrease() {
        homeTeamScore++
        if(checksetChange(homeTeamScore, awayTeamScore)){
            homeTeamSetScore++
            saveSet()
            homeTeamScore = 0;
            awayTeamScore = 0;
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
            saveSet()
            homeTeamScore = 0;
            awayTeamScore = 0;
            checkAwayWin()
        }
        updateScore()
    }

    private fun saveSet() {
        endMatchHomeTeamSetScore = homeTeamSetScore
        endMatchAwayTeamSetScore = awayTeamSetScore
        scores.add (
            ScoreModel (
                awayTeamScore = awayTeamScore,
                homeTeamScore = homeTeamScore,
                setIdentifier = awayTeamSetScore + homeTeamSetScore
            )
        )
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
            && newScore >= 15 && newScore - oldScore > 1)
            return true;

        if(newScore >= 25 && newScore - oldScore > 1)
            return true;

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
        Thread {
            insertRegister.execute(
                    RecordModel(
                    homeTeamName = homeTeamName,
                    homeTeamSetScore = endMatchHomeTeamSetScore,
                    awayTeamName = awayTeamName,
                    awayTeamSetScore = endMatchAwayTeamSetScore,
                    scoreModels = scores,
                    date = Date().time
                )
            )
        }.start()
        contract.onExitPressed()
    }
}