package com.check.remote.mapper

import com.check.data.models.newestrespone.ConditionalViewEntity
import com.check.remote.model.newestresponse.ConditionalView


class ConditionViewResponseMapper(private val conditionMapper: ConditionResponseMapper): ResponseMapper<ConditionalView, ConditionalViewEntity> {
    override fun mapFromModel(model: ConditionalView?): ConditionalViewEntity {
        return ConditionalViewEntity(
            model?.action,
            model?.conditions?.map { conditionMapper.mapFromModel(it) },
            model?.operator
        )
    }
}