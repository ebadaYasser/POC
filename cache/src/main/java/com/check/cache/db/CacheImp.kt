package com.check.cache.db

import com.check.cache.db.base.mapper.FieldCacheEntityMapper
import com.check.cache.db.base.mapper.WorkItemCachEntityMapper
import com.check.cache.db.dao.FieldDao
import com.check.cache.db.entities.Value
import com.check.data.cache.FormCache
import com.check.data.models.newestrespone.NewFieldEntity
import com.check.data.models.newestrespone.WorkItemEntity
import io.reactivex.Completable
import io.reactivex.CompletableConverter
import io.reactivex.Single

class CacheImp(
    private val mapper: FieldCacheEntityMapper,
    private val dao: FieldDao,
    private val workItemCachEntityMapper: WorkItemCachEntityMapper
) : FormCache {
    override fun saveDataToCache(field: NewFieldEntity): Completable {
        return Completable.complete()
    }

    override fun saveWorkITem(workItemEntity: WorkItemEntity): Completable {
        return Completable.defer {
            dao.saveWorkItem(workItemCachEntityMapper.mapToCache(workItemEntity))
            Completable.complete()
        }
    }

    override fun saveForm(form: List<NewFieldEntity>): Completable {
        return Completable.defer {
            dao.saveForm(form.map { mapper.mapToCache(it) })
            Completable.complete()
        }
    }

    override fun saveValue(
        values: MutableList<String>?,
        formId: String?,
        fieldId: String?
    ): Completable {
        val value = Value(values, formId, fieldId!!)
        return Completable.defer {
            dao.saveValue(value)
            Completable.complete()
        }
    }

}


