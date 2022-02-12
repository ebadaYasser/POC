package com.check.cache.db.base.mapper

import com.check.cache.db.entities.SubmissionMessageCacheEntity
import com.check.data.models.newestrespone.SubmissionMessageEntity

class SubmissionMessageCacheEntityMapper :
    CacheDataMapper<SubmissionMessageCacheEntity, SubmissionMessageEntity> {
    override fun mapToCache(data: SubmissionMessageEntity): SubmissionMessageCacheEntity {
        return SubmissionMessageCacheEntity(
            data.description,
            data.logo,
            data.showQuestionCount,
            data.title
        )
    }

    override fun mapFromCache(cache: SubmissionMessageCacheEntity): SubmissionMessageEntity {
        return SubmissionMessageEntity(
            cache.description,
            cache.logo,
            cache.showQuestionCount,
            cache.title
        )
    }
}