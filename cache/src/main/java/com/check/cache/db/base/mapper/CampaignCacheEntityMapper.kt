package com.check.cache.db.base.mapper

import com.check.cache.db.entities.CampaignCacheEntity
import com.check.data.models.newestrespone.CampaignEntity

class CampaignCacheEntityMapper(
    private val headerCacheEntityMapper: HeaderCacheEntityMapper
) : CacheDataMapper<CampaignCacheEntity, CampaignEntity> {
    override fun mapToCache(data: CampaignEntity): CampaignCacheEntity {
        return CampaignCacheEntity(
            headerCacheEntityMapper.mapToCache(data.header!!))
    }

    override fun mapFromCache(cache: CampaignCacheEntity): CampaignEntity {
        return CampaignEntity(
            headerCacheEntityMapper.mapFromCache(cache.header!!)
        )
    }
}