package com.check.data.cache

import com.check.data.models.FieldEntity
import io.reactivex.Completable

interface FormCache {
    fun saveDataToCache(field: FieldEntity): Completable

}