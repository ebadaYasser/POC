package com.check.data.repository

import com.check.data.cache.FormCache
import com.check.data.mapper.FieldMapper
import com.check.data.remote.FormRemote
import com.check.domain.models.Field
import com.check.domain.repository.FormRepository
import io.reactivex.Completable

class FormRepositoryImp(
    private val formRemote: FormRemote, private val mapper: FieldMapper,
    private val formCache: FormCache
) :
    FormRepository {
    override fun getForm(): List<Field> {
        return formRemote.getForm().map { mapper.mapFromEntity(it) }
    }

    override fun saveDataToCache(field: Field): Completable {
        return formCache.saveDataToCache(mapper.mapToEntity(field))

    }

}