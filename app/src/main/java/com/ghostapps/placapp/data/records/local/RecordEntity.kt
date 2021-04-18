package com.ghostapps.placapp.data.records.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.ghostapps.placapp.data.records.local.converters.ScoreConverter
import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.models.Score

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
                scores = scoreToEntity(recordModel.scores),
                date = recordModel.date
            )
        }

        private fun scoreToEntity(scores: List<Score>): MutableList <ScoreEntity> {
            val scoreEntity = mutableListOf<ScoreEntity>()

            scores.forEach{
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
            scores = toScoreModel(),
            date = date
        )
    }

    fun toScoreModel(): MutableList<Score> {
        val scoreModels = mutableListOf<Score>()

        scores.forEach{
            scoreModels.add(
                Score(
                    awayTeamScore = it.awayTeamScore,
                    homeTeamScore = it.homeTeamScore,
                    setIdentifier = it.setIdentifier
                )
            )
        }

        return scoreModels
    }
}
