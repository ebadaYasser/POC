package com.check.cache.db.convertors

import androidx.room.TypeConverter
import com.check.data.models.ConditionEntity
import com.check.data.models.ConditionalViewEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Convertors {
    private val gson = Gson()

    @TypeConverter
    fun fromValues(values: List<Any>?): String {
        if (values.isNullOrEmpty()) return ""

        val type = object : TypeToken<List<Any>?>() {}.type
        return gson.toJson(values, type)
    }

    @TypeConverter
    fun toValues(values: String?): List<Any>? {
        if (values.isNullOrEmpty()) return mutableListOf()

        val type = object : TypeToken<List<Any>?>() {}.type
        return gson.fromJson(values, type)
    }



    @TypeConverter
    fun fromChild(child: List<String>?): String? {
        if (child.isNullOrEmpty()) return ""

        val type = object : TypeToken<List<String>?>() {}.type
        return gson.toJson(child, type)
    }

    @TypeConverter
    fun toChild(child: String?): List<String>? {
        if (child.isNullOrEmpty()) return mutableListOf()

        val type = object : TypeToken<List<String>?>() {}.type
        return gson.fromJson(child, type)
    }
    @TypeConverter
    fun fromConditions(  conditions: List<ConditionEntity?>?): String? {
        if (conditions.isNullOrEmpty()) return ""
        val type = object : TypeToken<List<String>?>() {}.type
        return gson.toJson(conditions, type)
    }

    @TypeConverter
    fun tConditions(child: String?): List<ConditionEntity?>? {
        if (child.isNullOrEmpty()) return mutableListOf()
        val type = object : TypeToken<List<ConditionEntity?>?>() {}.type
        return gson.fromJson(child, type)
    } @TypeConverter
    fun fromConditionView( value: ConditionalViewEntity?): String? {
        if (value==null) return ""
        return gson.toJson(value)
    }

    @TypeConverter
    fun toConditionView(child: String?): ConditionalViewEntity? {
        if (child.isNullOrEmpty()) return null
        return gson.fromJson(child,ConditionalViewEntity::class.java)
    }
}