package com.ghostapps.placapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_score_game.*

class GameScoreActivity: AppCompatActivity() {

    companion object {
        const val TEAM_HOME_NAME = "home_team_name"
        const val TEAM_AWAY_NAME = "away_team_name"
    }
    
    var homeTeamScore = 0
    var homeTeamSetScore = 0

    var awayTeamScore = 0
    var awayTeamSetScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_game)

        gameScoreHomeTeamName.text = intent.getStringExtra(TEAM_HOME_NAME)
        gameScoreAwayTeamName.text = intent.getStringExtra(TEAM_AWAY_NAME)

        gameScoreHomeIncrease.setOnClickListener { 
            homeTeamScore++
            if(checksetChange(homeTeamScore, awayTeamScore)){
                homeTeamSetScore++
                checkHomeWin()
            }
            updateScore()
        }
        
        gameScoreHomeDecrease.setOnClickListener { 
            if (homeTeamScore > 0) homeTeamScore--
            updateScore()
        }
        
        gameScoreAwayIncrease.setOnClickListener {  
            awayTeamScore++
            if(checksetChange(awayTeamScore, homeTeamScore)){
                awayTeamSetScore++
            }
            updateScore()
        }
        
        gameScoreAwayDecrease.setOnClickListener { 
            if (awayTeamScore > 0) awayTeamScore--
            updateScore()
        }

        gameScoreExitButton.setOnClickListener {
            finish()
        }
    }

    private fun checkHomeWin() {
        if(checkWinner(homeTeamSetScore, awayTeamSetScore)){
            Toast.makeText(this, "O time " + intent.getStringExtra(TEAM_HOME_NAME) + " venceu", Toast.LENGTH_SHORT).show()
        }
    }

    private fun checkAwayWin() {
        if(checkWinner(awayTeamSetScore, homeTeamSetScore)){
            Toast.makeText(this, "O time " + intent.getStringExtra(TEAM_AWAY_NAME) + " venceu", Toast.LENGTH_SHORT).show()
        }
    }

    private fun checkWinner(winnerTeamSetScore: Int, anotherTeamSetScore: Int): Boolean{
        if(winnerTeamSetScore - anotherTeamSetScore > 2){
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

    private fun updateScore() {
        gameScoreHomeTeamScore.text = String.format("%02d", homeTeamScore)
        gameScoreAwayTeamScore.text = String.format("%02d", awayTeamScore)
        gameScoreHomeSetScore.text = String.format("%02d", homeTeamSetScore)
        gameScoreAwaySetScore.text = String.format("%02d", awayTeamSetScore)
    }

}