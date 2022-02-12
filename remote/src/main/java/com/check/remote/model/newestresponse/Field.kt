package com.check.remote.model.newestresponse


import com.google.gson.annotations.SerializedName

data class Field(
    @SerializedName("ArLabel")
    var arLabel: String?,
    @SerializedName("ArPlaceholder")
    var arPlaceholder: String?,
    @SerializedName("ConditionalView")
    var conditionalView: ConditionalView?,
    @SerializedName("ControlType")
    var controlType: String?,
    @SerializedName("EnLabel")
    var enLabel: String?,
    @SerializedName("EnPlaceholder")
    var enPlaceholder: String?,
    @SerializedName("FieldOrder")
    var fieldOrder: Int?,
    @SerializedName("HasAttachments")
    var hasAttachments: Boolean?,
    @SerializedName("HasNotes")
    var hasNotes: Boolean?,
    @SerializedName("Id")
    var id: String?,
    @SerializedName("Regex")
    var regex: String?,
    @SerializedName("Required")
    var required: Boolean?,
    @SerializedName("ResponsibleUnit")
    var responsibleUnit: String?,
    @SerializedName("SectionId")
    var sectionId: String?,
    @SerializedName("SeverityLevel")
    var severityLevel: String?,
    @SerializedName("TemplateQuestionId")
    var templateQuestionId: String?,
    @SerializedName("VisibilityView")
    var visibilityView: List<String>?,
    @SerializedName("values")
    var values: MutableList<String>
)