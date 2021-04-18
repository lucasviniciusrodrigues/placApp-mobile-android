package com.ghostapps.placapp.ui.gameRecords.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ghostapps/placapp/ui/gameRecords/adapter/RecordsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ghostapps/placapp/ui/gameRecords/adapter/RecordsListViewHolder;", "list", "", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "onDeletePressed", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "recordModel", "", "([Lcom/ghostapps/placapp/domain/models/RecordModel;Lkotlin/jvm/functions/Function1;)V", "[Lcom/ghostapps/placapp/domain/models/RecordModel;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class RecordsListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ghostapps.placapp.ui.gameRecords.adapter.RecordsListViewHolder> {
    private final com.ghostapps.placapp.domain.models.RecordModel[] list = null;
    private final kotlin.jvm.functions.Function1<com.ghostapps.placapp.domain.models.RecordModel, kotlin.Unit> onDeletePressed = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ghostapps.placapp.ui.gameRecords.adapter.RecordsListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.ui.gameRecords.adapter.RecordsListViewHolder holder, int position) {
    }
    
    public RecordsListAdapter(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.domain.models.RecordModel[] list, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ghostapps.placapp.domain.models.RecordModel, kotlin.Unit> onDeletePressed) {
        super();
    }
}