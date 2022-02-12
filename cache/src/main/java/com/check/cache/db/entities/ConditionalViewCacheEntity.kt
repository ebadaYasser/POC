package com.check.cache.db.entities

data class ConditionalViewCacheEntity(
    var action: String?,
    var conditions: List<ConditionCacheEntity?>? = null,
    var `operator`: String?,
)