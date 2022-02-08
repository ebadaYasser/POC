package com.check.remote.mapper

import com.check.data.models.FieldEntity
import com.check.remote.model.FormResponse

class FieldResponseMapper(private val mapper: ConditionViewResponseMapper) :
    ResponseMapper<FormResponse.Data.Field, FieldEntity> {
    override fun mapFromModel(model: FormResponse.Data.Field?): FieldEntity {
        return FieldEntity(
            model?.arLabel,
            model?.values,
            model?.arPlaceholder,
            model?.conditionalView?.let { mapper.mapFromModel(it) },
            model?.controlType,
            model?.enLabel,
            model?.enPlaceholder,
            model?.fieldOrder,
            model?.hasAttachments,
            model?.hasNotes,
            model?.id,
            model?.regex,
            model?.required,
            model?.responsibleUnit,
            model?.sectionId,
            model?.severityLevel,
            model?.templateQuestionId,
            model?.visibilityView,
            model?.childFields
        )
    }
}