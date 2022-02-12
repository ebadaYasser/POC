package com.check.remote.mapper.newmapper

import com.check.data.models.newestrespone.ConditionEntity
import com.check.remote.mapper.ResponseMapper
import com.check.remote.model.newestresponse.Condition

class ConditionMapper: ResponseMapper<Condition,ConditionEntity> {
    override fun mapFromModel(model: Condition?): ConditionEntity {
        return ConditionEntity(
            model?.arErrorMsg,
            model?.conditionType,
            model?.enErrorMsg,
            model?.linkedFieldId,
            model?.validatorValue,
            model?.isConditionPassed
        )
    }
}