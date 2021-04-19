package com.ghostapps.placapp.domain.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/ghostapps/placapp/domain/models/RecordModel;", "", "homeTeamName", "", "homeTeamSetScore", "", "awayTeamName", "awayTeamSetScore", "scoreModels", "", "Lcom/ghostapps/placapp/domain/models/ScoreModel;", "date", "", "(Ljava/lang/String;ILjava/lang/String;ILjava/util/List;J)V", "getAwayTeamName", "()Ljava/lang/String;", "getAwayTeamSetScore", "()I", "getDate", "()J", "getHomeTeamName", "getHomeTeamSetScore", "getScoreModels", "()Ljava/util/List;", "app_debug"})
public final class RecordModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String homeTeamName = null;
    private final int homeTeamSetScore = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String awayTeamName = null;
    private final int awayTeamSetScore = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> scoreModels = null;
    private final long date = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHomeTeamName() {
        return null;
    }
    
    public final int getHomeTeamSetScore() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAwayTeamName() {
        return null;
    }
    
    public final int getAwayTeamSetScore() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> getScoreModels() {
        return null;
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public RecordModel(@org.jetbrains.annotations.NotNull()
    java.lang.String homeTeamName, int homeTeamSetScore, @org.jetbrains.annotations.NotNull()
    java.lang.String awayTeamName, int awayTeamSetScore, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> scoreModels, long date) {
        super();
    }
}