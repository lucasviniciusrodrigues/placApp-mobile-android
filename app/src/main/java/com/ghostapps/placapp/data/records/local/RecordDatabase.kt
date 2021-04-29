package com.ghostapps.placapp.data.records.local

import androidx.room.*
import com.ghostapps.placapp.data.records.RecordEntity
import com.ghostapps.placapp.data.records.local.converters.ScoreConverter

@Database(entities = [RecordEntity::class], version = 1)
@TypeConverters(ScoreConverter::class)
abstract class RecordDatabase: RoomDatabase() {
    abstract fun recordDao(): RecordDao
}