package com.check.cache.db.base.mapper

import com.check.cache.db.entities.ConditionCacheEntity
import com.check.data.models.newestrespone.ConditionEntity

class ConditionCacheEntityMapper : CacheDataMapper<ConditionCacheEntity, ConditionEntity> {
    override fun mapToCache(data: ConditionEntity): ConditionCacheEntity {
        return ConditionCacheEntity(
            data.arErrorMsg,
            data.conditionType,
            data.enErrorMsg,
            data.linkedFieldId,
            data.validatorValue,
            data.isConditionPassed
        )
    }

    override fun mapFromCache(cache: ConditionCacheEntity): ConditionEntity {
        return ConditionEntity(
            cache.arErrorMsg,
            cache.conditionType,
            cache.enErrorMsg,
            cache.linkedFieldId,
            cache.validatorValue,
            cache.isConditionPassed
        )
    }
}