package com.check.domain.models

data class Condition(
    val arErrorMsg: Any?,
    val conditionType: String?,
    val enErrorMsg: Any?,
    val linkedFieldId: String?,
    val validatorValue: String?,
    var isConditionPassed: Boolean? = false
)