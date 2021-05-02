package com.ghostapps.placapp.domain.useCases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\t\u001a\u00020\u0006H&\u00a8\u0006\n"}, d2 = {"Lcom/ghostapps/placapp/domain/useCases/DeleteRegister;", "", "execute", "", "successCallback", "Lkotlin/Function1;", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "Lkotlin/ParameterName;", "name", "recordModel", "app_debug"})
public abstract interface DeleteRegister {
    
    public abstract void execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ghostapps.placapp.domain.models.RecordModel, kotlin.Unit> successCallback, @org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.domain.models.RecordModel recordModel);
}