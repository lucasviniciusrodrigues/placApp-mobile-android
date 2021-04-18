package com.ghostapps.placapp.ui.gameRecords.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ghostapps.placapp.domain.models.RecordModel
import kotlinx.android.synthetic.main.item_game_record.view.*
import kotlinx.android.synthetic.main.item_game_score_record.view.*

class RecordsListViewHolder(itemView: View, private val onDeletePressed: (recordModel: RecordModel) -> Unit): RecyclerView.ViewHolder(itemView) {

    fun bind(record: RecordModel) {
        itemView.itemGameRecordHomeTeamName.text = record.homeTeamName
        itemView.itemGameRecordHomeTeamScore.text = record.homeTeamSetScore.toString()

        itemView.itemGameRecordAwayTeamName.text = record.awayTeamName
        itemView.itemGameRecordAwayTeamScore.text = record.awayTeamSetScore.toString()

        record.scores.forEach{
            itemView.itemGameScoreRecordHomeTeamScore.text = it.homeTeamScore.toString()
            itemView.itemGameScoreRecordAwayTeamScore.text = it.awayTeamScore.toString()
        }

        itemView.itemGameRecordDelete.setOnClickListener {
            onDeletePressed(record)
        }
    }

}