package com.check.cache.db.entities

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.check.data.models.ConditionalViewEntity

@Entity(tableName = "Field")
data class FieldCacheEntity(
    var formId: String?,
    var arLabel: String?,
    var values: MutableList<String>? = null,
    var arPlaceholder: String?,
    var conditionalView: ConditionalViewEntity? = null,
    var controlType: String?,
    var enLabel: String?,
    var enPlaceholder: String?,
    var fieldOrder: Int?,
    var hasAttachments: Boolean?,
    var hasNotes: Boolean?,
    @PrimaryKey
    var id: String,
    var regex: String?,
    var required: Boolean?,
    var responsibleUnit: String?,
    var sectionId: String?,
    var severityLevel: String?,
    var templateQuestionId: String?,
    var visibilityView: List<String?>?,
    var childFields: MutableList<String>? = null
)
