package com.ghostapps.placapp.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ghostapps/placapp/viewModel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/databinding/Observable;", "()V", "mCallbacks", "Landroidx/databinding/PropertyChangeRegistry;", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "notifyChange", "removeOnPropertyChangedCallback", "app_release"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements androidx.databinding.Observable {
    private transient androidx.databinding.PropertyChangeRegistry mCallbacks;
    
    @java.lang.Override()
    public void addOnPropertyChangedCallback(@org.jetbrains.annotations.NotNull()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    @java.lang.Override()
    public void removeOnPropertyChangedCallback(@org.jetbrains.annotations.NotNull()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    public final void notifyChange() {
    }
    
    public BaseViewModel() {
        super();
    }
}