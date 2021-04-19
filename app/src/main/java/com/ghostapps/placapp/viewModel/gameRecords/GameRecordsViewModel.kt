package com.ghostapps.placapp.viewModel.gameRecords

import androidx.lifecycle.MutableLiveData
import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.useCases.DeleteRegister
import com.ghostapps.placapp.domain.useCases.GetAllRegister
import com.ghostapps.placapp.viewModel.BaseViewModel
import com.ghostapps.placapp.viewModel.gameRecords.domain.GameItem

class GameRecordsViewModel(
    private val getAllRegister: GetAllRegister,
    private val deleteRegister: DeleteRegister
): BaseViewModel() {

    val recordsList = MutableLiveData<List<GameItem>>()

    fun loadRecords() {
        Thread {
            val recordsModel = getAllRegister.execute().flatMap { recordModel ->
                val arrayList = arrayListOf<GameItem>()

                arrayList.add(
                    GameItem.Record(
                        homeTeamName = recordModel.homeTeamName,
                        homeTeamSetScore = recordModel.homeTeamSetScore,
                        awayTeamName = recordModel.awayTeamName,
                        awayTeamSetScore = recordModel.awayTeamSetScore,
                        date = recordModel.date
                    )
                )

                arrayList.addAll(
                    recordModel.scoreModels.map { score ->
                        GameItem.Score(
                            homeTeamScore = score.homeTeamScore,
                            awayTeamScore = score.awayTeamScore,
                            setIdentifier = score.setIdentifier
                        )
                    }
                )

                arrayList
            }
            recordsList.postValue(recordsModel)
        }.start()
    }

    fun deleteRegister(recordModel: RecordModel) {
        Thread {
            deleteRegister.execute(recordModel)
            loadRecords()
        }.start()
    }

}