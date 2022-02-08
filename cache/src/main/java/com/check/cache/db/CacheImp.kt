package com.check.cache.db

import com.check.cache.db.base.mapper.FieldCacheEntityMapper
import com.check.cache.db.dao.FieldDao
import com.check.data.cache.FormCache
import com.check.data.models.FieldEntity
import io.reactivex.Completable
import kotlinx.coroutines.coroutineScope

class CacheImp(private val mapper: FieldCacheEntityMapper, private val dao: FieldDao) : FormCache {
    override fun saveDataToCache(field: FieldEntity): Completable {
        return Completable.defer {
            dao.insertFields(mapper.mapToCache(field))
            Completable.complete()
        }

    }

}