package com.check.domain.models.newestresponse

data class ConditionalView(
    var action: String?,
    var conditions: List<Condition>?,
    var `operator`: String?
)