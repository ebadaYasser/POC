package com.check.domain.repository

import com.check.domain.models.Field
import io.reactivex.Completable


interface FormRepository {

    fun getForm(): List<Field>
    fun saveDataToCache(field: Field): Completable
}