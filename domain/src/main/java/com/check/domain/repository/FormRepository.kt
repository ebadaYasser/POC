package com.check.domain.repository

import com.check.domain.models.Field
import io.reactivex.Completable
import io.reactivex.Single


interface FormRepository {

    fun getForm(): List<Field>
    fun saveDataToCache(field: Field): Completable
    fun getFields(fieldId: String): Single<List<Field>>
}