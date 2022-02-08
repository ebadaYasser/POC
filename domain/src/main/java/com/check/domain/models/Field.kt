package com.check.domain.models

data class Field(
    var arLabel: String?,
    var values: MutableList<Any>? = null,
    var arPlaceholder: Any?,
    var conditionalView: ConditionalView? = null,
    var controlType: String?,
    var enLabel: String?,
    var enPlaceholder: Any?,
    var fieldOrder: Int?,
    var hasAttachments: Boolean?,
    var hasNotes: Boolean?,
    var id: String?,
    var regex: String?,
    var required: Boolean?,
    var responsibleUnit: Any?,
    var sectionId: Any?,
    var severityLevel: Any?,
    var templateQuestionId: Any?,
    var visibilityView: List<Any?>?,
    var childFields: MutableList<String>? = null
)
