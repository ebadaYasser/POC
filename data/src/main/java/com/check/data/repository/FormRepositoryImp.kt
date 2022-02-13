package com.check.data.repository

import com.check.data.cache.FormCache
import com.check.data.mapper.newmapper.NewFieldMapper
import com.check.data.mapper.newmapper.WorkItemMapper
import com.check.data.models.newestrespone.WorkItemEntity
import com.check.data.remote.FormRemote
import com.check.domain.models.newestresponse.NewField
import com.check.domain.models.newestresponse.WorkItem
import com.check.domain.repository.FormRepository
import io.reactivex.Completable
import io.reactivex.Single

class FormRepositoryImp(
    private val formRemote: FormRemote,
    private val formCache: FormCache,
    private val workItemMapper: WorkItemMapper,
    private val fieldMapper: NewFieldMapper
) :
    FormRepository {

    override fun getWorkItems(): Single<WorkItem> {
        return formRemote.getWorkItem().map { workItemMapper.mapFromEntity(it) }
    }

    override fun saveWorkItem(workItem: WorkItem): Completable {
        return formCache.saveWorkITem(workItemMapper.mapToEntity(workItem))
    }

    override fun saveForm(form: List<NewField>): Completable {
        return formCache.saveForm(form.map { fieldMapper.mapToEntity(it) })
    }

    override fun saveValue(
        values: MutableList<String>?,
        formId: String?,
        fieldId: String?
    ): Completable {
        return formCache.saveValue(values, formId, fieldId)
    }

    override fun getWorkItem(formId: String): Single<WorkItem> {
        return formCache.getWorkITem(formId).map { workItemMapper.mapFromEntity(it) }
    }

}