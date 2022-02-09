package com.check.data.models

data class ConditionEntity(
    val arErrorMsg: String?,
    val conditionType: String?,
    val enErrorMsg: String?,
    val linkedFieldId: String?,
    val validatorValue: String?,
    var isConditionPassed: Boolean? = false
)