package com.ghostapps.placapp.ui.gameScore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/ghostapps/placapp/ui/gameScore/GameScoreActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/ghostapps/placapp/viewModel/gameScore/GameScoreContract;", "()V", "binding", "Lcom/ghostapps/placapp/databinding/ActivityScoreGameBinding;", "viewModel", "Lcom/ghostapps/placapp/viewModel/gameScore/GameScoreViewModel;", "getViewModel", "()Lcom/ghostapps/placapp/viewModel/gameScore/GameScoreViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "declareWinner", "", "teamName", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onExitPressed", "Companion", "app_debug"})
public final class GameScoreActivity extends androidx.appcompat.app.AppCompatActivity implements com.ghostapps.placapp.viewModel.gameScore.GameScoreContract {
    private com.ghostapps.placapp.databinding.ActivityScoreGameBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEAM_HOME_NAME = "home_team_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TEAM_AWAY_NAME = "away_team_name";
    public static final com.ghostapps.placapp.ui.gameScore.GameScoreActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ghostapps.placapp.viewModel.gameScore.GameScoreViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onExitPressed() {
    }
    
    @java.lang.Override()
    public void declareWinner(@org.jetbrains.annotations.NotNull()
    java.lang.String teamName) {
    }
    
    public GameScoreActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ghostapps/placapp/ui/gameScore/GameScoreActivity$Companion;", "", "()V", "TEAM_AWAY_NAME", "", "TEAM_HOME_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}