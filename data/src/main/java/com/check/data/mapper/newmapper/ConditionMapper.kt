package com.check.data.mapper.newmapper

import com.check.data.mapper.Mapper
import com.check.data.models.newestrespone.ConditionEntity
import com.check.domain.models.newestresponse.Condition


class ConditionMapper : Mapper<ConditionEntity, Condition> {
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