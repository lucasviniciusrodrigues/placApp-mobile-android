package com.ghostapps.placapp.ui.gameRecords.adapter.view.holder

import android.view.View
import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.domain.models.ScoreModel
import com.ghostapps.placapp.ui.gameRecords.adapter.view.holder.base.GameViewHolder
import com.ghostapps.placapp.viewModel.gameRecords.domain.GameItem
import kotlinx.android.synthetic.main.item_game_record.view.*

class RecordListViewHolder(itemView: View, private val onDeletePressed: (recordModel: RecordModel) -> Unit): GameViewHolder<GameItem.Record>(itemView) {

    override fun bind(record: GameItem.Record) {
        itemView.itemGameRecordHomeTeamName.text = record.homeTeamName
        itemView.itemGameRecordHomeTeamScore.text = record.homeTeamSetScore.toString()

        itemView.itemGameRecordAwayTeamName.text = record.awayTeamName
        itemView.itemGameRecordAwayTeamScore.text = record.awayTeamSetScore.toString()

        itemView.itemGameRecordDelete.setOnClickListener {
            onDeletePressed(
                RecordModel(
                    awayTeamName = record.awayTeamName,
                    awayTeamSetScore = record.awayTeamSetScore,
                    homeTeamName = record.homeTeamName,
                    homeTeamSetScore = record.homeTeamSetScore,
                    scoreModels = listOf<ScoreModel>(),
                    date = record.date
                )
            )
        }
    }

}