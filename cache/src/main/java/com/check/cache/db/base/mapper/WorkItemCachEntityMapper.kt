package com.check.cache.db.base.mapper

import com.check.cache.db.entities.CampaignCacheEntity
import com.check.cache.db.entities.WorkItemCacheEntity
import com.check.data.models.newestrespone.WorkItemEntity

class WorkItemCachEntityMapper(
    private val campaignCacheEntityMapper: CampaignCacheEntityMapper
) : CacheDataMapper<WorkItemCacheEntity, WorkItemEntity> {
    override fun mapToCache(data: WorkItemEntity): WorkItemCacheEntity {
        return WorkItemCacheEntity(
            campaignCacheEntityMapper.mapToCache(data.campaign!!),
            data.id!!,
            data.score,
            data.templateId,
            data.themeId
        )
    }

    override fun mapFromCache(cache: WorkItemCacheEntity): WorkItemEntity {
        return WorkItemEntity(
            campaignCacheEntityMapper.mapFromCache(cache.campaign!!),
            listOf(),
            cache.id,
            cache.score,
            cache.templateId,
            cache.themeId
        )
    }
}