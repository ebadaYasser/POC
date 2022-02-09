package com.check.domain.models

data class Condition(
    val arErrorMsg: String?,
    val conditionType: String?,
    val enErrorMsg: String?,
    val linkedFieldId: String?,
    val validatorValue: String?,
    var isConditionPassed: Boolean? = false
)