package com.check.cache.db.base.mapper

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.check.cache.db.entities.ConditionCacheEntity
import com.check.cache.db.entities.FieldCacheEntity
import com.check.data.models.ConditionEntity
import com.check.data.models.FieldEntity


 class FieldCacheEntityMapper(private val mapper:ConditionalViewCacheEntityMapper):CacheDataMapper<FieldCacheEntity, FieldEntity> {
    override fun mapToCache(data: FieldEntity): FieldCacheEntity {

        return data.id?.let {
            FieldCacheEntity(data.arLabel,

                data.controlType,
                data.enLabel,
                data.fieldOrder,
                data.hasAttachments,
                data.hasNotes ,
                it,
                data.regex,
                data.required)
        }!!

//        return FieldCacheEntity(data.arLabel,
//        data.values,
//        data.arPlaceholder,
//        data.conditionalView,
//        data.controlType,
//        data.enLabel,
//        data.enPlaceholder as Int?,
//        data.fieldOrder,
//        data.hasAttachments,
//        data.hasNotes ,
//        data.id,
//        data.regex,
//        data.required,
//        data.responsibleUnit,
//        data.sectionId,
//        data.severityLevel,
//        data.templateQuestionId as List<Any?>?,
//        data.visibilityView as MutableList<String>?,
//        data.childFields)
    }

    override fun mapFromCache(cache: FieldCacheEntity): FieldEntity {
        return FieldEntity(cache.arLabel,
            null,
            null,
            null,
            cache.controlType,
            cache.enLabel,
            null,
            cache.fieldOrder,
            cache.hasAttachments,
            cache.hasNotes,
            cache.id,
            cache.regex,
            cache.required,
            null,
            null,
            null,
            null,
            null,
            null)

//        return FieldEntity(cache.arLabel,
//        cache.values,
//        cache.arPlaceholder,
//        cache.conditionalView,
//        cache.controlType,
//        cache.enLabel,
//        cache.enPlaceholder,
//        cache.fieldOrder,
//        cache.hasAttachments,
//        cache.hasNotes,
//        cache.id,
//        cache.regex,
//        cache.required,
//        cache.responsibleUnit,
//        cache.sectionId,
//        cache.severityLevel,
//        cache.templateQuestionId,
//        cache.visibilityView,
//        cache.childFields)
    }
}
