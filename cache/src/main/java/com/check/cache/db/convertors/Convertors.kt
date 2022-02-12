package com.check.cache.db.convertors

import androidx.room.TypeConverter
import com.check.cache.db.entities.CampaignCacheEntity
import com.check.cache.db.entities.ConditionCacheEntity
import com.check.cache.db.entities.ConditionalViewCacheEntity
import com.check.cache.db.entities.HeaderCacheEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class Convertors {
    private val gson = Gson()


    @TypeConverter
    fun toCampaignCacheEntity(campaignCacheEntity: String?): CampaignCacheEntity? {
        if (campaignCacheEntity.isNullOrEmpty()) return null
        return gson.fromJson(campaignCacheEntity, CampaignCacheEntity::class.java)
    }

    @TypeConverter
    fun toHeaderCacheEntity(headerCacheEntity: String?): HeaderCacheEntity? {
        if (headerCacheEntity.isNullOrEmpty()) return null
        return gson.fromJson(headerCacheEntity, HeaderCacheEntity::class.java)
    }


    @TypeConverter
    fun toConditionCacheEntity(conditionalViewCacheEntity: String?): ConditionCacheEntity? {
        if (conditionalViewCacheEntity.isNullOrEmpty()) return null
        return gson.fromJson(conditionalViewCacheEntity, ConditionCacheEntity::class.java)
    }

    @TypeConverter
    fun toConditionalViewCacheEntity(conditionalViewCacheEntity: String?): ConditionalViewCacheEntity? {
        if (conditionalViewCacheEntity.isNullOrEmpty()) return null
        return gson.fromJson(conditionalViewCacheEntity, ConditionalViewCacheEntity::class.java)
    }

    @TypeConverter
    fun toConditionCacheEntities(child: String?): List<ConditionCacheEntity?>? {
        if (child.isNullOrEmpty()) return mutableListOf()
        val type = object : TypeToken<List<ConditionCacheEntity?>?>() {}.type
        return gson.fromJson(child, type)
    }


    @TypeConverter
    fun fromCampaignCacheEntity(campaignCacheEntity: CampaignCacheEntity?): String? {
        if (campaignCacheEntity == null) return ""
        return gson.toJson(campaignCacheEntity)
    }

    @TypeConverter
    fun fromHeaderCacheEntity(headerCacheEntity: HeaderCacheEntity?): String? {
        if (headerCacheEntity == null) return ""
        return gson.toJson(headerCacheEntity)
    }

    @TypeConverter
    fun fromConditionalViewCacheEntity(conditionalViewCacheEntity: ConditionalViewCacheEntity?): String? {
        if (conditionalViewCacheEntity == null) return ""
        return gson.toJson(conditionalViewCacheEntity)
    }


    @TypeConverter
    fun fromConditionCacheEntity(conditionalViewCacheEntity: ConditionCacheEntity?): String? {
        if (conditionalViewCacheEntity == null) return ""
        return gson.toJson(conditionalViewCacheEntity)
    }

    @TypeConverter
    fun fromConditionCacheEntities(conditions: List<ConditionCacheEntity?>?): String? {
        if (conditions.isNullOrEmpty()) return ""
        val type = object : TypeToken<List<String>?>() {}.type
        return gson.toJson(conditions, type)
    }


    @TypeConverter
    fun fromVisibilityView(child: List<String>?): String? {
        if (child.isNullOrEmpty()) return ""

        val type = object : TypeToken<List<String>?>() {}.type
        return gson.toJson(child, type)
    }

    @TypeConverter
    fun toVisibilityView(child: String?): List<String>? {
        if (child.isNullOrEmpty()) return mutableListOf()

        val type = object : TypeToken<List<String>?>() {}.type
        return gson.fromJson(child, type)
    }
}