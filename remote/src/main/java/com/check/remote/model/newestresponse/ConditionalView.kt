package com.check.remote.model.newestresponse


import com.google.gson.annotations.SerializedName

data class ConditionalView(
    @SerializedName("Action")
    var action: String?,
    @SerializedName("Conditions")
    var conditions: List<Condition>?,
    @SerializedName("Operator")
    var `operator`: String?
)