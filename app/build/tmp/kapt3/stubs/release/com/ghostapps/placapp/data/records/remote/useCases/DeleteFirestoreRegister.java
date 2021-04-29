package com.ghostapps.placapp.data.records.remote.useCases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ghostapps/placapp/data/records/remote/useCases/DeleteFirestoreRegister;", "Lcom/ghostapps/placapp/domain/useCases/DeleteRegister;", "database", "Lcom/google/firebase/ktx/Firebase;", "(Lcom/google/firebase/ktx/Firebase;)V", "execute", "", "recordModel", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "app_release"})
public final class DeleteFirestoreRegister implements com.ghostapps.placapp.domain.useCases.DeleteRegister {
    private final com.google.firebase.ktx.Firebase database = null;
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.domain.models.RecordModel recordModel) {
    }
    
    public DeleteFirestoreRegister(@org.jetbrains.annotations.NotNull()
    com.google.firebase.ktx.Firebase database) {
        super();
    }
}