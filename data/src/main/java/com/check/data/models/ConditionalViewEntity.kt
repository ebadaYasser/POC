package com.check.data.models

data class ConditionalViewEntity(
    var action: String?,
    var conditions: List<ConditionEntity?>? = null,
    var `operator`: String?,
    var conditionsSize: Int? = 0
)