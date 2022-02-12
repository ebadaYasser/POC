package com.check.data.remote

import com.check.data.models.newestrespone.WorkItemEntity
import io.reactivex.Single

interface FormRemote {
//    fun getForm(): List<FieldEntity>
    fun getWorkItem(): Single<WorkItemEntity>
}