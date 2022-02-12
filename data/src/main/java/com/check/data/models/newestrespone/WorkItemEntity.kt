package com.check.data.models.newestrespone

data class WorkItemEntity(
    var campaign: CampaignEntity?,
    var fields: List<NewFieldEntity>?,
    var id: String?,
    var score: Int?,
    var templateId: String?,
    var themeId: String?
)
