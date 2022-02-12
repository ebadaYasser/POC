package com.check.remote.mapper.newmapper

import com.check.data.models.newestrespone.ConditionalViewEntity
import com.check.remote.mapper.ResponseMapper
import com.check.remote.model.newestresponse.ConditionalView

class ConditionalViewMapper(
    private val conditionMapper: ConditionMapper
) : ResponseMapper<ConditionalView, ConditionalViewEntity> {
    override fun mapFromModel(model: ConditionalView?): ConditionalViewEntity {
        return ConditionalViewEntity(
            model?.action,
            model?.conditions?.map { conditionMapper.mapFromModel(it) },
            model?.operator
        )
    }
}