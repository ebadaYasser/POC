package com.check.cache.db

import com.check.cache.db.base.mapper.FieldCacheEntityMapper
import com.check.cache.db.dao.FieldDao
import com.check.data.cache.FormCache
import com.check.data.models.FieldEntity

class CacheImp(private val mapper: FieldCacheEntityMapper,private val dao: FieldDao) : FormCache {
    override suspend fun saveDataToCache(field: FieldEntity) {
        dao.insertFields(mapper.mapToCache(field))
    }
}