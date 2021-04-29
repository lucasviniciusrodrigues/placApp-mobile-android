package com.ghostapps.placapp.data.records;

import java.lang.System;

@androidx.room.Entity(tableName = "records_database")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001d"}, d2 = {"Lcom/ghostapps/placapp/data/records/RecordEntity;", "", "homeTeamName", "", "homeTeamSetScore", "", "awayTeamName", "awayTeamSetScore", "scores", "", "Lcom/ghostapps/placapp/data/records/ScoreEntity;", "date", "", "(Ljava/lang/String;ILjava/lang/String;ILjava/util/List;J)V", "getAwayTeamName", "()Ljava/lang/String;", "getAwayTeamSetScore", "()I", "getDate", "()J", "getHomeTeamName", "getHomeTeamSetScore", "getScores", "()Ljava/util/List;", "toModel", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "toScoreModel", "Lcom/ghostapps/placapp/domain/models/ScoreModel;", "Companion", "app_release"})
public final class RecordEntity {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String homeTeamName = null;
    private final int homeTeamSetScore = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String awayTeamName = null;
    private final int awayTeamSetScore = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.ghostapps.placapp.data.records.ScoreEntity> scores = null;
    @androidx.room.PrimaryKey()
    private final long date = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_NAME = "records_database";
    public static final com.ghostapps.placapp.data.records.RecordEntity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ghostapps.placapp.domain.models.RecordModel toModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> toScoreModel() {
        return null;
    }
    
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
    public final java.util.List<com.ghostapps.placapp.data.records.ScoreEntity> getScores() {
        return null;
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public RecordEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String homeTeamName, int homeTeamSetScore, @org.jetbrains.annotations.NotNull()
    java.lang.String awayTeamName, int awayTeamSetScore, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ghostapps.placapp.data.records.ScoreEntity> scores, long date) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/ghostapps/placapp/data/records/RecordEntity$Companion;", "", "()V", "TABLE_NAME", "", "fromModel", "Lcom/ghostapps/placapp/data/records/RecordEntity;", "recordModel", "Lcom/ghostapps/placapp/domain/models/RecordModel;", "scoreToEntity", "", "Lcom/ghostapps/placapp/data/records/ScoreEntity;", "scoreModels", "", "Lcom/ghostapps/placapp/domain/models/ScoreModel;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ghostapps.placapp.data.records.RecordEntity fromModel(@org.jetbrains.annotations.NotNull()
        com.ghostapps.placapp.domain.models.RecordModel recordModel) {
            return null;
        }
        
        private final java.util.List<com.ghostapps.placapp.data.records.ScoreEntity> scoreToEntity(java.util.List<com.ghostapps.placapp.domain.models.ScoreModel> scoreModels) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}