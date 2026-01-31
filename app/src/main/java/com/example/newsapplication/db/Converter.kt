package com.example.newsapplication.db

import androidx.room.TypeConverter
import com.example.newsapplication.models.Source
import com.google.gson.Gson

class SourceConverter {
    @TypeConverter
    fun fromSource(source: Source): String {
        return Gson().toJson(source)
    }

    @TypeConverter
    fun toSource(sourceString: String): Source {
        return Gson().fromJson(sourceString, Source::class.java)
    }
}