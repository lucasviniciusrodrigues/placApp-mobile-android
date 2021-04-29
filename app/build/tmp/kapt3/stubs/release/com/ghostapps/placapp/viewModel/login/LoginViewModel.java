package com.ghostapps.placapp.viewModel.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/ghostapps/placapp/viewModel/login/LoginViewModel;", "Lcom/ghostapps/placapp/viewModel/BaseViewModel;", "contract", "Lcom/ghostapps/placapp/viewModel/login/LoginContract;", "login", "Lcom/ghostapps/placapp/domain/useCases/Login;", "(Lcom/ghostapps/placapp/viewModel/login/LoginContract;Lcom/ghostapps/placapp/domain/useCases/Login;)V", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "errorMessage", "Landroidx/lifecycle/MutableLiveData;", "getErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "password", "getPassword", "setPassword", "onLoginPressed", "", "app_release"})
public final class LoginViewModel extends com.ghostapps.placapp.viewModel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String email = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password = "";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessage = null;
    private final com.ghostapps.placapp.viewModel.login.LoginContract contract = null;
    private final com.ghostapps.placapp.domain.useCases.Login login = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void onLoginPressed() {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.viewModel.login.LoginContract contract, @org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.domain.useCases.Login login) {
        super();
    }
}