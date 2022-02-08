package com.check.remote.mapper

import com.check.data.models.ConditionEntity
import com.check.remote.model.FormResponse

class ConditionResponseMapper :
    ResponseMapper<FormResponse.Data.Field.ConditionalView.Condition, ConditionEntity> {
    override fun mapFromModel(model: FormResponse.Data.Field.ConditionalView.Condition?): ConditionEntity {
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