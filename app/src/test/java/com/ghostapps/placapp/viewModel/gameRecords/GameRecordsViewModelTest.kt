package com.ghostapps.placapp.viewModel.gameRecords

import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.models.ScoreModel
import com.ghostapps.placapp.domain.useCases.DeleteRegister
import com.ghostapps.placapp.domain.useCases.GetAllRegister
import com.nhaarman.mockito_kotlin.*
import org.junit.Before
import org.junit.Test

class GameRecordsViewModelTest {

    private val getAllRegisterMock: GetAllRegister = mock {
        given{ it.execute() }
            .willReturn { arrayOf<RecordModel>(getRecordModelMock())
            }
    }

    private fun getRecordModelMock() =
        RecordModel(
        "home",
        1,
        "away",
        1,
        listOf<ScoreModel>(
            ScoreModel(
                25,
                0,
                1
            )
        ),
        1
    )

    private val deleteRegisterMock: DeleteRegister = mock {}

    private lateinit var sut: GameRecordsViewModel

    @Before
    fun setup() {
        sut = GameRecordsViewModel(getAllRegisterMock, deleteRegisterMock)
    }

    @Test
    fun `Should load records and parse to GameItem without fail `(){
        sut.loadRecords()
        verify(getAllRegisterMock, times(1)).execute()

    }

    @Test
    fun `Should delete record and load records again`(){
        sut.deleteRegister(getRecordModelMock())
        verify(deleteRegisterMock, times(1)).execute(any())
        verify(getAllRegisterMock, times(1)).execute()

    }

}