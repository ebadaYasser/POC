package com.check.cache.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "work_item")
data class WorkItemCacheEntity(
    var campaign: CampaignCacheEntity?,
    @PrimaryKey(autoGenerate = false)
    var id: String,
    var score: Int?,
    var templateId: String?,
    var themeId: String?
)
