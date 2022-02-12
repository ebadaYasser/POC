package com.check.remote.model.newestresponse


import com.google.gson.annotations.SerializedName

data class Campaign(
    @SerializedName("header")
    var header: Header?,
    @SerializedName("submissionMessage")
    var submissionMessage: SubmissionMessage?
)