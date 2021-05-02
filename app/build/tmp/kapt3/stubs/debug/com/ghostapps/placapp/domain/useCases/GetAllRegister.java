package com.ghostapps.placapp.domain.useCases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u00020\u00032\'\u0010\u0004\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/ghostapps/placapp/domain/useCases/GetAllRegister;", "", "execute", "", "successCallback", "Lkotlin/Function1;", "", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "Lkotlin/ParameterName;", "name", "recordList", "app_debug"})
public abstract interface GetAllRegister {
    
    public abstract void execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ghostapps.placapp.domain.models.RecordModel[], kotlin.Unit> successCallback);
}