package com.check.remote.model.newestresponse


import com.google.gson.annotations.SerializedName

data class NewResponse(
    @SerializedName("Data")
    var workItem: WorkItem?,
    @SerializedName("ErrorAr")
    var errorAr: Any?,
    @SerializedName("ErrorEn")
    var errorEn: Any?,
    @SerializedName("Success")
    var success: Boolean?
)