package com.ghostapps.placapp.data.records.remote.useCases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ1\u0010\u0005\u001a\u00020\t2\'\u0010\n\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/ghostapps/placapp/data/records/remote/useCases/GetAllRemoteRegister;", "Lcom/ghostapps/placapp/domain/useCases/GetAllRegister;", "httpAdapter", "Lcom/ghostapps/placapp/infra/http/HttpAdapter;", "(Lcom/ghostapps/placapp/infra/http/HttpAdapter;)V", "execute", "", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "()[Lcom/ghostapps/placapp/domain/models/RecordModel;", "", "successCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "recordList", "app_debug"})
public final class GetAllRemoteRegister implements com.ghostapps.placapp.domain.useCases.GetAllRegister {
    private final com.ghostapps.placapp.infra.http.HttpAdapter httpAdapter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ghostapps.placapp.domain.models.RecordModel[] execute() {
        return null;
    }
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ghostapps.placapp.domain.models.RecordModel[], kotlin.Unit> successCallback) {
    }
    
    public GetAllRemoteRegister(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.infra.http.HttpAdapter httpAdapter) {
        super();
    }
}