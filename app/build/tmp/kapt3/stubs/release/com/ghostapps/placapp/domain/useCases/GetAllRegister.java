package com.ghostapps.placapp.domain.useCases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/ghostapps/placapp/domain/useCases/GetAllRegister;", "", "execute", "", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "()[Lcom/ghostapps/placapp/domain/models/RecordModel;", "app_release"})
public abstract interface GetAllRegister {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ghostapps.placapp.domain.models.RecordModel[] execute();
}