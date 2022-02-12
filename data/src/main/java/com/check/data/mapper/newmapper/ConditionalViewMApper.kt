package com.check.data.mapper.newmapper

import com.check.data.mapper.Mapper
import com.check.data.models.newestrespone.ConditionalViewEntity
import com.check.domain.models.newestresponse.ConditionalView


class ConditionalViewMApper(private val mapper: ConditionMapper) :
    Mapper<ConditionalViewEntity, ConditionalView> {
    override fun mapFromEntity(type: ConditionalViewEntity?): ConditionalView {
        return ConditionalView(
            type?.action,
            type?.conditions?.map { mapper.mapFromEntity(it) },
            type?.operator
        )
    }

    override fun mapToEntity(type: ConditionalView?): ConditionalViewEntity {
        return ConditionalViewEntity(
            type?.action,
            type?.conditions?.map { mapper.mapToEntity(it) },
            type?.operator
        )
    }


}