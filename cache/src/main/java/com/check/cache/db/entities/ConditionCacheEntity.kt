package com.check.cache.db.entities

data class ConditionCacheEntity(
    val arErrorMsg: Any?,
    val conditionType: String?,
    val enErrorMsg: Any?,
    val linkedFieldId: String?,
    val validatorValue: String?,
    var isConditionPassed: Boolean? = false
)