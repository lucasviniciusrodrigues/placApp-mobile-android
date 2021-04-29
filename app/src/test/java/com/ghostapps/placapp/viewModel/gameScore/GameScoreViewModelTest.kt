package com.ghostapps.placapp.viewModel.gameScore

import com.ghostapps.placapp.data.records.local.useCases.InsertLocalRegister
import com.ghostapps.placapp.data.records.remote.useCases.InsertFirestoreRegister
import com.ghostapps.placapp.domain.useCases.InsertRegister
import com.ghostapps.placapp.viewModel.gameScore.GameScoreContract
import com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel
import com.nhaarman.mockito_kotlin.*
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class GameScoreViewModelTest {

    private val gameScoreContractMock: GameScoreContract = mock {}
    private val insertRegisterMock: InsertLocalRegister = mock {}

    private lateinit var sut: GameScoreViewModel

    @Before
    fun setup() {
        sut = GameScoreViewModel(gameScoreContractMock, insertRegisterMock)
    }

    //@Test
    fun `Should update team names correctly`() {
        val teamAName = "team_a"
        val teamBName = "team_b"

        sut.onCreate(teamAName, teamBName)

        assertEquals(sut.homeTeamName, teamAName)
        assertEquals(sut.awayTeamName, teamBName)
    }

    //@Test
    fun `Should increase home team score when onHomeTeamIncrease is called`() {
        sut.onHomeTeamIncrease()
        assertEquals(sut.formattedHomeTeamScore, "01")

        sut.onHomeTeamIncrease()
        assertEquals(sut.formattedHomeTeamScore, "02")
    }

    //@Test
    fun `Should increase away team score when onAwayTeamIncrease is called`() {
        sut.onAwayTeamIncrease()
        assertEquals(sut.formattedAwayTeamScore, "01")

        sut.onAwayTeamIncrease()
        assertEquals(sut.formattedAwayTeamScore, "02")
    }

    //@Test
    fun `Should decrease home team score when onHomeTeamIncrease is called`() {
        sut.onHomeTeamIncrease()
        sut.onHomeTeamIncrease()

        sut.onHomeTeamDecrease()
        assertEquals(sut.formattedHomeTeamScore, "01")
        sut.onHomeTeamDecrease()
        assertEquals(sut.formattedHomeTeamScore, "00")
    }

    //@Test
    fun `Should decrease away team score when onAwayTeamIncrease is called`() {
        sut.onAwayTeamIncrease()
        sut.onAwayTeamIncrease()

        sut.onAwayTeamDecrease()
        assertEquals(sut.formattedAwayTeamScore, "01")
        sut.onAwayTeamDecrease()
        assertEquals(sut.formattedAwayTeamScore, "00")
    }

    //@Test
    fun `Should save and exit the game when onExitPressed is called`() {
        sut.onExitPressed()

        verify(insertRegisterMock, times(1)).execute(any())
        verify(gameScoreContractMock, times(1)).onExitPressed()
    }

    //@Test
    fun `Should change set when home team achieve 25 points with at least 2 points of difference`() {
        for(i in 1..25)
            sut.onHomeTeamIncrease()

        assertEquals(sut.formattedHomeTeamSetScore, "01")
    }

    //@Test
    fun `Should change set when away team achieve 25 points with at least 2 points of difference`() {
        for(i in 1..25)
            sut.onAwayTeamIncrease()

        assertEquals(sut.formattedAwayTeamSetScore, "01")
    }

    //@Test
    fun `Should only change set after 2 points of difference`() {
        for(i in 1..24)
            sut.onHomeTeamIncrease()
        for(i in 1..25)
            sut.onAwayTeamIncrease()

        assertEquals(sut.formattedAwayTeamSetScore, "00")
        sut.onAwayTeamIncrease()

        assertEquals(sut.formattedAwayTeamSetScore, "01")
    }

}