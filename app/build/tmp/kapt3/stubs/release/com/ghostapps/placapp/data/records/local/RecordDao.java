package com.ghostapps.placapp.data.records.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\t"}, d2 = {"Lcom/ghostapps/placapp/data/records/local/RecordDao;", "", "delete", "", "recordEntity", "Lcom/ghostapps/placapp/data/records/local/RecordEntity;", "getRecords", "", "insert", "app_release"})
public abstract interface RecordDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.data.records.local.RecordEntity recordEntity);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.ghostapps.placapp.data.records.local.RecordEntity recordEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM records_database")
    public abstract java.util.List<com.ghostapps.placapp.data.records.local.RecordEntity> getRecords();
}