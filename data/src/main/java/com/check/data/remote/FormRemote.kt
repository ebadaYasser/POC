package com.check.data.remote

import com.check.data.models.FieldEntity

interface FormRemote {
    fun getForm(): List<FieldEntity>
}