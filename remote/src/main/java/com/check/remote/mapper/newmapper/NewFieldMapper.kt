package com.check.remote.mapper.newmapper

import com.check.data.models.newestrespone.NewFieldEntity
import com.check.remote.mapper.ResponseMapper
import com.check.remote.model.newestresponse.Field

class NewFieldMapper(
    private val conditionalViewMapper: ConditionalViewMapper
) : ResponseMapper<Field, NewFieldEntity> {
    override fun mapFromModel(model: Field?): NewFieldEntity {
        return NewFieldEntity(
            model?.arLabel,
            model?.arPlaceholder,
            conditionalViewMapper.mapFromModel(model?.conditionalView),
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
            model?.values,
            ""
        )
    }

}