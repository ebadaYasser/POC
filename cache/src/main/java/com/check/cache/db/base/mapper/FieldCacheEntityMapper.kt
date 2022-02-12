package com.check.cache.db.base.mapper

import com.check.cache.db.entities.FieldCacheEntity
import com.check.data.models.newestrespone.NewFieldEntity


class FieldCacheEntityMapper(private val mapper: ConditionalViewCacheEntityMapper) :
    CacheDataMapper<FieldCacheEntity, NewFieldEntity> {
    override fun mapToCache(data: NewFieldEntity): FieldCacheEntity {
        return FieldCacheEntity(
            data.arLabel,
            data.arPlaceholder,
            mapper.mapToCache(data.conditionalView!!),
            data.controlType,
            data.enLabel,
            data.enPlaceholder,
            data.fieldOrder,
            data.hasAttachments,
            data.hasNotes,
            data.id!!,
            data.regex,
            data.required,
            data.responsibleUnit,
            data.sectionId,
            data.severityLevel,
            data.templateQuestionId,
            data.visibilityView,
            data.values,
            data.workItemId
        )
    }

    override fun mapFromCache(cache: FieldCacheEntity): NewFieldEntity {
        return NewFieldEntity(
            cache.arLabel,
            cache.arPlaceholder,
            mapper.mapFromCache(cache.conditionalView!!),
            cache.controlType,
            cache.enLabel,
            cache.enPlaceholder,
            cache.fieldOrder,
            cache.hasAttachments,
            cache.hasNotes,
            cache.id,
            cache.regex,
            cache.required,
            cache.responsibleUnit,
            cache.sectionId,
            cache.severityLevel,
            cache.templateQuestionId,
            cache.visibilityView,
            cache.values,
            cache.workItemId
        )
    }

}
