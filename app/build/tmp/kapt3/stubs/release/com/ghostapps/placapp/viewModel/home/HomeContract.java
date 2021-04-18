package com.ghostapps.placapp.viewModel.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/ghostapps/placapp/viewModel/home/HomeContract;", "", "closeApp", "", "navigateTo", "newClass", "Ljava/lang/Class;", "app_release"})
public abstract interface HomeContract {
    
    public abstract void navigateTo(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> newClass);
    
    public abstract void closeApp();
}