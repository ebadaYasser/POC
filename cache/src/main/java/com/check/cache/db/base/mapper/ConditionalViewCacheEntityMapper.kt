package com.check.cache.db.base.mapper

import com.check.cache.db.entities.ConditionalViewCacheEntity
import com.check.data.models.ConditionalViewEntity

class ConditionalViewCacheEntityMapper(private val mapper:ConditionCacheEntityMapper):CacheDataMapper<ConditionalViewCacheEntity, ConditionalViewEntity> {
    override fun mapToCache(data: ConditionalViewEntity): ConditionalViewCacheEntity {
        return ConditionalViewCacheEntity(data.action,
            data.conditions?.map { it?.let { it1 -> mapper.mapToCache(it1) } },
            data.`operator`,
            data.conditionsSize)
    }

    override fun mapFromCache(cache: ConditionalViewCacheEntity): ConditionalViewEntity {
        return ConditionalViewEntity(cache.action,
            cache.conditions?.map { it?.let { it1 -> mapper.mapFromCache(it1) } },
            cache.`operator`,
            cache.conditionsSize)
    }
}