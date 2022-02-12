package com.check.remote.model.newestresponse


import com.google.gson.annotations.SerializedName

data class SubmissionMessage(
    @SerializedName("description")
    var description: String?,
    @SerializedName("logo")
    var logo: String?,
    @SerializedName("showQuestionCount")
    var showQuestionCount: Boolean?,
    @SerializedName("title")
    var title: String?
)