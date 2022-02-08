package com.check.data.cache

import com.check.data.models.FieldEntity

interface FormCache {
    suspend fun saveDataToCache(field: FieldEntity)

}