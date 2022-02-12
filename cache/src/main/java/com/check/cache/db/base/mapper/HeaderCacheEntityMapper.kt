package com.check.cache.db.base.mapper

import com.check.cache.db.entities.HeaderCacheEntity
import com.check.data.models.newestrespone.HeaderEntity

class HeaderCacheEntityMapper : CacheDataMapper<HeaderCacheEntity, HeaderEntity> {
    override fun mapToCache(data: HeaderEntity): HeaderCacheEntity {
        return HeaderCacheEntity(
            data.description,
            data.logo,
            data.showQuestionCount,
            data.title
        )
    }

    override fun mapFromCache(cache: HeaderCacheEntity): HeaderEntity {
        return HeaderEntity(
            cache.description,
            cache.logo,
            cache.showQuestionCount,
            cache.title
        )
    }

}