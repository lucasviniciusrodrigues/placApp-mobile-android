package com.ghostapps.placapp.viewModel.gameScore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0002J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000eH\u0002J\u0018\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000eH\u0002J\u0006\u00100\u001a\u00020\'J\u0006\u00101\u001a\u00020\'J\u0016\u00102\u001a\u00020\'2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u00103\u001a\u00020\'J\u0006\u00104\u001a\u00020\'J\u0006\u00105\u001a\u00020\'J\b\u00106\u001a\u00020\'H\u0002J\b\u00107\u001a\u00020\'H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u001a\u0010\u0018\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\fR\u000e\u0010!\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/ghostapps/placapp/viewModel/gameScore/GameScoreViewModel;", "Lcom/ghostapps/placapp/viewModel/BaseViewModel;", "contract", "Lcom/ghostapps/placapp/viewModel/gameScore/GameScoreContract;", "insertRegister", "Lcom/ghostapps/placapp/domain/useCases/InsertRegister;", "(Lcom/ghostapps/placapp/viewModel/gameScore/GameScoreContract;Lcom/ghostapps/placapp/domain/useCases/InsertRegister;)V", "awayTeamName", "", "getAwayTeamName", "()Ljava/lang/String;", "setAwayTeamName", "(Ljava/lang/String;)V", "awayTeamScore", "", "awayTeamSetScore", "endMatchAwayTeamSetScore", "endMatchHomeTeamSetScore", "formattedAwayTeamScore", "getFormattedAwayTeamScore", "setFormattedAwayTeamScore", "formattedAwayTeamSetScore", "getFormattedAwayTeamSetScore", "setFormattedAwayTeamSetScore", "formattedHomeTeamScore", "getFormattedHomeTeamScore", "setFormattedHomeTeamScore", "formattedHomeTeamSetScore", "getFormattedHomeTeamSetScore", "setFormattedHomeTeamSetScore", "homeTeamName", "getHomeTeamName", "setHomeTeamName", "homeTeamScore", "homeTeamSetScore", "scores", "", "Lcom/ghostapps/placapp/domain/models/ScoreModel;", "checkAwayWin", "", "checkHomeWin", "checkifMatchEnd", "", "winnerTeamSetScore", "anotherTeamSetScore", "checksetChange", "newScore", "oldScore", "onAwayTeamDecrease", "onAwayTeamIncrease", "onCreate", "onExitPressed", "onHomeTeamDecrease", "onHomeTeamIncrease", "saveSet", "updateScore", "app_release"})
public final class GameScoreViewModel extends com.ghostapps.placapp.viewModel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String homeTeamName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String awayTeamName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String formattedHomeTeamScore = "00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String formattedAwayTeamScore = "00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String formattedHomeTeamSetScore = "00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String formattedAwayTeamSetScore = "00";
    private int homeTeamSetScore = 0;
    private int endMatchHomeTeamSetScore = 0;
    private int homeTeamScore = 0;
    private int awayTeamSetScore = 0;
    private int endMatchAwayTeamSetScore = 0;
    private int awayTeamScore = 0;
    private java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> scores;
    private final com.ghostapps.placapp.viewModel.gameScore.GameScoreContract contract = null;
    private final com.ghostapps.placapp.domain.useCases.InsertRegister insertRegister = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHomeTeamName() {
        return null;
    }
    
    public final void setHomeTeamName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAwayTeamName() {
        return null;
    }
    
    public final void setAwayTeamName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedHomeTeamScore() {
        return null;
    }
    
    public final void setFormattedHomeTeamScore(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedAwayTeamScore() {
        return null;
    }
    
    public final void setFormattedAwayTeamScore(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedHomeTeamSetScore() {
        return null;
    }
    
    public final void setFormattedHomeTeamSetScore(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedAwayTeamSetScore() {
        return null;
    }
    
    public final void setFormattedAwayTeamSetScore(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void onCreate(@org.jetbrains.annotations.NotNull()
    java.lang.String homeTeamName, @org.jetbrains.annotations.NotNull()
    java.lang.String awayTeamName) {
    }
    
    public final void onHomeTeamIncrease() {
    }
    
    public final void onHomeTeamDecrease() {
    }
    
    public final void onAwayTeamIncrease() {
    }
    
    private final void saveSet() {
    }
    
    public final void onAwayTeamDecrease() {
    }
    
    private final boolean checkifMatchEnd(int winnerTeamSetScore, int anotherTeamSetScore) {
        return false;
    }
    
    private final boolean checksetChange(int newScore, int oldScore) {
        return false;
    }
    
    private final void checkHomeWin() {
    }
    
    private final void checkAwayWin() {
    }
    
    private final void updateScore() {
    }
    
    public final void onExitPressed() {
    }
    
    public GameScoreViewModel(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.viewModel.gameScore.GameScoreContract contract, @org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.domain.useCases.InsertRegister insertRegister) {
        super();
    }
}