package com.check.cache.db.base.mapper

import com.check.cache.db.entities.ConditionCacheEntity
import com.check.cache.db.entities.ConditionalViewCacheEntity
import com.check.data.models.newestrespone.ConditionalViewEntity

class ConditionalViewCacheEntityMapper(private val mapper: ConditionCacheEntityMapper) :
    CacheDataMapper<ConditionalViewCacheEntity, ConditionalViewEntity> {
    override fun mapToCache(data: ConditionalViewEntity): ConditionalViewCacheEntity {
        return ConditionalViewCacheEntity(
            data.action,
            data.conditions?.map { mapper.mapToCache(it) },
            data.operator,
        )
    }

    override fun mapFromCache(cache: ConditionalViewCacheEntity): ConditionalViewEntity {
        return ConditionalViewEntity(
            cache.action,
            cache.conditions?.map { mapper.mapFromCache(it!!) },
            cache.operator,
        )
    }

}