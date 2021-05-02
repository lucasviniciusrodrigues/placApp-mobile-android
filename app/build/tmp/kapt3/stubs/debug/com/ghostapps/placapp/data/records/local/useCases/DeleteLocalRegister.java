package com.ghostapps.placapp.data.records.local.useCases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J3\u0010\u0005\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/ghostapps/placapp/data/records/local/useCases/DeleteLocalRegister;", "Lcom/ghostapps/placapp/domain/useCases/DeleteRegister;", "database", "Lcom/ghostapps/placapp/data/records/local/RecordDatabase;", "(Lcom/ghostapps/placapp/data/records/local/RecordDatabase;)V", "execute", "", "successCallback", "Lkotlin/Function1;", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "Lkotlin/ParameterName;", "name", "recordModel", "app_debug"})
public final class DeleteLocalRegister implements com.ghostapps.placapp.domain.useCases.DeleteRegister {
    private final com.ghostapps.placapp.data.records.local.RecordDatabase database = null;
    
    public final void execute(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.domain.models.RecordModel recordModel) {
    }
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ghostapps.placapp.domain.models.RecordModel, kotlin.Unit> successCallback, @org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.domain.models.RecordModel recordModel) {
    }
    
    public DeleteLocalRegister(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.data.records.local.RecordDatabase database) {
        super();
    }
}