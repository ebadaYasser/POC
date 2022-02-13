package com.check.data.cache


import com.check.data.models.newestrespone.NewFieldEntity
import com.check.data.models.newestrespone.WorkItemEntity
import com.check.domain.models.newestresponse.WorkItem

import io.reactivex.Completable
import io.reactivex.Single

interface FormCache {
    fun saveDataToCache(field: NewFieldEntity): Completable
    fun saveWorkITem(workItemEntity: WorkItemEntity): Completable
    fun saveForm(form: List<NewFieldEntity>): Completable
    fun saveValue(
        values: MutableList<String>?,
        formId: String?,
        fieldId: String?
    ): Completable

    fun getWorkITem(formId: String?): Single<WorkItemEntity>
}