package com.check.remote.model


import com.google.gson.annotations.SerializedName
import androidx.room.Entity

data class FormResponse(
  @SerializedName("Data")
  val data: Data,
  @SerializedName("ErrorAr")
  val errorAr: String,
  @SerializedName("ErrorEn")
  val errorEn: String,
  @SerializedName("Success")
  val success: Boolean
) {
  data class Data(
    @SerializedName("Fields")
    val fields: List<Field>
  ) {

    @Entity(tableName = "Field")
    data class Field(
      @SerializedName("ArLabel")
      val arLabel: String,
      var values: MutableList<String>? = null,
      @SerializedName("ArPlaceholder")
    val arPlaceholder: String,

    @SerializedName("ConditionalView")
    val conditionalView: ConditionalView? = null,

    @SerializedName("ControlType")
    val controlType: String,

    @SerializedName("EnLabel")
    val enLabel: String,

    @SerializedName("EnPlaceholder")
    val enPlaceholder: String,

    @SerializedName("FieldOrder")
    val fieldOrder: Int,

    @SerializedName("HasAttachments")
    val hasAttachments: Boolean,

    @SerializedName("HasNotes")
    val hasNotes: Boolean,

    @SerializedName("Id")
    val id: String,

    @SerializedName("Regex")
    val regex: String,

    @SerializedName("Required")
    val required: Boolean,

    @SerializedName("ResponsibleUnit")
    val responsibleUnit: String,

    @SerializedName("SectionId")
    val sectionId: String,

    @SerializedName("SeverityLevel")
    val severityLevel: String,

    @SerializedName("TemplateQuestionId")
    val templateQuestionId: String,

    @SerializedName("VisibilityView")
    val visibilityView: List<String>,
    var childFields: MutableList<String>? = null
    )
    {
      data class ConditionalView(
        @SerializedName("Action")
        var action: String,
        @SerializedName("Conditions")
        val conditions: List<Condition>? = null,
        @SerializedName("Operator")
        val `operator`: String,
        var conditionsSize: Int = 0
      ) {
        data class Condition(
          @SerializedName("ArErrorMsg")
          val arErrorMsg: String,
          @SerializedName("ConditionType")
          val conditionType: String,
          @SerializedName("EnErrorMsg")
          val enErrorMsg: String,
          @SerializedName("LinkedFieldId")
          val linkedFieldId: String,
          @SerializedName("ValidatorValue")
          val validatorValue: String,
          var isConditionPassed: Boolean = false

        )
      }
    }
  }
}