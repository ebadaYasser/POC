package com.check.data.mapper.newmapper

import com.check.data.mapper.Mapper
import com.check.data.models.newestrespone.NewFieldEntity
import com.check.domain.models.newestresponse.NewField

class NewFieldMapper(
    private val conditionalViewMApper: ConditionalViewMApper
) : Mapper<NewFieldEntity, NewField> {
    override fun mapFromEntity(type: NewFieldEntity?): NewField {
        return NewField(
            type?.arLabel,
            type?.arPlaceholder,
            conditionalViewMApper.mapFromEntity(type?.conditionalView),
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
            type?.values,
            type?.workItemId
        )
    }

    override fun mapToEntity(type: NewField?): NewFieldEntity {
        return NewFieldEntity(
            type?.arLabel,
            type?.arPlaceholder,
            conditionalViewMApper.mapToEntity(type?.conditionalView),
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
            type?.values,
            type?.workItemId
        )
    }
}