package com.ghostapps.placapp.viewModel.gameRecords;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/ghostapps/placapp/viewModel/gameRecords/GameRecordsViewModel;", "Lcom/ghostapps/placapp/viewModel/BaseViewModel;", "getAllRegister", "Lcom/ghostapps/placapp/domain/useCases/GetAllRegister;", "deleteRegister", "Lcom/ghostapps/placapp/domain/useCases/DeleteRegister;", "(Lcom/ghostapps/placapp/domain/useCases/GetAllRegister;Lcom/ghostapps/placapp/domain/useCases/DeleteRegister;)V", "recordsList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "getRecordsList", "()Landroidx/lifecycle/MutableLiveData;", "", "recordModel", "loadRecords", "app_release"})
public final class GameRecordsViewModel extends com.ghostapps.placapp.viewModel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ghostapps.placapp.domain.models.RecordModel[]> recordsList = null;
    private final com.ghostapps.placapp.domain.useCases.GetAllRegister getAllRegister = null;
    private final com.ghostapps.placapp.domain.useCases.DeleteRegister deleteRegister = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ghostapps.placapp.domain.models.RecordModel[]> getRecordsList() {
        return null;
    }
    
    public final void loadRecords() {
    }
    
    public final void deleteRegister(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.domain.models.RecordModel recordModel) {
    }
    
    public GameRecordsViewModel(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.domain.useCases.GetAllRegister getAllRegister, @org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.domain.useCases.DeleteRegister deleteRegister) {
        super();
    }
}