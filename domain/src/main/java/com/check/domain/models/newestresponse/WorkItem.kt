package com.check.domain.models.newestresponse

data class WorkItem(
    var campaign: Campaign?,
    var fields: MutableList<NewField>?,
    var id: String?,
    var score: Int?,
    var templateId: String?,
    var themeId: String?
)
