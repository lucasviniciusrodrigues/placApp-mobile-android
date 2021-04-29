package com.ghostapps.placapp.data.records

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.models.ScoreModel

@Entity(tableName = RecordEntity.TABLE_NAME)
class RecordEntity(

    val homeTeamName: String,
    val homeTeamSetScore: Int,

    val awayTeamName: String,
    val awayTeamSetScore: Int,

    val scores: MutableList <ScoreEntity>,

    @PrimaryKey
    val date: Long
) {

    companion object {
        const val TABLE_NAME = "records_database"

        fun fromModel(recordModel: RecordModel): RecordEntity {
            return RecordEntity(
                homeTeamName = recordModel.homeTeamName,
                homeTeamSetScore = recordModel.homeTeamSetScore,
                awayTeamName = recordModel.awayTeamName,
                awayTeamSetScore = recordModel.awayTeamSetScore,
                scores = scoreToEntity(recordModel.scoreModels),
                date = recordModel.date
            )
        }

        private fun scoreToEntity(scoreModels: List<ScoreModel>): MutableList <ScoreEntity> {
            val scoreEntity = mutableListOf<ScoreEntity>()

            scoreModels.forEach{
                scoreEntity.add(
                    ScoreEntity(
                        awayTeamScore = it.awayTeamScore,
                        homeTeamScore = it.homeTeamScore,
                        setIdentifier = it.setIdentifier
                    )
                )
            }

            return scoreEntity
        }
    }

    fun toModel(): RecordModel {
        return RecordModel(
            homeTeamName = homeTeamName,
            homeTeamSetScore = homeTeamSetScore,
            awayTeamName = awayTeamName,
            awayTeamSetScore = awayTeamSetScore,
            scoreModels = toScoreModel(),
            date = date
        )
    }

    fun toScoreModel(): MutableList<ScoreModel> {
        val scoreModels = mutableListOf<ScoreModel>()

        scores.forEach{
            scoreModels.add(
                ScoreModel(
                    awayTeamScore = it.awayTeamScore,
                    homeTeamScore = it.homeTeamScore,
                    setIdentifier = it.setIdentifier
                )
            )
        }

        return scoreModels
    }
}
