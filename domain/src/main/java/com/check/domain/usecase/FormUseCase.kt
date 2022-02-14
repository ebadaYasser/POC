package com.check.domain.usecase

import com.check.domain.models.newestresponse.NewField
import com.check.domain.models.newestresponse.WorkItem
import com.check.domain.repository.FormRepository
import io.reactivex.Single

class FormUseCase(private val formRepository: FormRepository) {
    fun getWorkItem(): Single<WorkItem> {
        return Single.defer {
            Single.just(formRepository.getWorkItems())
        }
    }

    fun saveWorkItem(workItem: WorkItem) = formRepository.saveWorkItem(workItem)
    fun saveForm(form: List<NewField>) = formRepository.saveForm(form)
    fun saveValue(
        values: MutableList<String>?,
        formId: String?,
        fieldId: String?
    ) = formRepository.saveValue(values, formId, fieldId)

    fun getWorkitem(formId: String) = formRepository.getWorkItem(formId)
}