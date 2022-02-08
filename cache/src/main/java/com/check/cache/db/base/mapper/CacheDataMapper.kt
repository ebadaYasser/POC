package com.check.cache.db.base.mapper

interface CacheDataMapper<C,D> {
    fun mapToCache(data:D):C
    fun mapFromCache(cache:C):D
}