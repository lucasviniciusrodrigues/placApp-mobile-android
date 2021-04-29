package com.ghostapps.placapp.ui.gameRecords.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u001c\u0010\u0012\u001a\u00020\f2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/ghostapps/placapp/ui/gameRecords/adapter/RecordsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ghostapps/placapp/ui/gameRecords/adapter/view/holder/base/GameViewHolder;", "list", "", "Lcom/ghostapps/placapp/viewModel/gameRecords/domain/GameItem;", "onDeletePressed", "Lkotlin/Function1;", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "Lkotlin/ParameterName;", "name", "recordModel", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_release"})
public final class RecordsListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ghostapps.placapp.ui.gameRecords.adapter.view.holder.base.GameViewHolder<?>> {
    private final java.util.List<com.ghostapps.placapp.viewModel.gameRecords.domain.GameItem> list = null;
    private final kotlin.jvm.functions.Function1<com.ghostapps.placapp.domain.models.RecordModel, kotlin.Unit> onDeletePressed = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ghostapps.placapp.ui.gameRecords.adapter.view.holder.base.GameViewHolder<?> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.ui.gameRecords.adapter.view.holder.base.GameViewHolder<?> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public RecordsListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.ghostapps.placapp.viewModel.gameRecords.domain.GameItem> list, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ghostapps.placapp.domain.models.RecordModel, kotlin.Unit> onDeletePressed) {
        super();
    }
}