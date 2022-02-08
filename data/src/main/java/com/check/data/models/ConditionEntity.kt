package com.check.data.models

data class ConditionEntity(
    val arErrorMsg: Any?,
    val conditionType: String?,
    val enErrorMsg: Any?,
    val linkedFieldId: String?,
    val validatorValue: String?,
    var isConditionPassed: Boolean? = false
)