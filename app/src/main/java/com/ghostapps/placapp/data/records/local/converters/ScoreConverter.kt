package com.ghostapps.placapp.data.records.local.converters

import androidx.room.TypeConverter
import com.ghostapps.placapp.data.records.local.ScoreEntity
import com.google.gson.Gson
import java.util.*

class ScoreConverter {

    @TypeConverter
    fun stringToScoreEntityList(data: String): List<ScoreEntity> {
        if (data == null) {
            return Collections.emptyList();
        }

        return Gson().fromJson(data, Array<ScoreEntity>::class.java).asList()
    }

    @TypeConverter
    fun ScoreEntityListToString(scoreConverters: List<ScoreEntity>): String {
        return Gson().toJson(scoreConverters);
    }
}