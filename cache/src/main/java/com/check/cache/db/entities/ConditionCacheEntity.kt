package com.check.cache.db.entities

data class ConditionCacheEntity(
    val arErrorMsg: String?,
    val conditionType: String?,
    val enErrorMsg: String?,
    val linkedFieldId: String?,
    val validatorValue: String?,
    var isConditionPassed: Boolean? = false
)