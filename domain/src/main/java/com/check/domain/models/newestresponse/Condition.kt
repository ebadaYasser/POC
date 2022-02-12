package com.check.domain.models.newestresponse

data class Condition(
    var arErrorMsg: String?,
    var conditionType: String?,
    var enErrorMsg: String?,
    var linkedFieldId: String?,
    var validatorValue: String?,
    var isConditionPassed: Boolean?,
)