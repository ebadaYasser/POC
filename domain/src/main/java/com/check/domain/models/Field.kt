package com.check.domain.models

data class Field(
    var formId: String?,
    var arLabel: String?,
    var values: MutableList<String>? = null,
    var arPlaceholder: String?,
    var conditionalView: ConditionalView? = null,
    var controlType: String?,
    var enLabel: String?,
    var enPlaceholder: String?,
    var fieldOrder: Int?,
    var hasAttachments: Boolean?,
    var hasNotes: Boolean?,
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
