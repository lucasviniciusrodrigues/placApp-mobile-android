package com.ghostapps.placapp.domain.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010#\u001a\u00020\u0004H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\u0004H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003JK\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0006H\u00d6\u0001J\t\u0010.\u001a\u00020\u0004H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006/"}, d2 = {"Lcom/ghostapps/placapp/domain/models/RecordModel;", "", "()V", "homeTeamName", "", "homeTeamSetScore", "", "awayTeamName", "awayTeamSetScore", "scoreModels", "", "Lcom/ghostapps/placapp/domain/models/ScoreModel;", "date", "", "(Ljava/lang/String;ILjava/lang/String;ILjava/util/List;J)V", "getAwayTeamName", "()Ljava/lang/String;", "setAwayTeamName", "(Ljava/lang/String;)V", "getAwayTeamSetScore", "()I", "setAwayTeamSetScore", "(I)V", "getDate", "()J", "setDate", "(J)V", "getHomeTeamName", "setHomeTeamName", "getHomeTeamSetScore", "setHomeTeamSetScore", "getScoreModels", "()Ljava/util/List;", "setScoreModels", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class RecordModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String homeTeamName;
    private int homeTeamSetScore;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String awayTeamName;
    private int awayTeamSetScore;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> scoreModels;
    private long date;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHomeTeamName() {
        return null;
    }
    
    public final void setHomeTeamName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getHomeTeamSetScore() {
        return 0;
    }
    
    public final void setHomeTeamSetScore(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAwayTeamName() {
        return null;
    }
    
    public final void setAwayTeamName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getAwayTeamSetScore() {
        return 0;
    }
    
    public final void setAwayTeamSetScore(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> getScoreModels() {
        return null;
    }
    
    public final void setScoreModels(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> p0) {
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    public RecordModel(@org.jetbrains.annotations.NotNull()
    java.lang.String homeTeamName, int homeTeamSetScore, @org.jetbrains.annotations.NotNull()
    java.lang.String awayTeamName, int awayTeamSetScore, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> scoreModels, long date) {
        super();
    }
    
    public RecordModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ghostapps.placapp.domain.models.RecordModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String homeTeamName, int homeTeamSetScore, @org.jetbrains.annotations.NotNull()
    java.lang.String awayTeamName, int awayTeamSetScore, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> scoreModels, long date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}