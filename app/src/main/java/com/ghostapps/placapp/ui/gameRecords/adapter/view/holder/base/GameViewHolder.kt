package com.ghostapps.placapp.ui.gameRecords.adapter.view.holder.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.ghostapps.placapp.viewModel.gameRecords.domain.GameItem

abstract class GameViewHolder<T: GameItem>(itemView: View): RecyclerView.ViewHolder(itemView){
    abstract fun bind(item: T)
}