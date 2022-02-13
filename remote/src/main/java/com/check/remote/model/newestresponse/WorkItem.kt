package com.check.remote.model.newestresponse

import com.google.gson.annotations.SerializedName

data class WorkItem(
    @SerializedName("campaign")
    var campaign: Campaign?,
    @SerializedName("Fields")
    var fields: MutableList<Field>?,
    @SerializedName("id")
    var id: String?,
    @SerializedName("score")
    var score: Int?,
    @SerializedName("templateId")
    var templateId: String?,
    @SerializedName("themeId")
    var themeId: String?
)
