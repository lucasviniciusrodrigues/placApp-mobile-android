package com.ghostapps.placapp.ui.gameRecords.adapter.view.holder.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ghostapps/placapp/ui/gameRecords/adapter/view/holder/base/GameViewHolder;", "T", "Lcom/ghostapps/placapp/viewModel/gameRecords/domain/GameItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "(Lcom/ghostapps/placapp/viewModel/gameRecords/domain/GameItem;)V", "app_release"})
public abstract class GameViewHolder<T extends com.ghostapps.placapp.viewModel.gameRecords.domain.GameItem> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    
    public abstract void bind(@org.jetbrains.annotations.NotNull()
    T item);
    
    public GameViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
}