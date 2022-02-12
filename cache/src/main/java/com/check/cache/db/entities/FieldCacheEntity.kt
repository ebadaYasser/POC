package com.check.cache.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "form")
data class FieldCacheEntity(
    var arLabel: String?,
    var arPlaceholder: String?,
    var conditionalView: ConditionalViewCacheEntity?,
    var controlType: String?,
    var enLabel: String?,
    var enPlaceholder: String?,
    var fieldOrder: Int?,
    var hasAttachments: Boolean?,
    var hasNotes: Boolean?,
    @PrimaryKey(autoGenerate = false)
    var id: String,
    var regex: String?,
    var required: Boolean?,
    var responsibleUnit: String?,
    var sectionId: String?,
    var severityLevel: String?,
    var templateQuestionId: String?,
    var visibilityView: List<String>?,
    var values: MutableList<String>?,
    var workItemId: String?
)
