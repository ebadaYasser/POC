package com.check.cache.db.entities

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.check.data.models.ConditionalViewEntity

@Entity(tableName = "Field")
data class FieldCacheEntity(
    var arLabel: String?,
//    var values: MutableList<Any>? = null,
//    var arPlaceholder: Any?,
//    var conditionalView: ConditionalViewEntity? = null,
    var controlType: String?,
    var enLabel: String?,
//    var enPlaceholder: Any?,
    var fieldOrder: Int?,
    var hasAttachments: Boolean?,
    var hasNotes: Boolean?,
    @PrimaryKey
    var id: String,
    var regex: String?,
    var required: Boolean?,
//    var responsibleUnit: Any?,
//    var sectionId: Any?,
//    var severityLevel: Any?,
//    var templateQuestionId: Any?,
//    var visibilityView: List<Any?>?,
//    var childFields: MutableList<String>? = null
)
