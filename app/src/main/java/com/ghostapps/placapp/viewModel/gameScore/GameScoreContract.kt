package com.ghostapps.placapp.viewModel.gameScore

interface GameScoreContract {
    fun onExitPressed()

    fun declareWinner(winner: String)
}