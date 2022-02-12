package com.check.domain.models.newestresponse

data class NewField(
    var arLabel: String?,
    var arPlaceholder: String?,
    var conditionalView: ConditionalView?,
    var controlType: String?,
    var enLabel: String?,
    var enPlaceholder: String?,
    var fieldOrder: Int?,
    var hasAttachments: Boolean?,
    var hasNotes: Boolean?,
    var id: String?,
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
