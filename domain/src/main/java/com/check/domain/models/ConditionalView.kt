package com.check.domain.models

data class ConditionalView(
    var action: String?,
    var conditions: List<Condition>? = null,
    var `operator`: String?,
    var conditionsSize: Int? = 0
)