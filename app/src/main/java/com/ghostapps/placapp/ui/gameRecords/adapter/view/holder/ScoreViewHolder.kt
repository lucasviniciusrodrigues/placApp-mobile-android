package com.ghostapps.placapp.ui.gameRecords.adapter.view.holder

import android.view.View
import com.ghostapps.placapp.ui.gameRecords.adapter.view.holder.base.GameViewHolder
import com.ghostapps.placapp.viewModel.gameRecords.domain.GameItem
import kotlinx.android.synthetic.main.item_game_score_record.view.*

class ScoreViewHolder(itemView: View): GameViewHolder<GameItem.Score>(itemView) {

    override fun bind(item: GameItem.Score) {
        itemView.itemGameScoreRecordHomeTeamScore.text = item.homeTeamScore.toString()
        itemView.itemGameScoreRecordAwayTeamScore.text = item.awayTeamScore.toString()
    }

}