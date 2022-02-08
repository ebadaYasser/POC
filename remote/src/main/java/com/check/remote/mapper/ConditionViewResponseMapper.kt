package com.check.remote.mapper

import com.check.data.models.ConditionalViewEntity
import com.check.remote.model.FormResponse

class ConditionViewResponseMapper(private val conditionMapper: ConditionResponseMapper): ResponseMapper<FormResponse.Data.Field.ConditionalView,ConditionalViewEntity> {
    override fun mapFromModel(model: FormResponse.Data.Field.ConditionalView?): ConditionalViewEntity {
        return ConditionalViewEntity(
            model?.action,
            model?.conditions?.map { conditionMapper.mapFromModel(it) },
            model?.operator,
            model?.conditionsSize
        )
    }
}