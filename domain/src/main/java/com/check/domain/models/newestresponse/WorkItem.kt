package com.check.domain.models.newestresponse

data class WorkItem(
    var campaign: Campaign?,
    var fields: List<NewField>?,
    var id: String?,
    var score: Int?,
    var templateId: String?,
    var themeId: String?
)
