package com.check.data.mapper

import com.check.data.models.FieldEntity
import com.check.domain.models.Field

class FieldMapper(private val mapper: ConditionalViewMApper) : Mapper<FieldEntity, Field> {
    override fun mapFromEntity(type: FieldEntity?): Field {
        return Field(
            type?.arLabel,
            type?.values,
            type?.arPlaceholder,
            type?.conditionalView?.let { mapper.mapFromEntity(it) },
            type?.controlType,
            type?.enLabel,
            type?.enPlaceholder,
            type?.fieldOrder,
            type?.hasAttachments,
            type?.hasNotes,
            type?.id,
            type?.regex,
            type?.required,
            type?.responsibleUnit,
            type?.sectionId,
            type?.severityLevel,
            type?.templateQuestionId,
            type?.visibilityView,
            type?.childFields
        )
    }

    override fun mapToEntity(type: Field?): FieldEntity {
        return FieldEntity(
            type?.arLabel,
            type?.values,
            type?.arPlaceholder,
            type?.conditionalView?.let { mapper.mapToEntity(it) },
            type?.controlType,
            type?.enLabel,
            type?.enPlaceholder,
            type?.fieldOrder,
            type?.hasAttachments,
            type?.hasNotes,
            type?.id,
            type?.regex,
            type?.required,
            type?.responsibleUnit,
            type?.sectionId,
            type?.severityLevel,
            type?.templateQuestionId,
            type?.visibilityView,
            type?.childFields
        )
    }
}