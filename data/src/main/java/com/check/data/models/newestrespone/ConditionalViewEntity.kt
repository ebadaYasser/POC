package com.check.data.models.newestrespone

data class ConditionalViewEntity(
    var action: String?,
    var conditions: List<ConditionEntity>?,
    var `operator`: String?
)
