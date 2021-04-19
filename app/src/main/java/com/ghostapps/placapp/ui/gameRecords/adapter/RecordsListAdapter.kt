package com.ghostapps.placapp.ui.gameRecords.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ghostapps.placapp.R
import com.ghostapps.placapp.domain.models.RecordModel
import com.ghostapps.placapp.ui.gameRecords.adapter.view.holder.RecordListViewHolder
import com.ghostapps.placapp.ui.gameRecords.adapter.view.holder.ScoreViewHolder
import com.ghostapps.placapp.ui.gameRecords.adapter.view.holder.base.GameViewHolder
import com.ghostapps.placapp.viewModel.gameRecords.domain.GameItem
import java.lang.IllegalStateException

class RecordsListAdapter(
    private val list: List<GameItem>,
    private val onDeletePressed: (recordModel: RecordModel) -> Unit
): RecyclerView.Adapter<GameViewHolder<*>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder<*> {
        return when(viewType){
            1 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_game_record, parent, false)
                RecordListViewHolder(view, onDeletePressed)
            }
            2 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_game_score_record, parent, false)
                ScoreViewHolder(view)
            }
            else -> {
                throw IllegalStateException("Invalid view tipe: $viewType")
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GameViewHolder<*>, position: Int) {
        val item = list[position]
        when(item){
            is GameItem.Record -> (holder as RecordListViewHolder).bind(item)
            is GameItem.Score -> (holder as ScoreViewHolder).bind(item)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(list[position]){
            is GameItem.Record -> 1
            is GameItem.Score -> 2
        }
    }
}



