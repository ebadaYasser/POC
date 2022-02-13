package com.check.domain.repository

import com.check.domain.models.newestresponse.NewField
import com.check.domain.models.newestresponse.WorkItem
import io.reactivex.Completable
import io.reactivex.Single


interface FormRepository {
    fun getWorkItems(): Single<WorkItem>
    fun saveWorkItem(workItem: WorkItem): Completable
    fun saveForm(form: List<NewField>): Completable
    fun saveValue(
        values: MutableList<String>?,
        formId: String?,
        fieldId: String?
    ): Completable

    fun getWorkItem(formId :String): Single<WorkItem>
}