package com.check.data.mapper

import com.check.data.models.ConditionEntity
import com.check.domain.models.Condition

class ConditionMapper: Mapper<ConditionEntity, Condition> {
    override fun mapFromEntity(type: ConditionEntity?): Condition {
        return Condition(
            type?.arErrorMsg,
            type?.conditionType,
            type?.enErrorMsg,
            type?.linkedFieldId,
            type?.validatorValue,
            type?.isConditionPassed
        )
    }

    override fun mapToEntity(type: Condition?): ConditionEntity {
        return ConditionEntity(
            type?.arErrorMsg,
            type?.conditionType,
            type?.enErrorMsg,
            type?.linkedFieldId,
            type?.validatorValue,
            type?.isConditionPassed
        )
    }
}