package com.check.domain.repository

import com.check.domain.models.Field


interface FormRepository {

    fun getForm(): List<Field>

    suspend fun saveDataToCache(field:Field)
}