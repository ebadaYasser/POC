package com.check.remote.mapper

import com.check.data.models.newestrespone.ConditionEntity
import com.check.remote.model.newestresponse.Condition

class ConditionResponseMapper :
    ResponseMapper<Condition, ConditionEntity> {
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