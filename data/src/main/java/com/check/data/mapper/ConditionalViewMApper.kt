package com.check.data.mapper

import com.check.data.models.ConditionalViewEntity
import com.check.domain.models.ConditionalView

class ConditionalViewMApper(private val mapper: ConditionMapper) :
    Mapper<ConditionalViewEntity, ConditionalView> {
    override fun mapFromEntity(type: ConditionalViewEntity?): ConditionalView {
        return ConditionalView(
            type?.action,
            type?.conditions?.map { mapper.mapFromEntity(it) },
            type?.operator,
            type?.conditionsSize
        )
    }

    override fun mapToEntity(type: ConditionalView?): ConditionalViewEntity {
        return ConditionalViewEntity(
            type?.action,
            type?.conditions?.map { mapper.mapToEntity(it) },
            type?.operator,
            type?.conditionsSize
        )
    }
}