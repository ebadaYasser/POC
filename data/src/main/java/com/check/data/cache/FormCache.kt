package com.check.data.cache

import com.check.data.models.FieldEntity
import com.check.domain.models.Field
import io.reactivex.Completable
import io.reactivex.Single

interface FormCache {
    fun saveDataToCache(field: FieldEntity): Completable
    fun getCachedFields(fieldId: String): Single<List<FieldEntity>>
}