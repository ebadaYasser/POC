package com.check.remote.model.newestresponse


import com.google.gson.annotations.SerializedName

data class Condition(
    @SerializedName("ArErrorMsg")
    var arErrorMsg: String?,
    @SerializedName("ConditionType")
    var conditionType: String?,
    @SerializedName("EnErrorMsg")
    var enErrorMsg: String?,
    @SerializedName("LinkedFieldId")
    var linkedFieldId: String?,
    @SerializedName("ValidatorValue")
    var validatorValue: String?,
    @SerializedName("isConditionPassed")
    var isConditionPassed: Boolean? = false
)